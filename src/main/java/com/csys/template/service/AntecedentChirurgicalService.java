package com.csys.template.service;

import com.csys.template.Entity.AntecedentChirurgical;
import com.csys.template.Entity.Employe;
import com.csys.template.Entity.Societe;
import com.csys.template.dto.AntecedentChirurgicalDTO;
import com.csys.template.dto.EmployeDTO;
import com.csys.template.factory.AntecedentChirurgicalFactory;
import com.csys.template.factory.EmployeFactory;
import com.csys.template.factory.MedecinFactory;
import com.csys.template.repository.AntecedentChirurgicalRepository;
import com.csys.template.repository.EmployeRepository;
import com.csys.template.util.Preconditions;
import com.csys.template.web.rest.AntecedentChirurgicalRessource;
import com.csys.template.web.rest.EmployeRessource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AntecedentChirurgicalService {
    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private AntecedentChirurgicalRepository antecedentChirurgicalRepository;
    private final Logger log = LoggerFactory.getLogger(AntecedentChirurgicalRessource.class);

    public AntecedentChirurgicalService(EmployeRepository employeRepository, AntecedentChirurgicalRepository antecedentChirurgicalRepository) {
        this.employeRepository = employeRepository;
        this.antecedentChirurgicalRepository = antecedentChirurgicalRepository;
    }

    @Transactional(readOnly = true)
    public AntecedentChirurgicalDTO findByIdch(Long idch) {
        AntecedentChirurgical antecedentChirurgical = antecedentChirurgicalRepository.findByIdch(idch);
        return AntecedentChirurgicalFactory.antecedentChirurgicalTOAntecedentChirurgicalDTO(antecedentChirurgical);
    }

    @Transactional(readOnly = true)

    public List<AntecedentChirurgicalDTO> findAll() {
        log.debug("Request to antecedent chirurgical findAll");

        List<AntecedentChirurgical> result = antecedentChirurgicalRepository.findAll();
        return AntecedentChirurgicalFactory.antecedentChirurgicalsTOAntecedentChirurgicalDTOs(result);
    }

    public AntecedentChirurgicalDTO save(AntecedentChirurgicalDTO antecedentChirurgicalDTO, Integer nDossier) {
        Employe employe = employeRepository.findBynDossier(nDossier);
        AntecedentChirurgical antecedentChirurgical = AntecedentChirurgicalFactory.antecedentChirurgicalDTOTOAntecedentChirurgical(antecedentChirurgicalDTO);
        antecedentChirurgical.setEmploye(employe);
        AntecedentChirurgical antecedentChirurgicalsave = antecedentChirurgicalRepository.save(antecedentChirurgical);
        return AntecedentChirurgicalFactory.antecedentChirurgicalTOAntecedentChirurgicalDTO(antecedentChirurgicalsave);
    }

    public AntecedentChirurgicalDTO update(AntecedentChirurgicalDTO antecedentChirurgicalDTO) {
        AntecedentChirurgical antecedentChirurgicalInBase = antecedentChirurgicalRepository.findByIdch(antecedentChirurgicalDTO.getIdch());
        Preconditions.checkBusinessLogique(antecedentChirurgicalInBase != null, "Antecedent Chirurgical not found");
        antecedentChirurgicalInBase.setDescription(antecedentChirurgicalDTO.getDescription());
        antecedentChirurgicalInBase.setDate(antecedentChirurgicalDTO.getDate());
        antecedentChirurgicalInBase.setNomclinique(antecedentChirurgicalDTO.getNomclinique());
        antecedentChirurgicalInBase.setEmploye(employeRepository.findBynDossier(antecedentChirurgicalDTO.getEmploye().getnDossier()));
        return AntecedentChirurgicalFactory.antecedentChirurgicalTOAntecedentChirurgicalDTO(antecedentChirurgicalInBase);

    }

    public void delete(Long id) {
        antecedentChirurgicalRepository.deleteByIdch(id);
    }

}

