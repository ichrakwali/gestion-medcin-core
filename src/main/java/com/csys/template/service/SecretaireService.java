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
<<<<<<< HEAD

import com.csys.template.util.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.csys.template.web.rest.SecretaireRessource;
import org.springframework.transaction.annotation.Transactional;
import com.csys.template.repository.SocieteRepository;
=======
import javax.transaction.Transactional;

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 
<<<<<<< HEAD
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
=======
 */ 
@Service
@Transactional
public class SecretaireService {
    

@Autowired 

//  private final Logger log = LoggerFactory.getLogger(SecretaireRessource.class);
  
  
    SecretaireRepository secretaireRepository;

    public SecretaireDTO findByNcin(Integer id) {

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
        Secretaire secretaire = secretaireRepository.findByNcin(id);
        return SecretaireFactory.secretaireTOSecretaireDTO(secretaire);
    }

<<<<<<< HEAD
   @Transactional(readOnly = true)
    public List<SecretaireDTO> findAll() {
        log.debug("Request to secretaire findAll");
=======
    public List<SecretaireDTO> findAll() {
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
        List<Secretaire> result = secretaireRepository.findAll();
        return SecretaireFactory.secretairesTOSecretaireDTOs(result);
    }

<<<<<<< HEAD
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
=======
//    public Secretaire save(Secretaire secretaire) {
//        return secretaireRepository.save(secretaire);
//    }
public SecretaireDTO add(SecretaireDTO secretaireDTO) {
   Secretaire secretaire = SecretaireFactory.secretaireDTOTOSecretaire(secretaireDTO);
    Secretaire secretairesave  = secretaireRepository.save(secretaire);
     return SecretaireFactory.secretaireTOSecretaireDTO(secretaire);
    }

    public SecretaireDTO save(SecretaireDTO secretaireDTO) {
        return secretaireRepository.save(secretaireDTO);
    }
public SecretaireDTO update(SecretaireDTO secretaireDTO) {
   Secretaire secretaire = SecretaireFactory.secretaireDTOTOSecretaire(secretaireDTO);
    Secretaire secretairesave  = secretaireRepository.save(secretaire);
     return SecretaireFactory.secretaireTOSecretaireDTO(secretaire);
    }
//    public Secretaire update(Secretaire secretaire) {
//        return secretaireRepository.save(secretaire);
//    }

    public void deleteSecretaire(Integer Ncin) {
        secretaireRepository.delete(Ncin);
    }


    
   

    

    public Integer delete(Integer id) {
     return id;   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

   

   
 
   

  



  
<<<<<<< HEAD

=======
}

    
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

  
