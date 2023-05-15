/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
package com.csys.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dell

@Entity
public class Action implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idaction;
    private String type;
    private String resultat;

    @JsonBackReference
    @ManyToOne()
    //(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "idExamen")
    private ExamenMedical examenMedical;
    
    @Column(name = "idExamen", insertable = false, updatable = false)
    
    
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
*/