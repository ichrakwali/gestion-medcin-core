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

}