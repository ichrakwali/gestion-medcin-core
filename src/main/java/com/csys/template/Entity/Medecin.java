/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.Entity;


//import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



/**
 *
 * @author Dell
<<<<<<< HEAD
*/
=======
 */
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
@Entity
public class Medecin implements Serializable {
     @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
<<<<<<< HEAD
     @Column(name="code_med")
    private Integer codemed;
    @Column(name=" nom_med")
    private String nommed;
    @Column(name="prenom_med")
    private String prenommed;
    @Column(name =" adresse_med")
    private String adresse;
    @Column(name ="email_med")
    private String emailmed;
    @Column(name=" telephone_med")
    private Integer telmed;
    @Column(name=" emplacement_med")
    private String emplacement;

    @ManyToOne(cascade = {CascadeType.MERGE , CascadeType.REMOVE})
    @JoinColumn(name = "code")
    private Societe societe;

=======
       @JsonProperty("codemed")
    private Integer codemed;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

    public Integer getCodemed() {
        return codemed;
    }

    public void setCodemed(Integer codemed) {
        this.codemed = codemed;
    }

<<<<<<< HEAD
=======
   

  
    private String nommed;
    private String prenommed;
    private String adresseEmailmed;
    private Integer telmed;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "codesoc")
    private Societe societe;
    @Column(name= "codesoc", insertable = false, updatable = false)
   
    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

   
   

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

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Medecin() {
    }

    public Medecin(Integer codemed, String nommed, String prenommed, String adresse, String emailmed, Integer telmed, String emplacement, Societe societe) {
        this.codemed = codemed;
        this.nommed = nommed;
        this.prenommed = prenommed;
        this.adresse = adresse;
        this.emailmed = emailmed;
        this.telmed = telmed;
        this.emplacement = emplacement;
        this.societe = societe;
    }


}
=======
    
   
//
//    public void setExamenMedicaux(ExamenMedicaux examenMedicaux) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public void setSociete(Societe societe) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public void setExamenMedicaux(ExamenMedicaux examenMedicaux) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    


   
    
}
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
