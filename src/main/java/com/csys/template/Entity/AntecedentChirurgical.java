package com.csys.template.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class AntecedentChirurgical implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Chirurgical")
    private Long idch;
    @Column(name = "Description")
    private String description;
    @Column(name = "date")
    private Date date;
    @Column(name = "nom_clinique")
    private String nomclinique;
    @ManyToOne(cascade = {CascadeType.MERGE , CascadeType.REMOVE})
    @JoinColumn(name = "nDossier")
     private Employe employe;

    public Long getIdch() {
        return idch;
    }

    public void setIdch(Long idch) {
        this.idch = idch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNomclinique() {
        return nomclinique;
    }

    public void setNomclinique(String nomclinique) {
        this.nomclinique = nomclinique;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public AntecedentChirurgical(Long idch, String description, Date date, String nomclinique, Employe employe) {
        this.idch = idch;
        this.description = description;
        this.date = date;
        this.nomclinique = nomclinique;
        this.employe = employe;
    }

    public AntecedentChirurgical() {
    }
}
