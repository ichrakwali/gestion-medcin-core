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
import javax.transaction.Transactional;


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

//  private final Logger log = LoggerFactory.getLogger(SecretaireRessource.class);
  
  
    SecretaireRepository secretaireRepository;

    public SecretaireDTO findByNcin(Integer id) {

        Secretaire secretaire = secretaireRepository.findByNcin(id);
        return SecretaireFactory.secretaireTOSecretaireDTO(secretaire);
    }

    public List<SecretaireDTO> findAll() {
        List<Secretaire> result = secretaireRepository.findAll();
        return SecretaireFactory.secretairesTOSecretaireDTOs(result);
    }

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

   

   

   
 
   

  



  
}

    

  
