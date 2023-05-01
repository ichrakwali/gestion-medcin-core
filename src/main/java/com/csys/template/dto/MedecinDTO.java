/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package com.csys.template.dto;

import com.csys.template.Entity.Societe;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Dell
 */
public class MedecinDTO {

     @JsonProperty("codemed")
    private Integer codemed;
    private String nommed;
    private String prenommed;
    private String adresseEmailmed;
    private Integer telmed;
    private Societe societe;
    private Integer codesoc;

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Integer getCodemed() {
        return codemed;
    }

    public void setCodemed(Integer codemed) {
        this.codemed = codemed;
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

    public Integer getCodesoc() {
        return codesoc;
    }

    public void setCodesoc(Integer codesoc) {
        this.codesoc = codesoc;
    }

    
}
