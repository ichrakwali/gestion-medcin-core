/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.Medecin;
<<<<<<< HEAD
import com.csys.template.Entity.Societe;

import com.csys.template.dto.MedecinDTO;

import com.csys.template.factory.MedecinFactory;
import com.csys.template.repository.MedecinRepository;
import com.csys.template.repository.SocieteRepository;

import java.util.List;

import com.csys.template.util.Preconditions;
import com.csys.template.web.rest.MedecinRessource;
import org.springframework.transaction.annotation.Transactional;
=======
import com.csys.template.dto.MedecinDTO;
import com.csys.template.dto.MedecinDTO;
import com.csys.template.factory.MedecinFactory;
import com.csys.template.repository.MedecinRepository;
import com.csys.template.web.rest.MedecinRessource;
import java.util.List;
import javax.transaction.Transactional;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
<<<<<<< HEAD
*/
=======
 */
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
@Service
@Transactional

public class MedecinService {
<<<<<<< HEAD
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
=======
    
@Autowired 
     private MedecinRepository medecinRepository;
    private final Logger log = LoggerFactory.getLogger(MedecinRessource.class);
@Transactional
  public MedecinDTO findByCodemed(Integer id) {
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
        Medecin medecin = medecinRepository.findByCodemed(id);
        return MedecinFactory.medecinTOMedecinDTO(medecin);
    }

<<<<<<< HEAD
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




=======
     
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

   
   
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

   

   

   

   

    
<<<<<<< HEAD
=======
}
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
