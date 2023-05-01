/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dell
 */
@Entity
public class ExamenMedical implements Serializable {

    
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idExamen;
    private String date;
    private String Motif;
    private String conclusion;

    @JsonBackReference
    @ManyToOne()
    //(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "nDossier")
    private Employe employe;
    @Column(name = "nDossier", insertable = false, updatable = false)
    @JoinColumn(name = "codemed")
    private Medecin medecin;
    @Column(name = "codemed", insertable = false, updatable = false)
    @JoinColumn(name = "ncin")
    private Secretaire secretaire;
@Column(name = "ncin", insertable = false, updatable = false)
    public Integer getIdExamen() {
        return idExamen;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Secretaire getSecretaire() {
        return secretaire;
    }

    public void setSecretaire(Secretaire secretaire) {
        this.secretaire = secretaire;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMotif() {
        return Motif;
    }

    public void setMotif(String Motif) {
        this.Motif = Motif;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

}
