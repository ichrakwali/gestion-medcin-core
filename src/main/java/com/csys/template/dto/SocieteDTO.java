/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.dto;

import com.csys.template.Entity.Employe;
//import com.csys.template.Entity.Medecin;
//import com.csys.template.Entity.Secretaire;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
//import java.util.Date;
//import java.util.List;
//import java.util.Date;
//import java.util.List;



/**
 *
 * @author Dell
 
*/
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocieteDTO {

    private Integer codesoc;
    private String nomsociete;
    private String secteurActivite;
    private String notes;

    private Integer telsociete;
    private String emailsociete;

    public Integer getCodesoc() {
        return codesoc;
    }

    public void setCodesoc(Integer codesoc) {
        this.codesoc = codesoc;
    }

    public String getNomsociete() {
        return nomsociete;
    }

    public void setNomsociete(String nomsociete) {
        this.nomsociete = nomsociete;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getTelsociete() {
        return telsociete;
    }

    public void setTelsociete(Integer telsociete) {
        this.telsociete = telsociete;
    }

    public String getEmailsociete() {
        return emailsociete;
    }

    public void setEmailsociete(String emailsociete) {
        this.emailsociete = emailsociete;
    }

    public SocieteDTO() {
    }






    public SocieteDTO(Integer codesoc, String nomsociete, String secteurActivite, String notes, Integer telsociete, String emailsociete) {
        this.codesoc = codesoc;
        this.nomsociete = nomsociete;
        this.secteurActivite = secteurActivite;
        this.notes = notes;
        this.telsociete = telsociete;
        this.emailsociete = emailsociete;

    }

  
}
