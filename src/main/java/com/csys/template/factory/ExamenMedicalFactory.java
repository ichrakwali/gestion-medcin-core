/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
package com.csys.template.factory;

import com.csys.template.Entity.ExamenMedical;
import com.csys.template.dto.ExamenMedicalDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell

public class ExamenMedicalFactory {
    private static ExamenMedical examenMedical;
    public static ExamenMedical examenMedicalDTOTOExamenMedical(ExamenMedicalDTO examenMedicalDTO){
     ExamenMedical examenMedical =new ExamenMedical();
        examenMedical.setIdExamen(examenMedicalDTO.getIdExamen());
        examenMedical.setMotif(examenMedicalDTO.getMotif());
        examenMedical.setDate(examenMedicalDTO.getDate());
        examenMedical.setConclusion(examenMedicalDTO.getConclusion());
      //  examenMedical.setEmploye(examenMedicalDTO.getEmploye());
        //examenMedical.setMedecin(examenMedicalDTO.getMedecin());
        //examenMedical.setSecretaire(examenMedicalDTO.getSecretaire());
       //examenMedical.setEmploye(ExamenMedicalFactory .examenMedicalDTOTOExamenMedical(examenMedicalDTO.getEmploye()));
        return examenMedical;
              }
    public static ExamenMedicalDTO examenMedicalTOExamenMedicalDTO(ExamenMedical examenMedical){
        if (examenMedical!=null){
            ExamenMedicalDTO examenMedicalDTO = new ExamenMedicalDTO();

            examenMedicalDTO.setIdExamen(examenMedical.getIdExamen());
            examenMedicalDTO.setMotif(examenMedical.getMotif());
            examenMedicalDTO.setDate(examenMedical.getDate());
            examenMedicalDTO.setConclusion(examenMedical.getConclusion());
            //examenMedicalDTO.setEmploye(examenMedical.getEmploye());
            //examenMedicalDTO.setMedecin(examenMedical.getMedecin());
            //examenMedicalDTO.setSecretaire(examenMedical.getSecretaire());
           
//            examenMedicalDTO.setCodesoc(examenMedical.getCodesoc()); 3leh 
//            examenMedicalDTO.setSociete(SocieteFactory.lazySocieteTOSocieteDTO(examenMedical.getSociete())); 
        
       return examenMedicalDTO;
    } else {
    return null;
}

    }


      public static List <ExamenMedicalDTO> examenMedicalsTOExamenMedicalDTOs(List<ExamenMedical> examenMedicals){
        List<ExamenMedicalDTO> examenMedicalDTOs =new ArrayList<>();
        examenMedicals.stream().map((examenMedical) -> examenMedicalTOExamenMedicalDTO(examenMedical)).forEachOrdered((examenMedicalDTO) -> {
            examenMedicalDTOs.add(examenMedicalDTO);
         });
          return examenMedicalDTOs;
      }
        
        
    
   
}
*/