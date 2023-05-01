/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.Employe;
import com.csys.template.dto.EmployeDTO;
import com.csys.template.factory.EmployeFactory;
import com.csys.template.repository.EmployeRepository;
import com.csys.template.repository.SocieteRepository;
import com.csys.template.web.rest.EmployeRessource;
import java.util.List;
import javax.transaction.Transactional;
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
        private final Logger log = LoggerFactory.getLogger(EmployeRessource.class);


  public EmployeDTO findBynDossier(Integer id) {
        Employe employe = employeRepository.findBynDossier(id);
        return EmployeFactory.employeTOEmployeDTO(employe);
    }
@Transactional

    public List<EmployeDTO> findAll() {
             log.debug("Request to societe findAll");

        List<Employe> result = employeRepository.findAll();
        return EmployeFactory.employesTOEmployeDTOs(result);
    }

   
 public EmployeDTO save(EmployeDTO employeDTO) {
   Employe employe = EmployeFactory.employeDTOTOEmploye(employeDTO);
    Employe employesave  = employeRepository.save(employe);
     return EmployeFactory.employeTOEmployeDTO(employesave);
    }
// public EmployeDTO add(EmployeDTO employeDTO) {
//   Employe employe = EmployeFactory.employeDTOTOEmploye(employeDTO);
//    Employe employesave  = employeRepository.save(employe);
//     return EmployeFactory.employeTOEmployeDTO(employe);
    public Employe add(Employe employe) {
        return employeRepository.save(employe);
    }
 
    public Employe update(Employe employe) {
        return employeRepository.save(employe);
    }

    public void deleteEmploye(Integer nDossier) {
        employeRepository.delete(nDossier);
    }


    public void delete(Integer id) {
        employeRepository.delete(id);
    }

//    public Employe add(EmployeDTO employe) {
//         return employeRepository.save(employe); 
//    }
//
//    public Employe update(EmployeDTO employe) {   
//        return employeRepository.save(employe); 
//     
//    }

//    public Employe add(EmployeDTO employe) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public EmployeDTO save(EmployeDTO employeDTO) {
//        return employeDTO ;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
    public EmployeDTO add(EmployeDTO employe) {
    return employe;   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
  
  

 
 

    

   
}
