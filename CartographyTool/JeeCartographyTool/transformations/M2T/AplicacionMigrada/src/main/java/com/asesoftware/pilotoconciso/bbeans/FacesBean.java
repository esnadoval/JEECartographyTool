package com.asesoftware.pilotoconciso.bbeans;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.UUID;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 * Clase que permite el manejo de mensajes y elementos a nivel del FacesContext.
 *
 * @author Camilo Alvarez Brainstorming S.A.S.
 */
public class FacesBean implements Serializable {

    /**
     * La sesión del usuario actual
     */
    @ManagedProperty(value = "#{sessionUtils}")
    protected SessionUtils session;

    /**
     * Constructor por defecto.
     */
    public FacesBean() {
    }

    /**
     * Obtiene el Bean basado en su nombre.
     *
     * @param String beanName
     * @return Object bean
     */
    public Object getBean(String beanName) {
        return getFacesContext().getApplication().getELResolver().getValue(getFacesContext().getELContext(), null, beanName);
    }

    /**
     * Obtiene el valor de la expresión con el nombre de la clase.
     *
     * @param String expression
     * @return ValueExpression value
     */
    public ValueExpression getValueExpression(String expression) {
        return getFacesContext().getApplication().getExpressionFactory().createValueExpression(getFacesContext().getELContext(), expression, Object.class);
    }

    /**
     * Obtiene la expresión del método con la expresión dada.
     *
     * @param String expression
     * @return MethodExpression method
     */
    public MethodExpression getMethodExpression(String expression) {
        return getFacesContext().getApplication().getExpressionFactory().createMethodExpression(getFacesContext().getELContext(), expression, null, new Class[0]);
    }

    /**
     * Obtiene el FacesContext actual.
     *
     * @return FacesContext current
     */
    public FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

    /**
     * Añade el resumen del evento al mensaje de información.
     *
     * @param String summary
     */
    public void info(String summary) {
        addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, summary, summary));
    }

    /**
     * Añade el resumen del evento y el componente origen al mensaje de
     * información.
     *
     * @param String component
     * @param String summary
     */
    public void info(String component, String summary) {
        addMessage(component, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, summary));
    }

    /**
     * Añade el resumen del evento al mensaje de advertencia.
     *
     * @param String summary
     */
    public void warn(String summary) {
        addMessage(new FacesMessage(FacesMessage.SEVERITY_WARN, summary, summary));
    }

    /**
     * Añade el resumen del evento y el componente origen al mensaje de
     * advertencia.
     *
     * @param String component
     * @param String summary
     */
    public void warn(String component, String summary) {
        addMessage(component, new FacesMessage(FacesMessage.SEVERITY_WARN, summary, summary));
    }

    /**
     * Añade el resumen del evento al mensaje de error.
     *
     * @param String summary
     */
    public void error(String summary) {
        addMessage(new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, summary));
    }

    /**
     * Añade el resumen del evento y el componente origen al mensaje de error.
     *
     * @param String component
     * @param String summary
     */
    public void error(String component, String summary) {
        addMessage(component, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, summary));
    }

    /**
     * Añade el resumen del evento al mensaje de error fatal.
     *
     * @param String summary
     */
    public void fatal(String summary) {
        addMessage(new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, summary));
    }

    /**
     * Añade el resumen del evento y el componente origen al mensaje de error
     * fatal.
     *
     * @param String component
     * @param String summary
     */
    public void fatal(String component, String summary) {
        addMessage(component, new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, summary));
    }

    /**
     * Añade el mensaje al FacesContext.
     *
     * @param FacesMessage fm
     */
    private void addMessage(FacesMessage fm) {
        getFacesContext().addMessage(null, fm);
    }

    /**
     * Añade el mensaje y el identificador del cliente al FacesContext.
     *
     * @param String clientId
     * @param FacesMessage fm
     */
    private void addMessage(String clientId, FacesMessage fm) {
        getFacesContext().addMessage(clientId, fm);
    }

    /**
     * Obtiene la sesión.
     *
     * @return HttpSession session
     */
    public HttpSession getHttpSession() {
        return (HttpSession) getFacesContext().getExternalContext().getSession(false);
    }

    /**
     * Añade el identificador de sesión.
     *
     * @param String id
     * @param Object value
     */
    public void storeInSession(String id, Object value) {
        getHttpSession().setAttribute(id, value);
    }

    /**
     * Obtiene el objeto de seción dependiendo de su identificador.
     *
     * @param String id
     * @return Object session
     */
    public Object getFromSession(String id) {
        return getHttpSession().getAttribute(id);
    }

    /**
     * Limpia la sesión (eliminando sus atributos).
     */
    public void cleanSession() {
        Enumeration enuma = getHttpSession().getAttributeNames();
        while (enuma.hasMoreElements()) {
            getHttpSession().removeAttribute(enuma.nextElement().toString());
        }
    }

    /**
     * Obtiene la sesión existente o null si no hay ninguna.
     *
     * @param boolean pa
     * @return HttpSession session
     */
    public HttpSession getHttpSession(boolean pa) {
        return (HttpSession) getFacesContext().getExternalContext().getSession(false);
    }

    /**
     * Génera un identificador único para una descarga y lo almacena en la
     * sesión. Esto permite que el acceso a los archivos se realice sólo cuando
     * tienen autorización y que la descarga se pueda realizar una única vez
     */
    public void genDownloadId() {
        String newTempId = UUID.randomUUID().toString();
        session.put(newTempId, getFacesContext().getExternalContext().getRequestMap().get("fileId"));
        getFacesContext().getExternalContext().getRequestMap().put("fid", newTempId);
    }

    public SessionUtils getSession() {
        return session;
    }

    public void setSession(SessionUtils session) {
        this.session = session;
    }
}
