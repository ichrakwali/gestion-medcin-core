/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.Entity;


//import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;

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
public class Medecin implements Serializable {
     @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
       @JsonProperty("codemed")
    private Integer codemed;

    public Integer getCodemed() {
        return codemed;
    }

    public void setCodemed(Integer codemed) {
        this.codemed = codemed;
    }

   

  
    private String nommed;
    private String prenommed;
    private String adresseEmailmed;
    private Integer telmed;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "codesoc")
    private Societe societe;
    @Column(name= "codesoc", insertable = false, updatable = false)
   
    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

   
   

    public String getNommed() {
        return nommed;
    }

    public void setNommed(String nommed) {
        this.nommed = nommed;
    }

    public String getPrenommed() {
        return prenommed;
    }

    public void setPrenommed(String prenommed) {
        this.prenommed = prenommed;
    }

    public String getAdresseEmailmed() {
        return adresseEmailmed;
    }

    public void setAdresseEmailmed(String adresseEmailmed) {
        this.adresseEmailmed = adresseEmailmed;
    }

    public Integer getTelmed() {
        return telmed;
    }

    public void setTelmed(Integer telmed) {
        this.telmed = telmed;
    }

    
   
//
//    public void setExamenMedicaux(ExamenMedicaux examenMedicaux) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public void setSociete(Societe societe) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public void setExamenMedicaux(ExamenMedicaux examenMedicaux) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    


   
    
}