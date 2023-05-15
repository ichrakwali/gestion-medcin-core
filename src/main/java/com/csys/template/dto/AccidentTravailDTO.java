package com.csys.template.dto;



import java.util.Date;

public class AccidentTravailDTO {
    private Long idAcc;
    private Date date;
    private String cause ;
    private String naturelLesion;
    private String siegeLesion;
    private Date dureeArret ;
    private Integer ipp;
    private EmployeDTO employe;

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

    public EmployeDTO getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDTO employe) {
        this.employe = employe;
    }

    public AccidentTravailDTO(Long idAcc, Date date, String cause, String naturelLesion, String siegeLesion, Date dureeArret, Integer ipp, EmployeDTO employe) {
        this.idAcc = idAcc;
        this.date = date;
        this.cause = cause;
        this.naturelLesion = naturelLesion;
        this.siegeLesion = siegeLesion;
        this.dureeArret = dureeArret;
        this.ipp = ipp;
        this.employe = employe;
    }

    public AccidentTravailDTO() {
    }
}
