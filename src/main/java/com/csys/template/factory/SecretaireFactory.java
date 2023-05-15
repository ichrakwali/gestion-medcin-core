package com.csys.template.factory;

import com.csys.template.Entity.Secretaire;
import com.csys.template.dto.SecretaireDTO;

import java.util.ArrayList;
import java.util.List;

public class SecretaireFactory {

    public static Secretaire secretaireDTOTOSecretaire(SecretaireDTO secretaireDTO) {
        Secretaire secretaire = new Secretaire();
        secretaire.setNcin(secretaireDTO.getNcin());
        secretaire.setNomsec(secretaireDTO.getNomsec());
        secretaire.setPrenomsec(secretaireDTO.getPrenomsec());
        secretaire.setAdressesec(secretaireDTO.getAdressesec());
        secretaire.setEmailsec(secretaireDTO.getEmailsec());
        secretaire.setTelsec(secretaireDTO.getTelsec());
        secretaire.setSociete(SocieteFactory.SocieteDTOTOSociete(secretaireDTO.getSociete()));
        return secretaire;
    }
    public static SecretaireDTO secretaireTOSecretaireDTO(Secretaire secretaire ) {
        if (secretaire != null) {
            SecretaireDTO secretaireDTO = new SecretaireDTO();
            secretaireDTO.setNcin(secretaire.getNcin());
            secretaireDTO.setNomsec(secretaire.getNomsec());
            secretaireDTO.setPrenomsec(secretaire.getPrenomsec());
            secretaireDTO.setAdressesec(secretaire.getAdressesec());
            secretaireDTO.setEmailsec(secretaire.getEmailsec());
            secretaireDTO.setTelsec(secretaire.getTelsec());
            secretaireDTO.setSociete(SocieteFactory.societeTOSocieteDTO(secretaire.getSociete()));
            return secretaireDTO;
        } else {
            return null;
        }
    }

    public static List<SecretaireDTO> secretairesTOSecretaireDTOs(List<Secretaire> secretaires){
        List<SecretaireDTO> secretaireDTOs =new ArrayList<>();
        secretaires.stream().map((secretaire) -> secretaireTOSecretaireDTO(secretaire)).forEachOrdered((secretaireDTO) -> {
            secretaireDTOs.add(secretaireDTO);
        });
        return secretaireDTOs;
    }

}




