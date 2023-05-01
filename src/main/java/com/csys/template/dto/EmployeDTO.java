/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.dto;
import com.csys.template.Entity.Societe;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class EmployeDTO {
     
    private Integer nDossier;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String sexe;
    private String adresse;
    private Integer telephone;
    private Integer nAffectationCnss;
    private String matricule;
    private Integer nCin;
    private String delivree;
    private String situationFamille;
    private String situationmilitaire;
    private String niveauEtudes;
    private String diplomes;
    private String dateRecrutement;
   private SocieteDTO societe;

    public Integer getnDossier() {
        return nDossier;
    }

    public void setnDossier(Integer nDossier) {
        this.nDossier = nDossier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getnAffectationCnss() {
        return nAffectationCnss;
    }

    public void setnAffectationCnss(Integer nAffectationCnss) {
        this.nAffectationCnss = nAffectationCnss;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Integer getnCin() {
        return nCin;
    }

    public void setnCin(Integer nCin) {
        this.nCin = nCin;
    }

    public String getDelivree() {
        return delivree;
    }

    public void setDelivree(String delivree) {
        this.delivree = delivree;
    }

    public String getSituationFamille() {
        return situationFamille;
    }

    public void setSituationFamille(String situationFamille) {
        this.situationFamille = situationFamille;
    }

    public String getSituationmilitaire() {
        return situationmilitaire;
    }

    public void setSituationmilitaire(String situationmilitaire) {
        this.situationmilitaire = situationmilitaire;
    }

    public String getNiveauEtudes() {
        return niveauEtudes;
    }

    public void setNiveauEtudes(String niveauEtudes) {
        this.niveauEtudes = niveauEtudes;
    }

    public String getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(String diplomes) {
        this.diplomes = diplomes;
    }

    public String getDateRecrutement() {
        return dateRecrutement;
    }

    public void setDateRecrutement(String dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }

    public SocieteDTO getSociete() {
        return societe;
    }

    public void setSociete(SocieteDTO societe) {
        this.societe = societe;
    }

    public EmployeDTO() {
    }

    public EmployeDTO(Integer nDossier, String nom, String prenom, String dateNaissance, String sexe, String adresse, Integer telephone, Integer nAffectationCnss, String matricule, Integer nCin, String delivree, String situationFamille, String situationmilitaire, String niveauEtudes, String diplomes, String dateRecrutement, SocieteDTO societe) {
        this.nDossier = nDossier;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.adresse = adresse;
        this.telephone = telephone;
        this.nAffectationCnss = nAffectationCnss;
        this.matricule = matricule;
        this.nCin = nCin;
        this.delivree = delivree;
        this.situationFamille = situationFamille;
        this.situationmilitaire = situationmilitaire;
        this.niveauEtudes = niveauEtudes;
        this.diplomes = diplomes;
        this.dateRecrutement = dateRecrutement;
        this.societe = societe;
    }
   

  

    
}
