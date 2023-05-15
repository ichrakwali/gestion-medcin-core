/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.Employe;
import com.csys.template.Entity.Societe;
import com.csys.template.dto.EmployeDTO;
import com.csys.template.factory.EmployeFactory;
import com.csys.template.repository.EmployeRepository;
import com.csys.template.repository.SocieteRepository;
import com.csys.template.util.Preconditions;
import com.csys.template.web.rest.EmployeRessource;
import java.util.List;
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
public class EmployeService {

    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private SocieteRepository societeRepository;
    private final Logger log = LoggerFactory.getLogger(EmployeRessource.class);

    public EmployeService(EmployeRepository employeRepository, SocieteRepository societeRepository) {
        this.employeRepository = employeRepository;
        this.societeRepository = societeRepository;
    }


    @Transactional(readOnly = true)
    public EmployeDTO findBynDossier(Integer id) {
        Employe employe = employeRepository.findBynDossier(id);
        return EmployeFactory.employeTOEmployeDTO(employe);
    }

    @Transactional(readOnly = true)

    public List<EmployeDTO> findAll() {
        log.debug("Request to employe findAll");

        List<Employe> result = employeRepository.findAll();
        return EmployeFactory.employesTOEmployeDTOs(result);
    }


    public EmployeDTO save(EmployeDTO employeDTO, Integer codesoc) {
        Societe societe = societeRepository.findByCodesoc(codesoc);
        Employe employe = EmployeFactory.employeDTOTOEmploye(employeDTO);
        employe.setSociete(societe);
        Employe employesave = employeRepository.save(employe);
        return EmployeFactory.employeTOEmployeDTO(employesave);
    }

    public EmployeDTO update(EmployeDTO employeDTO) {
        Employe employeInBase = employeRepository.findBynDossier(employeDTO.getnDossier());
        Preconditions.checkBusinessLogique(employeInBase != null, "Employe not found");

        employeInBase.setNom(employeDTO.getNom());
        employeInBase.setPrenom(employeDTO.getPrenom());
        employeInBase.setDelivree(employeDTO.getDelivree());
        employeInBase.setSituationmilitaire(employeDTO.getSituationmilitaire());
        employeInBase.setSituationFamille(employeDTO.getSituationFamille());
        employeInBase.setnAffectationCnss(employeDTO.getnAffectationCnss());
        employeInBase.setDiplomes(employeDTO.getDiplomes());
        employeInBase.setMatricule(employeDTO.getMatricule());
        employeInBase.setnCin(employeDTO.getnCin());
        employeInBase.setSexe(employeDTO.getSexe());
        employeInBase.setNiveauEtudes(employeDTO.getNiveauEtudes());

        employeInBase.setDateRecrutement(employeDTO.getDateRecrutement());
        employeInBase.setAdresse(employeDTO.getAdresse());
        employeInBase.setDateNaissance(employeDTO.getDateNaissance());
        //employeRepository.save(employeInBase); (not utile puisque object employeInBase is an entity from DB)
        employeInBase.setSociete(societeRepository.findByCodesoc(employeDTO.getSociete().getCodesoc()));

        return EmployeFactory.employeTOEmployeDTO(employeInBase);

    }

    public void delete(Integer id) {
        employeRepository.deleteBynDossier(id);
    }

}