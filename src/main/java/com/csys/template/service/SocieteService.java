/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;



import com.csys.template.Entity.Societe;
import com.csys.template.dto.SocieteDTO;
import com.csys.template.factory.SocieteFactory;
import com.csys.template.repository.EmployeRepository;
import com.csys.template.repository.MedecinRepository;
import com.csys.template.repository.SecretaireRepository;
import com.csys.template.repository.SocieteRepository;
import com.csys.template.util.Preconditions;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Dell
 */

@Service
@Transactional
public class SocieteService {


    private final Logger log = LoggerFactory.getLogger(SocieteService.class);

    @Autowired
    SocieteRepository societeRepository;
    @Autowired
    EmployeRepository employeRepository;
    @Autowired
    SecretaireRepository secretaireRepository;
    @Autowired
    MedecinRepository medecinRepository;


    @Transactional(readOnly = true)
    public SocieteDTO findByCodesoc(Integer id) {
        Societe societe = societeRepository.findByCodesoc(id);
        return SocieteFactory.societeTOSocieteDTO(societe);
    }

    @Transactional(readOnly = true)
    public List<SocieteDTO> findAll() {
        log.debug("Request to societe findAll");
        List<Societe> result = societeRepository.findAll();
        return SocieteFactory.societesTOSocieteDTOs(result);
    }

    public SocieteDTO save(SocieteDTO societeDTO) {
        Societe societe = SocieteFactory.SocieteDTOTOSociete(societeDTO);
        societe = societeRepository.save(societe);
        return SocieteFactory.societeTOSocieteDTO(societe);
    }

    public SocieteDTO update(SocieteDTO societeDTO) {
        Societe societeInBase = societeRepository.findByCodesoc(societeDTO.getCodesoc());
        Preconditions.checkBusinessLogique(societeInBase != null, "Societe not found");

        societeInBase.setNomsociete(societeDTO.getNomsociete());
        societeInBase.setSecteurActivite(societeDTO.getSecteurActivite());
        societeInBase.setEmailsociete(societeDTO.getEmailsociete());
        societeInBase.setNotes(societeDTO.getNotes());
        societeInBase.setTelsociete(societeDTO.getTelsociete());
        //societeRepository.save(societeInBase); (not utile puisque object societeInBase is an entity from DB)
        return SocieteFactory.societeTOSocieteDTO(societeInBase);
    }

}

  

  

    