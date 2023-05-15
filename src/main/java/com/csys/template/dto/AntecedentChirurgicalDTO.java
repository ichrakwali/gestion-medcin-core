package com.csys.template.dto;

import com.csys.template.Entity.Employe;

import java.util.Date;

public class AntecedentChirurgicalDTO {
    private Long idch;
    private String description;
    private Date date;
    private String nomclinique;
    private EmployeDTO employe;

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

    public EmployeDTO getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDTO employe) {
        this.employe = employe;
    }

    public AntecedentChirurgicalDTO(Long idch, String description, Date date, String nomclinique, EmployeDTO employe) {
        this.idch = idch;
        this.description = description;
        this.date = date;
        this.nomclinique = nomclinique;
        this.employe = employe;
    }

    public AntecedentChirurgicalDTO() {
    }
}
