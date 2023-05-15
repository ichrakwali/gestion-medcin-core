/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
<<<<<<< HEAD
 *//*
package com.csys.template.dto;

import com.csys.template.Entity.Employe;
import com.csys.template.Entity*.Medecin;
=======
 */
package com.csys.template.dto;

import com.csys.template.Entity.Employe;
import com.csys.template.Entity.Medecin;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
import com.csys.template.Entity.Secretaire;

/**
 *
 * @author Dell
<<<<<<< HEAD

=======
 */
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
public class ExamenMedicalDTO {

    private Integer idExamen;
    private String date;
    private String Motif;
    private String conclusion;
<<<<<<< HEAD
   // private Employe employe;
    //private Medecin medecin;
    //private Secretaire secretaire;
=======
    private Employe employe;
    private Medecin medecin;
    private Secretaire secretaire;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

    public Integer getIdExamen() {
        return idExamen;
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

<<<<<<< HEAD
    //public Employe getEmploye() {
    //    return employe;
   // }

   /// public void setEmploye(Employe employe) {
     //   this.employe = employe;
    //}

    //public Medecin getMedecin() {
      //  return medecin;
    //}

   // public void setMedecin(Medecin medecin) {
   //     this.medecin = medecin;
   // }

   // public Secretaire getSecretaire() {
    //    return secretaire;
    //}

   // public void setSecretaire(Secretaire secretaire) {
   //     this.secretaire = secretaire;
   // }
}
*/
=======
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
}
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
