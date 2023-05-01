/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.Medecin;
import com.csys.template.dto.MedecinDTO;
import com.csys.template.dto.MedecinDTO;
import com.csys.template.factory.MedecinFactory;
import com.csys.template.repository.MedecinRepository;
import com.csys.template.web.rest.MedecinRessource;
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

public class MedecinService {
    
@Autowired 
     private MedecinRepository medecinRepository;
    private final Logger log = LoggerFactory.getLogger(MedecinRessource.class);
@Transactional
  public MedecinDTO findByCodemed(Integer id) {
        Medecin medecin = medecinRepository.findByCodemed(id);
        return MedecinFactory.medecinTOMedecinDTO(medecin);
    }

     
 public List<MedecinDTO> findAll() {
     log.debug("Request to societe findAll");
        List<Medecin> result = medecinRepository.findAll();
        return   MedecinFactory.medecinsTOMedecinDTOs(result);
//               
    }

    public Medecin add(Medecin medecin) {
        return medecinRepository.save(medecin);
    }
 public Medecin save(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    public Medecin update(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    public void deleteMedecin(Integer codemed) {
        medecinRepository.delete(codemed);
    }

    

//    public Medecin add(MedecinDTO medecin) { 
//        return medecinRepository.save(medecin);
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Medecin update(MedecinDTO medecin) {
//        return medecinRepository.save(medecin) ;
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public MedecinDTO add(MedecinDTO medecinDTO) {
    return medecinDTO;   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public MedecinDTO update(MedecinDTO medecin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   

   

   

   

   

    
}