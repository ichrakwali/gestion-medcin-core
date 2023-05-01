/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.dto;

import com.csys.template.Entity.Employe;

/**
 *
 * @author Dell
 */
public class CertificatMedicalDTO {
    private Integer idcertificat;
    private String RaisonSocial;
    private String natureActivite;
    private Integer ncss;
    private String dateExamen;
     private Employe employe;

    public Integer getIdcertificat() {
        return idcertificat;
    }

    public void setIdcertificat(Integer Idcertificat) {
        this.idcertificat = Idcertificat;
    }

    public String getRaisonSocial() {
        return RaisonSocial;
    }

    public void setRaisonSocial(String RaisonSocial) {
        this.RaisonSocial = RaisonSocial;
    }

    public String getNatureActivite() {
        return natureActivite;
    }

    public void setNatureActivite(String natureActivite) {
        this.natureActivite = natureActivite;
    }

    public Integer getNcss() {
        return ncss;
    }

    public void setNcss(Integer ncss) {
        this.ncss = ncss;
    }

    public String getDateExamen() {
        return dateExamen;
    }

    public void setDateExamen(String dateExamen) {
        this.dateExamen = dateExamen;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
