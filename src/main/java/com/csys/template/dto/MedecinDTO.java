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

<<<<<<< HEAD
    private Integer codemed;
    private String nommed;
    private String prenommed;
    private String adresse;
    private String emailmed;
    private Integer telmed;
    private String emplacement;
    private SocieteDTO societe;
=======
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
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

    public Integer getCodemed() {
        return codemed;
    }

    public void setCodemed(Integer codemed) {
        this.codemed = codemed;
    }

<<<<<<< HEAD
=======
    

   

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
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

<<<<<<< HEAD
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
=======
    public String getAdresseEmailmed() {
        return adresseEmailmed;
    }

    public void setAdresseEmailmed(String adresseEmailmed) {
        this.adresseEmailmed = adresseEmailmed;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    }

    public Integer getTelmed() {
        return telmed;
    }

    public void setTelmed(Integer telmed) {
        this.telmed = telmed;
    }

<<<<<<< HEAD
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
=======
    public Integer getCodesoc() {
        return codesoc;
    }

    public void setCodesoc(Integer codesoc) {
        this.codesoc = codesoc;
    }

    
}
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
