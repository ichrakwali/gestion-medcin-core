/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.ExamenMedical;
import com.csys.template.dto.ExamenMedicalDTO;
import com.csys.template.factory.ExamenMedicalFactory;
import com.csys.template.repository.ExamenMedicalRepository;
import com.csys.template.web.rest.ExamenMedicalRessource;
import java.util.List;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */   @Service
@Transactional
public class ExamenMedicalService {
 

    @Autowired 
     private ExamenMedicalRepository examenMedicalRepository;
        private final Logger log = LoggerFactory.getLogger(ExamenMedicalRessource.class);


  public ExamenMedicalDTO  findByIdExamen(Integer id) {
        ExamenMedical examenMedical = examenMedicalRepository. findByIdExamen(id);
        return ExamenMedicalFactory.examenMedicalTOExamenMedicalDTO(examenMedical);
    }
@Transactional

    public List<ExamenMedicalDTO> findAll() {
             log.debug("Request to societe findAll");

        List<ExamenMedical> result = examenMedicalRepository.findAll();
        return ExamenMedicalFactory.examenMedicalsTOExamenMedicalDTOs(result);
    }

   
 public ExamenMedicalDTO save(ExamenMedicalDTO examenMedicalDTO) {
   ExamenMedical examenMedical = ExamenMedicalFactory.examenMedicalDTOTOExamenMedical(examenMedicalDTO);
    ExamenMedical examenMedicalsave  = examenMedicalRepository.save(examenMedical);
     return ExamenMedicalFactory.examenMedicalTOExamenMedicalDTO(examenMedical);
    }
// public ExamenMedicalDTO add(ExamenMedicalDTO examenMedicalDTO) {
//   ExamenMedical examenMedical = ExamenMedicalFactory.examenMedicalDTOTOExamenMedical(examenMedicalDTO);
//    ExamenMedical examenMedicalsave  = examenMedicalRepository.save(examenMedical);
//     return ExamenMedicalFactory.examenMedicalTOExamenMedicalDTO(examenMedical);
    public ExamenMedical add(ExamenMedical examenMedical) {
        return examenMedicalRepository.save(examenMedical);
    }
 
    public ExamenMedical update(ExamenMedical examenMedical) {
        return examenMedicalRepository.save(examenMedical);
    }

    public void deleteExamenMedical(Integer Idcertificat) {
        examenMedicalRepository.delete(Idcertificat);
    }


    public void delete(Integer id) {
        examenMedicalRepository.delete(id);
    }

//    public ExamenMedical add(ExamenMedicalDTO examenMedical) {
//         return examenMedicalRepository.save(examenMedical); 
//    }
//
//    public ExamenMedical update(ExamenMedicalDTO examenMedical) {   
//        return examenMedicalRepository.save(examenMedical); 
//     
//    }

//    public ExamenMedical add(ExamenMedicalDTO examenMedical) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public ExamenMedicalDTO save(ExamenMedicalDTO examenMedicalDTO) {
//        return examenMedicalDTO ;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
    public ExamenMedicalDTO add(ExamenMedicalDTO examenMedicalDTO) {
    return examenMedicalDTO;   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}


