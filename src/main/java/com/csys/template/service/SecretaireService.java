/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.Secretaire;
import com.csys.template.Entity.Societe;
import com.csys.template.dto.SecretaireDTO;
import com.csys.template.factory.SecretaireFactory;
import com.csys.template.repository.SecretaireRepository;



import java.util.List;

import com.csys.template.util.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.csys.template.web.rest.SecretaireRessource;
import org.springframework.transaction.annotation.Transactional;
import com.csys.template.repository.SocieteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 
*/
@Service
@Transactional
public class SecretaireService {

    @Autowired
    private SecretaireRepository secretaireRepository;
    @Autowired
    private SocieteRepository societeRepository;
    private final Logger log = LoggerFactory.getLogger(SecretaireRessource.class);

    public SecretaireService(SecretaireRepository secretaireRepository, SocieteRepository societeRepository) {
        this.secretaireRepository = secretaireRepository;
        this.societeRepository = societeRepository;
    }

    @Transactional (readOnly = true)
    public SecretaireDTO findByNcin(Integer id) {
        Secretaire secretaire = secretaireRepository.findByNcin(id);
        return SecretaireFactory.secretaireTOSecretaireDTO(secretaire);
    }

   @Transactional(readOnly = true)
    public List<SecretaireDTO> findAll() {
        log.debug("Request to secretaire findAll");
        List<Secretaire> result = secretaireRepository.findAll();
        return SecretaireFactory.secretairesTOSecretaireDTOs(result);
    }

    public SecretaireDTO save(SecretaireDTO secretaireDTO, Integer codesoc) {
        Societe societe = societeRepository.findByCodesoc(codesoc);
        Secretaire secretaire = SecretaireFactory.secretaireDTOTOSecretaire(secretaireDTO);
        secretaire.setSociete(societe);
        Secretaire secretairesave = secretaireRepository.save(secretaire);

    return SecretaireFactory.secretaireTOSecretaireDTO(secretairesave);
    }
    public SecretaireDTO update(SecretaireDTO secretaireDTO) {
        Secretaire secretaireInBase = secretaireRepository.findByNcin(secretaireDTO.getNcin());
        Preconditions.checkBusinessLogique(secretaireInBase != null, "Employe not found");

        secretaireInBase.setNcin(secretaireDTO.getNcin());
        secretaireInBase.setNomsec(secretaireDTO.getNomsec());
        secretaireInBase.setPrenomsec(secretaireDTO.getPrenomsec());
        secretaireInBase.setAdressesec(secretaireDTO.getAdressesec());
        secretaireInBase.setEmailsec(secretaireDTO.getEmailsec());
        secretaireInBase.setTelsec(secretaireDTO.getTelsec());
        secretaireInBase.setSociete(societeRepository.findByCodesoc(secretaireDTO.getSociete().getCodesoc()));
        return SecretaireFactory.secretaireTOSecretaireDTO(secretaireInBase);

    }


    public void delete(Integer id) {
        secretaireRepository.deleteByNcin(id);
    }

}

   

   
 
   

  



  


  
