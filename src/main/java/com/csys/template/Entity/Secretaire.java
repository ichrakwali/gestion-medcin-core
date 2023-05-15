/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.Entity;

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

    public Integer getNcin() {
        return ncin;
    }

    public void setNcin(Integer ncin) {
        this.ncin = ncin;
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