/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.Entity;

//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
//import java.util.List;
//import javax.persistence.CascadeType;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



/**
 *
 * @author Dell
 */
@Entity
public class Societe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Integer codesoc;

    @Column(name = "nom_societe")
    private String nomsociete;
    @Column(name = "secteur_activite")
    private String secteurActivite;
    @Column(name = "notes")
    private String notes;
    @Column(name = "telephone")
    private Integer telsociete;
    @Column(name = "email")
    private String emailsociete;
<<<<<<< HEAD
    @OneToMany(mappedBy = "societe", cascade = CascadeType.ALL)

    private List<Employe> employes ;
=======
    @OneToMany(mappedBy="societe" )
    private List<Employe> employes ; 
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

    public Societe(Integer codesoc, String nomsociete, String secteurActivite, String notes, Integer telsociete, String emailsociete, List<Employe> employes) {
        this.codesoc = codesoc;
        this.nomsociete = nomsociete;
        this.secteurActivite = secteurActivite;
        this.notes = notes;
        this.telsociete = telsociete;
        this.emailsociete = emailsociete;
        this.employes = employes;
<<<<<<< HEAD

=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    }

    public Societe() {
    }

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

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
<<<<<<< HEAD
=======
   
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d


}
