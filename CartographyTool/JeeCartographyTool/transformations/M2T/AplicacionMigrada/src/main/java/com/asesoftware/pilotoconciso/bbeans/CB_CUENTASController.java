package com.asesoftware.pilotoconciso.bbeans;

import com.asesoftware.pilotoconciso.entity.CB_CUENTAS;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class  CB_CUENTASController extends CrudController< CB_CUENTAS,Object,String> {

    public  CB_CUENTASController() {
        entityClass = CB_CUENTAS.class;
        defaultOrder = "p.CTA_NUMERO";
        filterTypes.put("CTA_NUMERO", "text");
    }

}