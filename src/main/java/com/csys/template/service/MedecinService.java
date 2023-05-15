/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.Medecin;
import com.csys.template.Entity.Societe;

import com.csys.template.dto.MedecinDTO;

import com.csys.template.factory.MedecinFactory;
import com.csys.template.repository.MedecinRepository;
import com.csys.template.repository.SocieteRepository;

import java.util.List;

import com.csys.template.util.Preconditions;
import com.csys.template.web.rest.MedecinRessource;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
*/
@Service
@Transactional

public class MedecinService {
    @Autowired
    private MedecinRepository medecinRepository;
    @Autowired
    private SocieteRepository societeRepository;
    private final Logger log = LoggerFactory.getLogger(MedecinRessource.class);

    public MedecinService(SocieteRepository societeRepository, MedecinRepository medecinRepository) {

        this.societeRepository = societeRepository;
        this.medecinRepository = medecinRepository;
    }


    @Transactional(readOnly = true)
    public MedecinDTO findByCodemed(Integer id) {
        Medecin medecin = medecinRepository.findByCodemed(id);
        return MedecinFactory.medecinTOMedecinDTO(medecin);
    }

    @Transactional(readOnly = true)

    public List<MedecinDTO> findAll() {
        log.debug("Request to employe findAll");

        List<Medecin> result = medecinRepository.findAll();
        return MedecinFactory.medecinsTOMedecinDTOs(result);
    }

    public MedecinDTO save(MedecinDTO medecinDTO, Integer codesoc) {
        Societe societe = societeRepository.findByCodesoc(codesoc);
        Medecin medecin = MedecinFactory.medecinDTOTOMedecin(medecinDTO);
        medecin.setSociete(societe);
        Medecin medecinsave = medecinRepository.save(medecin);
        return MedecinFactory.medecinTOMedecinDTO(medecinsave);
    }

    public MedecinDTO update(MedecinDTO medecinDTO) {
        Medecin medecinInBase = medecinRepository.findByCodemed(medecinDTO.getCodemed());
        Preconditions.checkBusinessLogique(medecinInBase != null, "Medecin not found");

        medecinInBase.setNommed(medecinDTO.getNommed());
        medecinInBase.setPrenommed(medecinDTO.getPrenommed());
        medecinInBase.setAdresse(medecinDTO.getAdresse());
        medecinInBase.setEmailmed(medecinDTO.getEmailmed());
        medecinInBase.setTelmed(medecinDTO.getTelmed());
        medecinInBase.setEmplacement(medecinDTO.getEmplacement());
        medecinInBase.setSociete(societeRepository.findByCodesoc(medecinDTO.getSociete().getCodesoc()));
        return MedecinFactory.medecinTOMedecinDTO(medecinInBase);

    }
    public void delete(Integer id) {medecinRepository.deleteByCodemed(id);
    }

}





   

   

   

   

    
