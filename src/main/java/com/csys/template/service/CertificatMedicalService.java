/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.CertificatMedical;
import com.csys.template.dto.CertificatMedicalDTO;
import com.csys.template.factory.CertificatMedicalFactory;
import com.csys.template.repository.CertificatMedicalRepository;
import com.csys.template.web.rest.CertificatMedicalRessource;
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
public class CertificatMedicalService {
    @Autowired 
     private CertificatMedicalRepository certificatMedicalRepository;
        private final Logger log = LoggerFactory.getLogger(CertificatMedicalRessource.class);


  public CertificatMedicalDTO  findByIdcertificat(Integer id) {
        CertificatMedical certificatMedical = certificatMedicalRepository. findByIdcertificat(id);
        return CertificatMedicalFactory.certificatMedicalTOCertificatMedicalDTO(certificatMedical);
    }
@Transactional

    public List<CertificatMedicalDTO> findAll() {
             log.debug("Request to societe findAll");

        List<CertificatMedical> result = certificatMedicalRepository.findAll();
        return CertificatMedicalFactory.certificatMedicalsTOCertificatMedicalDTOs(result);
    }

   
 public CertificatMedicalDTO save(CertificatMedicalDTO certificatMedicalDTO) {
   CertificatMedical certificatMedical = CertificatMedicalFactory.certificatMedicalDTOTOCertificatMedical(certificatMedicalDTO);
    CertificatMedical certificatMedicalsave  = certificatMedicalRepository.save(certificatMedical);
     return CertificatMedicalFactory.certificatMedicalTOCertificatMedicalDTO(certificatMedical);
    }
// public CertificatMedicalDTO add(CertificatMedicalDTO certificatMedicalDTO) {
//   CertificatMedical certificatMedical = CertificatMedicalFactory.certificatMedicalDTOTOCertificatMedical(certificatMedicalDTO);
//    CertificatMedical certificatMedicalsave  = certificatMedicalRepository.save(certificatMedical);
//     return CertificatMedicalFactory.certificatMedicalTOCertificatMedicalDTO(certificatMedical);
    public CertificatMedical add(CertificatMedical certificatMedical) {
        return certificatMedicalRepository.save(certificatMedical);
    }
 
    public CertificatMedical update(CertificatMedical certificatMedical) {
        return certificatMedicalRepository.save(certificatMedical);
    }

    public void deleteCertificatMedical(Integer Idcertificat) {
        certificatMedicalRepository.delete(Idcertificat);
    }


    public void delete(Integer id) {
        certificatMedicalRepository.delete(id);
    }

//    public CertificatMedical add(CertificatMedicalDTO certificatMedical) {
//         return certificatMedicalRepository.save(certificatMedical); 
//    }
//
//    public CertificatMedical update(CertificatMedicalDTO certificatMedical) {   
//        return certificatMedicalRepository.save(certificatMedical); 
//     
//    }

//    public CertificatMedical add(CertificatMedicalDTO certificatMedical) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public CertificatMedicalDTO save(CertificatMedicalDTO certificatMedicalDTO) {
//        return certificatMedicalDTO ;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
    public CertificatMedicalDTO add(CertificatMedicalDTO certificatMedicalDTO) {
    return certificatMedicalDTO;   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
