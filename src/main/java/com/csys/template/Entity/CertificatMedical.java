/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dell
 */
@Entity
public class CertificatMedical implements Serializable {
    @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
      
    private Integer idcertificat;
    private String RaisonSocial;
    private String natureActivite;
    private Integer ncss;
    private String dateExamen;
    
    @JsonBackReference
    @ManyToOne()
        //(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "nDossier")
    private Employe employe;
@Column(name= "nDossier", insertable = false, updatable = false)

    public Integer getIdcertificat() {
        return idcertificat;
    }

    public void setIdcertificat(Integer Idcertificat) {
        this.idcertificat = Idcertificat;
    }

    public String getRaisonSocial() {
        return RaisonSocial;
    }

    public void setRaisonSocial(String RaisonSocial) {
        this.RaisonSocial = RaisonSocial;
    }

    public String getNatureActivite() {
        return natureActivite;
    }

    public void setNatureActivite(String natureActivite) {
        this.natureActivite = natureActivite;
    }

    public Integer getNcss() {
        return ncss;
    }

    public void setNcss(Integer ncss) {
        this.ncss = ncss;
    }

    public String getDateExamen() {
        return dateExamen;
    }

    public void setDateExamen(String dateExamen) {
        this.dateExamen = dateExamen;
    }

   

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
   
}
