//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
//*/
//package com.csys.template.factory;
//
//
//import com.csys.template.Entity.Societe;
//
//import com.csys.template.dto.SocieteDTO;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author Dell
// 
//*/
//public class SocieteFactory {
//      private static Societe societe;
//    public static Societe societeDTOTOSociete(SocieteDTO societeDTO){
//        Societe societe = new Societe();
//        societe.setCodesoc(societeDTO.getCodesoc());
//        societe.setNomsociete(societeDTO.getNomsociete());
//        societe.setSecteurActivite(societeDTO.getSecteurActivite());
//        societe.setNotes(societeDTO.getNotes());
//        societe.setTelsociete(societeDTO.getTelsociete());
//        societe.setEmailsociete(societeDTO.getEmailsociete());
//        return societe;
//}
//        
//    
////         List<Employe>employes=new ArrayList<>();
////         for(EmployeDTO employeDTO : societeDTO.getEmployes()){
////             Employe employe =EmployeFactory.employeDTOTOEmploye(employeDTO);
////                 employe.setSociete(societe);
////             employes.add(employe);
////         }
////              societe.setEmployes(employes);
////         return societe;
////    }
//    public static SocieteDTO societeTOSocieteDTO(Societe societe){
//        if (societe!=null){
//        SocieteDTO societeDTO =new SocieteDTO();
//         societeDTO.setCodesoc(societeDTO.getCodesoc());
//         societeDTO.setNomsociete(societeDTO.getNomsociete());
//         societeDTO.setSecteurActivite(societeDTO.getSecteurActivite());
//         societeDTO.setEmployes(societeDTO.getEmployes());
//         societeDTO.setSecretaires(societeDTO.getSecretaires());
//         societeDTO.setMedecins(societeDTO.getMedecins());
//        return societeDTO;
//    } else {
//    return null;
//}
//     }
//     public static SocieteDTO lazySocieteTOSocieteDTO(Societe societe){
//        if (societe!=null){
//        SocieteDTO societeDTO =new SocieteDTO();
//        
//         societeDTO.setCodesoc(societeDTO.getCodesoc());
//         societeDTO.setNomsociete(societeDTO.getNomsociete());
//         societeDTO.setSecteurActivite(societeDTO.getSecteurActivite());
//        
//         
//          return societeDTO;
//    } else {
//return null;
//}
//     }
//     
//     public static List<SocieteDTO> societesTOSocieteDTOs(List<Societe> societes){
//        List<SocieteDTO> societeDTOs =new ArrayList<>();
//        for (Societe societe : societes){
//                SocieteDTO societeDTO = lazysocieteTOSocieteDTO(societe) ;
//                societeDTOs.add(societeDTO);
//        }
//          return societeDTOs;
//}
//
//    private static SocieteDTO lazysocieteTOSocieteDTO(Societe societe) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public static Societe SocieteDTOTOSociete(SocieteDTO societeDTO) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
////    private static SocieteDTO lazysocieteTOSocieteDTO(Societe societe) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
//
////    public static List<SocieteDTO> societesTOSocieteDTO(List<Societe> result) {
//////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
//
////    private static SocieteDTO lazysocieteTOSocieteDTO(Societe societe) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
//
////    public static Societe SocieteDTOTOSociete(SocieteDTO societeDTO) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
//
//    private SocieteFactory() {
//    }
//}





























/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.factory;

import com.csys.template.Entity.Employe;
<<<<<<< HEAD
//import com.csys.template.Entity.Medecin;
//import com.csys.template.Entity.QSociete;

//import com.csys.template.Entity.Secretaire;
=======
import com.csys.template.Entity.Medecin;
//import com.csys.template.Entity.QSociete;

import com.csys.template.Entity.Secretaire;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
import com.csys.template.Entity.Societe;
import com.csys.template.dto.EmployeDTO;
import com.csys.template.dto.MedecinDTO;
import com.csys.template.dto.SecretaireDTO;

import com.csys.template.dto.SocieteDTO;
<<<<<<< HEAD
import org.springframework.data.keyvalue.core.KeyValueOperations;
=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

import java.util.ArrayList;

import java.util.List;

/**
 * @author Dell
 */
public class SocieteFactory {

    //methode used to create new societe (POST)
    public static Societe SocieteDTOTOSociete(SocieteDTO societeDTO) {
        Societe societe = new Societe();
        societe.setNomsociete(societeDTO.getNomsociete());
        societe.setSecteurActivite(societeDTO.getSecteurActivite());
        societe.setEmailsociete(societeDTO.getEmailsociete());
        societe.setNotes(societeDTO.getNotes());
        societe.setTelsociete(societeDTO.getTelsociete());
        return societe;
    }

<<<<<<< HEAD
=======

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    public static SocieteDTO societeTOSocieteDTO(Societe societe) {
        if (societe != null) {
            SocieteDTO societeDTO = new SocieteDTO();
            societeDTO.setCodesoc(societe.getCodesoc());
            societeDTO.setNomsociete(societe.getNomsociete());
            societeDTO.setNotes(societe.getNotes());
            societeDTO.setSecteurActivite(societe.getSecteurActivite());
            societeDTO.setTelsociete(societe.getTelsociete());
            societeDTO.setEmailsociete(societe.getEmailsociete());
            return societeDTO;
        } else {
            return null;
        }
    }


    public static List<SocieteDTO> societesTOSocieteDTOs(List<Societe> societes) {
        List<SocieteDTO> societeDTOs = new ArrayList<>();
        for (Societe societe : societes) {
            SocieteDTO societeDTO = societeTOSocieteDTO(societe);
            societeDTOs.add(societeDTO);
        }
        return societeDTOs;
    }


}
