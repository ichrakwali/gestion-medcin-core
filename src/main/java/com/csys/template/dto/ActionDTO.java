/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.dto;

import com.csys.template.Entity.ExamenMedical;

/**
 *
 * @author Dell
 */
public class ActionDTO {
    private Integer idaction;
    private String type;
    private String resultat;
    private ExamenMedical examenMedical;

    public Integer getIdaction() {
        return idaction;
    }

    public void setIdaction(Integer idaction) {
        this.idaction = idaction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public ExamenMedical getExamenMedical() {
        return examenMedical;
    }

    public void setExamenMedical(ExamenMedical examenMedical) {
        this.examenMedical = examenMedical;
    }
     

}
