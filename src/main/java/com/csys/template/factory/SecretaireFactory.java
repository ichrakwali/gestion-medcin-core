/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/ 
package com.csys.template.factory;

import com.csys.template.Entity.Secretaire;
import com.csys.template.dto.SecretaireDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class SecretaireFactory {
      private static Secretaire secretaire;
    public static Secretaire secretaireDTOTOSecretaire(SecretaireDTO secretaireDTO){
               Secretaire secretaire =new Secretaire();
               secretaire.setNcin(secretaireDTO.getNcin());
               secretaire.setNomsec(secretaireDTO.getNomsec());
               secretaire.setPrenomsec(secretaireDTO.getPrenomsec());
               secretaire.setAdresseEmailsec(secretaireDTO.getAdresseEmailsec());
               secretaire.setTelsec(secretaireDTO.getTelsec());
//               secretaire.setCodesoc(secretaireDTO.getCodesoc());
            secretaire.setSociete(secretaireDTO.getSociete());
                return secretaire;
    }
               
        public static SecretaireDTO secretaireTOSecretaireDTO(Secretaire secretaire){
        if (secretaire!=null){
        SecretaireDTO secretaireDTO =new SecretaireDTO();
        secretaireDTO.setNcin(secretaire.getNcin());
        secretaireDTO.setNomsec(secretaire.getNomsec());
        secretaireDTO.setPrenomsec(secretaire.getPrenomsec());
        secretaireDTO.setAdresseEmailsec(secretaire.getAdresseEmailsec());
        secretaireDTO.setTelsec(secretaire.getTelsec());
        
//        secretaireDTO.setCodesoc(secretaire.getCodesoc());
            secretaireDTO.setSociete(secretaire.getSociete());
            return secretaireDTO;
    } else {
    return null;
}
         }
   public static List <SecretaireDTO> secretairesTOSecretaireDTOs(List<Secretaire> secretaires){
        List<SecretaireDTO> secretaireDTOs =new ArrayList<>();
        secretaires.stream().map((secretaire) -> secretaireTOSecretaireDTO(secretaire)).forEachOrdered((secretaireDTO) -> {
            secretaireDTOs.add(secretaireDTO);
         });
          return secretaireDTOs;
}

//    public static Secretaire secretaireDTOToSecretaire(SecretaireDTO secretaireDTO, Object object) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public static SecretaireDTO secretaireToSecretaireDTO(Secretaire secretaire) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public static Secretaire secretaireDTOToSecretaire(SecretaireDTO secretaireDTO) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   
}
