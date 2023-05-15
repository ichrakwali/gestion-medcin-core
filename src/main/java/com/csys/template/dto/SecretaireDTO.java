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
<<<<<<< HEAD
    private Integer ncin;
    private String nomsec;
    private String prenomsec;
    private String adressesec;
    private String emailsec;
    private Integer telsec;
    private SocieteDTO societe;
=======

   
    private Integer ncin;
    private String nomsec;
    private String prenomsec;
    private String adresseEmailsec;

    public String getAdresseEmailsec() {
        return adresseEmailsec;
    }

    public void setAdresseEmailsec(String adresseEmailsec) {
        this.adresseEmailsec = adresseEmailsec;
    }
    private Integer telsec;

    public Integer getTelsec() {
        return telsec;
    }

    public void setTelsec(Integer telsec) {
        this.telsec = telsec;
    }
    private Societe societe;
//    private Integer codesoc;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

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
=======
   
    

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

//    public Integer getCodesoc() {
//        return codesoc;
//    }
//
//    public void setCodesoc(Integer codesoc) {
//        this.codesoc = codesoc;
//    }

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
}