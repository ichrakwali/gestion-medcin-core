/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.factory;

import com.csys.template.Entity.Employe;
import com.csys.template.dto.EmployeDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class EmployeFactory {
 
    public static Employe employeDTOTOEmploye(EmployeDTO employeDTO){
     Employe employe =new Employe();
        employe.setnDossier(employeDTO.getnDossier());
        employe.setNom(employeDTO.getNom());
        employe.setPrenom(employeDTO.getPrenom());
        employe.setDelivree(employeDTO.getDelivree());
        employe.setSituationmilitaire(employeDTO.getSituationmilitaire());
        employe.setSituationFamille(employeDTO.getSituationFamille());
        employe.setnAffectationCnss(employeDTO.getnAffectationCnss());
        employe.setDiplomes(employeDTO.getDiplomes());
        employe.setMatricule(employeDTO.getMatricule()); 
        employe.setnCin(employeDTO.getnCin());
        employe.setSexe(employeDTO.getSexe());
        employe.setNiveauEtudes(employeDTO.getNiveauEtudes());
       
        employe.setDateRecrutement(employeDTO.getDateRecrutement());
        employe.setAdresse(employeDTO.getAdresse());
        employe.setDateNaissance(employeDTO.getDateNaissance());
       employe.setSociete(SocieteFactory.SocieteDTOTOSociete(employeDTO.getSociete()));
        return employe;
              }
    public static EmployeDTO employeTOEmployeDTO(Employe employe){
        if (employe!=null){
            EmployeDTO employeDTO = new EmployeDTO();

            employeDTO.setnDossier(employe.getnDossier());
            employeDTO.setNom(employe.getNom());
            employeDTO.setPrenom(employe.getPrenom());
            employeDTO.setDelivree(employe.getDelivree());
            employeDTO.setSituationmilitaire(employe.getSituationmilitaire());
            employeDTO.setSituationFamille(employe.getSituationFamille());
            employeDTO.setnAffectationCnss(employe.getnAffectationCnss());
            employeDTO.setDiplomes(employe.getDiplomes());
            employeDTO.setMatricule(employe.getMatricule());
            employeDTO.setnCin(employe.getnCin());
            employeDTO.setSexe(employe.getSexe());
            employeDTO.setNiveauEtudes(employe.getNiveauEtudes());
            employeDTO.setDateRecrutement(employe.getDateRecrutement());  
            employeDTO.setAdresse(employe.getAdresse());
            employeDTO.setDateNaissance(employe.getDateNaissance());
//            employeDTO.setCodesoc(employe.getCodesoc()); 3leh 

        
       return employeDTO;
    } else {
    return null;
}

    }


      public static List <EmployeDTO> employesTOEmployeDTOs(List<Employe> employes){
        List<EmployeDTO> employeDTOs =new ArrayList<>();
        employes.stream().map((employe) -> employeTOEmployeDTO(employe)).forEachOrdered((employeDTO) -> {
            employeDTOs.add(employeDTO);
         });
          return employeDTOs;
      }
        
        
    
   
}
