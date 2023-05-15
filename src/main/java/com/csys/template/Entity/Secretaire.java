/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.Entity;

<<<<<<< HEAD
import javax.persistence.*;

import java.io.Serializable;

@Entity
public class Secretaire implements Serializable {
    @Id
    @Column(name = "numero_cin", updatable = false, nullable = false)
    private Integer ncin;
    @Column(name = "nom")
    private String nomsec;
    @Column(name = "prenom")
    private String prenomsec;
    @Column(name = "adresse")
    private String adressesec;
    @Column(name = "email")
    private String emailsec;
    @Column(name = "telephone")
    private Integer telsec;

    @ManyToOne(cascade = {CascadeType.MERGE , CascadeType.REMOVE})
    @JoinColumn(name = "code")
    private Societe societe;
=======
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
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

    public Integer getNcin() {
        return ncin;
    }

    public void setNcin(Integer ncin) {
        this.ncin = ncin;
    }

<<<<<<< HEAD
=======
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

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
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

<<<<<<< HEAD
    public String getAdressesec() {
        return adressesec;
    }

    public void setAdressesec(String adressesec) {
        this.adressesec = adressesec;
    }

    public String getEmailsec() {
        return emailsec;
    }

    public void setEmailsec(String emailsec) {
        this.emailsec = emailsec;
    }

    public Integer getTelsec() {
        return telsec;
    }

    public void setTelsec(Integer telsec) {
        this.telsec = telsec;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Secretaire(Integer ncin, String nomsec, String prenomsec, String adressesec, String emailsec, Integer telsec, Societe societe) {
        this.ncin = ncin;
        this.nomsec = nomsec;
        this.prenomsec = prenomsec;
        this.adressesec = adressesec;
        this.emailsec = emailsec;
        this.telsec = telsec;
        this.societe = societe;
    }

    public Secretaire() {
    }
}
=======
   

}
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
