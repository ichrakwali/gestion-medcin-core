package com.csys.template.service;

import com.csys.template.Entity.AccidentTravail;
import com.csys.template.Entity.AntecedentChirurgical;
import com.csys.template.Entity.Employe;
import com.csys.template.dto.AccidentTravailDTO;
import com.csys.template.dto.AntecedentChirurgicalDTO;
import com.csys.template.factory.AccidentTravailFactory;
import com.csys.template.factory.AntecedentChirurgicalFactory;
import com.csys.template.repository.AccidentTravailRepository;
import com.csys.template.repository.EmployeRepository;
import com.csys.template.util.Preconditions;
import com.csys.template.web.rest.AccidentTravailRessource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AccidentTravailService {
    @Autowired
    private AccidentTravailRepository accidentTravailRepository;
    @Autowired
    private EmployeRepository employeRepository;
    private final Logger log = LoggerFactory.getLogger(AccidentTravailRessource.class);

    public AccidentTravailService(AccidentTravailRepository accidentTravailRepository, EmployeRepository employeRepository) {
        this.accidentTravailRepository = accidentTravailRepository;
        this.employeRepository = employeRepository;
    }

    @Transactional(readOnly = true)
    public AccidentTravailDTO findByIdAcc(Long id) {
        AccidentTravail accidentTravail = accidentTravailRepository.findByIdAcc(id);
        return AccidentTravailFactory.accidentTravailTOAccidentTravailDTO(accidentTravail);
    }

    @Transactional(readOnly = true)
    public List<AccidentTravailDTO> findAll() {
        log.debug("Request to accident findAll");
        List<AccidentTravail> result = accidentTravailRepository.findAll();
        return AccidentTravailFactory.accidentTravailsTOAccidentTravailDTOs(result);
    }

    public AccidentTravailDTO save(AccidentTravailDTO accidentTravailDTO, Integer nDossier) {
        Employe employe = employeRepository.findBynDossier(nDossier);
        AccidentTravail accidentTravail = AccidentTravailFactory.accidentTravailDTOTOAccidentTravail(accidentTravailDTO);
        accidentTravail.setEmploye(employe);
        AccidentTravail accidentTravailsave = accidentTravailRepository.save(accidentTravail);
        return AccidentTravailFactory.accidentTravailTOAccidentTravailDTO(accidentTravailsave);
    }

    public AccidentTravailDTO update(AccidentTravailDTO accidentTravailDTO) {
        AccidentTravail accidentTravailInBase = accidentTravailRepository.findByIdAcc(accidentTravailDTO.getIdAcc());
        Preconditions.checkBusinessLogique(accidentTravailInBase != null, "Accident Du travail not found");
        accidentTravailInBase.setDate(accidentTravailDTO.getDate());
        accidentTravailInBase.setCause(accidentTravailDTO.getCause());
        accidentTravailInBase.setNaturelLesion(accidentTravailDTO.getNaturelLesion());
        accidentTravailInBase.setSiegeLesion(accidentTravailDTO.getSiegeLesion());
        accidentTravailInBase.setDureeArret(accidentTravailDTO.getDureeArret());
        accidentTravailInBase.setIpp(accidentTravailDTO.getIpp());
        accidentTravailInBase.setEmploye(employeRepository.findBynDossier(accidentTravailDTO.getEmploye().getnDossier()));
        return AccidentTravailFactory.accidentTravailTOAccidentTravailDTO(accidentTravailInBase);
    }

    public void delete(Long id) {
        accidentTravailRepository.deleteByIdAcc(id);
    }

}