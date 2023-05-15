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

    private Integer codemed;
    private String nommed;
    private String prenommed;
    private String adresse;
    private String emailmed;
    private Integer telmed;
    private String emplacement;
    private SocieteDTO societe;

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmailmed() {
        return emailmed;
    }

    public void setEmailmed(String emailmed) {
        this.emailmed = emailmed;
    }

    public Integer getTelmed() {
        return telmed;
    }

    public void setTelmed(Integer telmed) {
        this.telmed = telmed;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public SocieteDTO getSociete() {
        return societe;
    }

    public void setSociete(SocieteDTO societe) {
        this.societe = societe;
    }

    public MedecinDTO(String emplacement) {
        this.emplacement = emplacement;
    }

    public MedecinDTO(Integer codemed, String nommed, String prenommed, String adresse, String emailmed, Integer telmed, SocieteDTO societe) {
        this.codemed = codemed;
        this.nommed = nommed;
        this.prenommed = prenommed;
        this.adresse = adresse;
        this.emailmed = emailmed;
        this.telmed = telmed;

        this.societe = societe;
    }

    public MedecinDTO() {
    }
}