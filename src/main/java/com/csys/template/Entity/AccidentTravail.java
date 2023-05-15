package com.csys.template.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class AccidentTravail  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_accident")
     private Long idAcc;
    @Column(name="Date")
    private Date date;
    @Column(name="Cause")
    private String cause ;
    @Column(name="Naturel_lesion")
    private String naturelLesion;
    @Column(name="Siege_lesion")
    private String siegeLesion;
    @Column(name="Duree_arret")
    private Date dureeArret ;
    @Column(name="IPP")
     private Integer ipp;
    @ManyToOne(cascade = {CascadeType.MERGE , CascadeType.REMOVE})
    @JoinColumn(name = "nDossier")
    private Employe employe;

    public Long getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(Long idAcc) {
        this.idAcc = idAcc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getNaturelLesion() {
        return naturelLesion;
    }

    public void setNaturelLesion(String naturelLesion) {
        this.naturelLesion = naturelLesion;
    }

    public String getSiegeLesion() {
        return siegeLesion;
    }

    public void setSiegeLesion(String siegeLesion) {
        this.siegeLesion = siegeLesion;
    }

    public Date getDureeArret() {
        return dureeArret;
    }

    public void setDureeArret(Date dureeArret) {
        this.dureeArret = dureeArret;
    }

    public Integer getIpp() {
        return ipp;
    }

    public void setIpp(Integer ipp) {
        this.ipp = ipp;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public AccidentTravail(Long idAcc, Date date, String cause, String naturelLesion, String siegeLesion, Date dureeArret, Integer ipp, Employe employe) {
        this.idAcc = idAcc;
        this.date = date;
        this.cause = cause;
        this.naturelLesion = naturelLesion;
        this.siegeLesion = siegeLesion;
        this.dureeArret = dureeArret;
        this.ipp = ipp;
        this.employe = employe;
    }

    public AccidentTravail() {
    }
}
