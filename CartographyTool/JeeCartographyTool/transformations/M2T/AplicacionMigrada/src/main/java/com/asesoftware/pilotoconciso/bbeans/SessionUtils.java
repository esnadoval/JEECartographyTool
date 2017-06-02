package com.asesoftware.pilotoconciso.bbeans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Callable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Query;
import org.apache.commons.collections.FastHashMap;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.primefaces.context.RequestContext;
import com.asesoftware.pilotoconciso.persistence.controller.PersistenceManager;

/**
 * Clase con múltiples utilidades para manejar la sesión.
 *
 * @author cadmilo at <cadmilo@gmail.com>
 */
@ManagedBean
@SessionScoped
public class SessionUtils implements Serializable {

    public final static String ROL_ADMINISTRADOR = "ADMINISTRADOR";
    public final static String ROL_ESTUDIANTE = "ESTUDIANTE";
    public final static String ROL_DOCENTE = "DOCENTE";
    // Atributos
    private final HashMap data = new FastHashMap();
    private String oldPwd;
    private String newPwd;
    private String conNewPwd;
    private Object user;
    private String usurioRecuperacion;
    private String pwdRecuperacion;

    /**
     * Coloca un objeto dado dentro del Hashmap de datos.
     *
     * @param Object key El identificador de objeto.
     * @param Object value El objeto a ser colocado.
     * @return Object
     */
    public Object put(Object key, Object value) {
        return data.put(key, value);
    }

    /**
     * Elimina un objeto del Hashmap de datos.
     *
     * @param Object key El identificador del objeto.
     * @return Object
     */
    public Object remove(Object key) {
        return data.remove(key);
    }

    /**
     * Obtiene un objeto desde el Hashmap de datos.
     *
     * @param Object key El identificador del objeto.
     * @return Object
     */
    public Object get(Object key) {
        return data.get(key);
    }

    /**
     * Cierra la sessión del usuario
     */
    public void cerrarSesion() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
    }

    /**
     * Cambia la contraseña del usuario
     */
    public void cambiarPwd() {
        oldPwd = null;
        newPwd = null;
    }

    /**
     * Consulta el usario que ha iniciado sesión
     * @return El usuario que ha iniciado sesión
     */
    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public boolean hasRole(String role) {
        return SecurityUtils.getSubject().hasRole(role);
    }

    public boolean isEstudiante() {
        return SecurityUtils.getSubject().hasRole(ROL_ESTUDIANTE);
    }

    public boolean isDocente() {
        return SecurityUtils.getSubject().hasRole(ROL_DOCENTE);
    }

    public String getUsuario() {
        return SecurityUtils.getSubject().getPrincipal().toString();
    }

    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    public String getConNewPwd() {
        return conNewPwd;
    }

    public void setConNewPwd(String conNewPwd) {
        this.conNewPwd = conNewPwd;
    }

    public String getUsurioRecuperacion() {
        return usurioRecuperacion;
    }

    public void setUsurioRecuperacion(String usurioRecuperacion) {
        this.usurioRecuperacion = usurioRecuperacion;
    }

    public String getPwdRecuperacion() {
        return pwdRecuperacion;
    }

    public void setPwdRecuperacion(String pwdRecuperacion) {
        this.pwdRecuperacion = pwdRecuperacion;
    }

    /**
     * Verifica si ya existe un usuario registrado con el número de documento dado
     * @param numDocIdentidad El número de documento de identidad del usuario 
     * @return True si ya existe False en caso contrario
     */
    public static boolean userExists(final String numDocIdentidad) {
        return false;
    }

    /**
     * Verifica si ya existe un usuario registrado de acuerdo al tipo de parametro
     * @param co El usuario a verificar
     * @return True si ya existe False en caso contrario
     */
    public static boolean userExists(final Object co) {
        return false;
    }
}
