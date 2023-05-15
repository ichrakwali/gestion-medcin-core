/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package com.csys.template.dto;


import com.csys.template.Entity.Societe;

/**
 *
 * @author Dell
*/
public class SecretaireDTO {
    private Integer ncin;
    private String nomsec;
    private String prenomsec;
    private String adressesec;
    private String emailsec;
    private Integer telsec;
    private SocieteDTO societe;

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

    public SocieteDTO getSociete() {
        return societe;
    }

    public void setSociete(SocieteDTO societe) {
        this.societe = societe;
    }

    public SecretaireDTO(Integer ncin, String nomsec, String prenomsec, String adressesec, String emailsec,Integer telsec, SocieteDTO societe) {
        this.ncin = ncin;
        this.nomsec = nomsec;
        this.prenomsec = prenomsec;
        this.adressesec = adressesec;
        this.emailsec = emailsec;
        this.telsec = telsec;
        this.societe = societe;

    }

    public SecretaireDTO() {
    }
}