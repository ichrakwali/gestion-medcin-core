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

import javax.validation.constraints.NotNull;
import static org.hibernate.criterion.Projections.property;

/**
 *
 * @author Dell
 */
@Entity
public class Secretaire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer ncin;
    private String nomsec;
    private String prenomsec;
    private String adresseEmailsec;
    private Integer telsec;

    public String getAdresseEmailsec() {
        return adresseEmailsec;
    }

    public void setAdresseEmailsec(String adresseEmailsec) {
        this.adresseEmailsec = adresseEmailsec;
    }

    public Integer getTelsec() {
        return telsec;
    }

    public void setTelsec(Integer telsec) {
        this.telsec = telsec;
    }
  
    @JsonBackReference
    @ManyToOne()
        //(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "codesoc")
    private Societe societe;
    @Column(name = "codesoc",insertable = false, updatable = false)
//    private Integer codesoc;
//   @property (name="codesoc" ,column="codesoc", insert="false" ,update="false")

    public Integer getNcin() {
        return ncin;
    }

    public void setNcin(Integer ncin) {
        this.ncin = ncin;
    }

//    public Integer getCodesoc() {
//        return codesoc;
//    }
//
//    public void setCodesoc(Integer codesoc) {
//        this.codesoc = codesoc;
//    }

    public Societe getSociete() {
        return societe;
    }
    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public String getNomsec() {
        return nomsec;
    }

    public void setNomsec(String nomsec) {
        this.nomsec = nomsec;
    }

    public String getPrenomsec() {
        return prenomsec;
    }

    public void setPrenomsec(String prenomsec) {
        this.prenomsec = prenomsec;
    }

   

}
