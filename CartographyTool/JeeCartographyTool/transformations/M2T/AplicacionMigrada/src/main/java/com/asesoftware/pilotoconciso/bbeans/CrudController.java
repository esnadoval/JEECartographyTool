package com.asesoftware.pilotoconciso.bbeans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.persistence.Parameter;
import javax.persistence.Query;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.context.RequestContext;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import com.asesoftware.pilotoconciso.persistence.controller.PersistenceManager; 

/**
 * Controlador global de funciones CRUD (Create, Retrieve, Update, Delete).
 *
 * @author cadmilo at <cadmilo@gmail.com>
 * @param <T> La clase de entidades que maneja el controlador
 * @param <I> La clase que mantendra la información del controlador entre
 * peticiones
 */
public class CrudController<T, I, ID> extends FacesBean {

    // Atributos
    /**
     * Modelo de la tabla generado dinamicamente por el controlador
     */
    private LazyDatabaseDataModel dModel;
    /**
     * El objeto actual
     */
    protected T co;
    /**
     * Información persistente entre peticiones
     */
    protected I info;
    /**
     * Id del objeto actual
     */
    protected ID idSelected; 
    
    /**
     * Lista de la información actual
     */
    protected List<T> data;
    /**
     * Utilidad para el manejo de las listas y el cache
     */  
    //@ManagedProperty(value = "#{lUtils}")
    //protected UILists lists;

    /**
     * El manejador de persistencia
     */
    @EJB
    PersistenceManager pManager;
    /**
     * La clase que administra el controlador
     */
    protected Class<T> entityClass;
    /**
     * La clase que contiene los atributos que serán almacenados en el
     *
     * @ViewScope
     */
    protected Class<I> infoClass;
    /**
     * Indica si se debe vaciar el manejador de cache del tipo de entidad
     * manejada
     */
    protected boolean clearCacheOnSave = false;
    /**
     * Sentencia JPQL que especifica la creación de los objetos por parte del
     * manejador de persitencia
     */
    protected String defaultObjectConstructor;
    /**
     * Sentencia JQPL que especifica el orden por defecto que tendran
     */
    protected String defaultOrder;
    /**
     * Mapa donde se especifca según el nombre del atributo de la entidad
     * (almanceado en la llave) el tipo de filtro que se utilizará por ejemplo
     * text (almanceado en en el) Esta información será utilizada para generar
     * la consulta dinamica de la lista de objetos
     */
    protected HashMap<String, String> filterTypes = new HashMap();

    /**
     * Constructor por defecto.
     */
    public CrudController() {
    }

    /**
     * Posiciona el objeto actual (co) utilizando el parametro id
     */
    public void setCurrentObject() {
        ID id = (ID) getFacesContext().getExternalContext().getRequestParameterMap().get("id");
        try {
            if (id != null && !id.toString().isEmpty()) {
                setCo((T) pManager.find(entityClass, id));
                idSelected = id;
                afterMove();
            }
        } catch (Exception ex) {
            setCo(null);
        }
        if (getCo() == null) {
            if (entityClass != null) {
                try {
                    setCo(entityClass.newInstance());
                    idSelected = null;
                } catch (Exception ex) {
                    Logger.getLogger(CrudController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * Realiza el proceso de inicialización del controlador. Restaura la
     * información del controlador en el atributo info desde el
     *
     * @ViewScoped si se ha especificado el atributo infoClass
     */
    @PostConstruct
    public void start() {
        if (infoClass != null) {
            Object obj = getFacesContext().getViewRoot().getViewMap().get(this.getClass().getSimpleName() + "Info");
            if (obj == null) {
                try {
                    info = infoClass.newInstance();
                    getFacesContext().getViewRoot().getViewMap().put(this.getClass().getSimpleName() + "Info", info);
                } catch (InstantiationException ex) {
                    Logger.getLogger(CrudController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CrudController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                info = (I) obj;
            }
        }
        setCurrentObject();
        init();
        dModel = new LazyDatabaseDataModel();
    }

    /**
     * Método de inicialización. Este método es sobreescrito por los
     * controladores que heredan de esta clase.
     */
    public void init() {
    }

    /**
     * Crea un nuevo registro vacio.
     */
    public void createNew() {
        try {
            setCo((T) entityClass.newInstance());
            idSelected = null;
        } catch (InstantiationException ex) {
            Logger.getLogger(CrudController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CrudController.class.getName()).log(Level.SEVERE, null, ex);
        }
        afterCreateNew();
    }

    /**
     * Crea un nuevo registro en la lista.
     */
    public void create() {
        try {
            preCreate();
            preSave();
            pManager.create(getCo());
            info("El registro se ha creado con exito.");
            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PrimeFaces.widgets.editDlg.hide(); newRow=true;");
            context.update("frmView");
            postCreate();
            postSave();
            /*
            if (clearCacheOnSave) {
                lists.clearCache(getCo());
            }
            */
        } catch (Exception ex) {
            error("Error creando un nuevo registro " + ex.getMessage());
        }
    }

    /**
     * Actualiza un elemento de la lista.
     */
    public void update() {
        try {
            preSave();
            preUpdate();
            pManager.update(getCo());
            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PrimeFaces.widgets.editDlg.hide(); newRow=false;");
            context.update("frmView");
            info("El registro ha sido actualizado con exito.");
            postUpdate();
            postSave();
            //Clear cache
            /*
            if (clearCacheOnSave) {
                lists.clearCache(getCo());
            }
            */
        } catch (Exception ex) {
            RequestContext.getCurrentInstance().addCallbackParam("validationFailed", "true");
            error("Error actualizando el registro: \n" + ex.getMessage());
        }
    }

    /**
     * Mueve un elemento de la lista.
     */
    public void move() {
        RequestContext.getCurrentInstance().execute("newRow=false;");
        setCo((T) pManager.find(getCo().getClass(), idSelected));
        afterMove();
        RequestContext.getCurrentInstance().update("frmEdit");
    }

    /**
     * Método que se ejecuta después de que se cambia el objeto actual (co).
     * Este método es sobreescrito por los controladores que heredan de esta
     * clase.
     */
    public void afterMove() {
    }

    /**
     * Elimina un elemento de la lista.
     */
    public void delete() {
        try {
            pManager.delete(getCo().getClass(), idSelected);
            info("El registro ha sido eliminado de forma exitosa.");
        } catch (Exception ex) {
            RequestContext.getCurrentInstance().execute("alert('Error eliminado el registro. Verifique que el registro no tenga información relacionada.')");
        }
    }

    /**
     * Obtiene los datos de la lista.
     *
     * @return List data
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Setter para los datos de la lista.
     *
     * @param List data
     */
    public void setData(List data) {
        this.data = data;
    }

    /**
     * Obtiene el identificador del elemento seleccionado.
     *
     * @return ID idSelected
     */
    public ID getIdSelected() {
        return idSelected;
    }

    /**
     * Setter para identificador del elemento seleccionado.
     *
     * @param int idSelected
     */
    public void setIdSelected(ID idSelected) {
        this.idSelected = idSelected;
    }

    /**
     * Obtiene el modelo de la tabla
     *
     * @return El modelo lazy de consulta de la información para la tabla de la
     * interfaz
     */
    public LazyDatabaseDataModel getdModel() {
        return dModel;
    }

    public void setdModel(LazyDatabaseDataModel dModel) {
        this.dModel = dModel;
    }

    /**
     * Obtiene el objeto de CRUD.
     *
     * @return Object getCo()
     */
    public T getCo() {
        return co;
    }

    /**
     * Setter para el objeto de CRUD.
     *
     * @param Object getCo()
     */
    public void setCo(T co) {
        this.co = co;
    }
    
    /**
     * Método que se ejecuta antes de grabar(Crear,Actualizar) en la base de
     * datos el objeto actual (co). Este método es sobreescrito por los
     * controladores que heredan de esta clase.
     */
    protected void preSave() {
    }

    /**
     * Método que se ejecuta después de grabar(Crear,Actualizar) en la base de
     * datos el objeto actual (co). Este método es sobreescrito por los
     * controladores que heredan de esta clase.
     */
    protected void postSave() {
        /*
        if (clearCacheOnSave) {
            lists.clearCache(getCo());
        }
        */
    }

    /**
     * Método que se ejecuta antes de insertar en la base de datos el objeto
     * actual (co). Este método es sobreescrito por los controladores que
     * heredan de esta clase.
     */
    protected void preCreate() {
    }

    /**
     * Método que se ejecuta después de insertar en la base de datos el objeto
     * actual (co). Este método es sobreescrito por los controladores que
     * heredan de esta clase.
     */
    protected void postCreate() {
    }

    /**
     * Método que se ejecuta antes de actualizar en la base de datos el objeto
     * actual (co). Este método es sobreescrito por los controladores que
     * heredan de esta clase.
     */
    protected void preUpdate() {
    }

    /**
     * Método que se ejecuta después de actualizar en la base de datos el objeto
     * actual (co). Este método es sobreescrito por los controladores que
     * heredan de esta clase.
     */
    protected void postUpdate() {
    }

    /**
     * Método que se ejecuta después de crear una nueva instancia del objeto
     * actual (co). Este método es sobreescrito por los controladores que
     * heredan de esta clase.
     */
    protected void afterCreateNew() {
    }

    /**
     * Clase para manejar el modelo de inicialización tardia de la tabla.
     * Permite consultar la información que será presentada en la tabla
     *
     * @param <T> El tipo de entidad que maneja el modelo
     */
    public class LazyDatabaseDataModel<T> extends LazyDataModel<T> {

        @Override
        public void setRowIndex(int rowIndex) {
            if (super.getPageSize() != 0) {
                super.setRowIndex(rowIndex);
            }
        }

        @Override
        public List load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
            List<SortMeta> multiSortMeta = new ArrayList<SortMeta>();
            multiSortMeta.add(new SortMeta(null, sortField, sortOrder, null));
            return load(first, pageSize, multiSortMeta, filters);
        }

        /**
         * Carga la información de la base de datos de acuerdo a los filtros y
         * ordenamiento
         *
         * @param first El indice del primer registro a consultar.
         * @param pageSize El tamaño de la página, cuantos registros de deben
         * mostrar.
         * @param multiSortMeta Información del ordenamiento de la tabla
         * @param filters Información de los filtros de la tabla
         * @return La lista de entidades
         */
        @Override
        public List load(final int first, final int pageSize, final List<SortMeta> multiSortMeta, final Map<String, Object> filters) {
            Callable<List> callable = new Callable() {
                @Override
                public Object call() throws Exception {
                    StringBuilder sql = new StringBuilder();
                    sql.append("select ").append(defaultObjectConstructor != null ? defaultObjectConstructor : "p").append(" from ").append(entityClass.getSimpleName()).append(" p ");
                    StringBuilder sqlWhere = new StringBuilder();
                    for (Map.Entry<String, Object> entry : filters.entrySet()) {
                        if (entry.getValue() != null && !entry.getValue().equals("")) {
                            if (sqlWhere.length() > 0) {
                                sqlWhere.append(" and ");
                            }
                            if (filterTypes.get(entry.getKey()) != null && filterTypes.get(entry.getKey()).equals("text")) {
                                sqlWhere.append("upper(").append("p.").append(entry.getKey()).append(")");
                                sqlWhere.append(" like ");
                            } else {
                                sqlWhere.append("p.").append(entry.getKey());
                                sqlWhere.append(" = ");
                            }
                            sqlWhere.append(" :").append(entry.getKey().replaceAll("[.]", "_")).append(" ");
                        }
                    }
                    setSQLWhere(sqlWhere);
                    if (sqlWhere.length() > 0) {
                        sql.append(" where ").append(sqlWhere);
                    }
                    StringBuilder sqlSort = new StringBuilder();
                    for (SortMeta sortMeta : multiSortMeta) {
                        if (sortMeta.getSortField() != null && sortMeta.getSortOrder() != org.primefaces.model.SortOrder.UNSORTED) {
                            if (sqlSort.length() > 0) {
                                sqlSort.append(" and ");
                            }
                            sqlSort.append("p.").append(sortMeta.getSortField());
                            if (sortMeta.getSortOrder() == org.primefaces.model.SortOrder.ASCENDING) {
                                sqlSort.append(" ASC ");
                            } else {
                                sqlSort.append(" DESC ");
                            }
                        }
                    }

                    if (sqlSort.length() == 0 && defaultOrder != null && !defaultOrder.isEmpty()) {
                        sqlSort.append(" ").append(defaultOrder).append(" ");
                    }

                    if (sqlSort.length() > 0) {
                        sql.append(" order by ").append(sqlSort);
                    }
                    Query q = pManager.createQuery(sql.toString());
                    for (Map.Entry<String, Object> entry : filters.entrySet()) {
                        Parameter p = q.getParameter(entry.getKey().replaceAll("[.]", "_"));
                        String pValue = entry.getValue().toString();
                        if (filterTypes.get(entry.getKey()) != null && filterTypes.get(entry.getKey()).equals("text")) {
                            pValue = "%" + pValue.toUpperCase() + "%";
                        }
                        PersistenceManager.setParameter(q, p, pValue);
                    }
                    setQueryParameters(q);
                    q.setFirstResult(first);
                    q.setMaxResults(pageSize);
                    /**
                     * Construir esql para la consulta del total de registro
                     * select count(*)
                     */
                    sql = new StringBuilder();
                    sql.append("select count(p) from ").append(entityClass.getSimpleName()).append(" p ");
                    if (sqlWhere.length() > 0) {
                        sql.append(" where ").append(sqlWhere);
                    }
                    Query qCount = pManager.createQuery(sql.toString());
                    for (Map.Entry<String, Object> entry : filters.entrySet()) {
                        Parameter p = qCount.getParameter(entry.getKey().replaceAll("[.]", "_"));
                        String pValue = entry.getValue().toString();
                        if (filterTypes.get(entry.getKey()) != null && filterTypes.get(entry.getKey()).equals("text")) {
                            pValue = "%" + pValue.toUpperCase() + "%";
                        }
                        PersistenceManager.setParameter(qCount, p, pValue);
                    }
                    setQueryParameters(qCount);
                    setRowCount(((Long) qCount.getSingleResult()).intValue());
                    return pManager.listData(q);
                }
            };
            return pManager.executeInPersistenceContext(callable);
        }
    }

    /**
     * Método que se ejecuta durante la consulta de la información de la tabla
     * para establecer los valores de parametros adicionales a la consulta.
     * Este método es sobreescrito por los controladores que heredan de esta clase.
     */
    protected void setQueryParameters(Query q) {
    }

    /**
     * Método que se ejecuta durante la consulta de la información de la tabla
     * para agregar sentencias JPQL adicionales a la consulta.
     * Este método es sobreescrito por los controladores que heredan de esta clase.
     */
    protected void setSQLWhere(StringBuilder sqlWhere) {
    }
/*
    public UILists getLists() {
        return lists;
    }

    public void setLists(UILists lists) {
        this.lists = lists;
    }
*/
    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }

    
}
