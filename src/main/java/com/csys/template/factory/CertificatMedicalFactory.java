/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
package com.csys.template.factory;

import com.csys.template.Entity.CertificatMedical;
import com.csys.template.Entity.Employe;
import com.csys.template.dto.CertificatMedicalDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell

public class CertificatMedicalFactory {
    
    private static CertificatMedical certificatMedical;
    public static CertificatMedical certificatMedicalDTOTOCertificatMedical(CertificatMedicalDTO certificatMedicalDTO){
     CertificatMedical certificatMedical =new CertificatMedical();
        certificatMedical.setIdcertificat(certificatMedicalDTO.getIdcertificat());
        certificatMedical.setRaisonSocial(certificatMedicalDTO.getRaisonSocial());
        certificatMedical.setNatureActivite(certificatMedicalDTO.getNatureActivite());
        certificatMedical.setNcss(certificatMedicalDTO.getNcss());
        certificatMedical.setDateExamen(certificatMedicalDTO.getDateExamen());
       
      // certificatMedical.setEmploye(certificatMedicalDTO.getEmploye());
        
//      certificatMedical.setEmploye(CertificatMedicalFactory.certificatMedicalDTOTOCertificatMedical(certificatMedicalDTO.getEmploye()));
        return certificatMedical;
              }
    public static CertificatMedicalDTO certificatMedicalTOCertificatMedicalDTO(CertificatMedical certificatMedical){
        if (certificatMedical!=null){
            CertificatMedicalDTO certificatMedicalDTO = new CertificatMedicalDTO();

            certificatMedicalDTO.setIdcertificat(certificatMedical.getIdcertificat());
            certificatMedicalDTO.setRaisonSocial(certificatMedical.getRaisonSocial());
            certificatMedicalDTO.setNatureActivite(certificatMedical.getNatureActivite());
            certificatMedicalDTO.setNcss(certificatMedical.getNcss());
            certificatMedicalDTO.setDateExamen(certificatMedical.getDateExamen());
          //   certificatMedicalDTO.setEmploye(certificatMedical.getEmploye());
        
            
//            certificatMedicalDTO.setEmploye(CertificatMedicalFactory.CertificatMedicalTOCertificatMedicalDTO(certificatMedical.getEmploye())); 
        
       return certificatMedicalDTO;
    } else {
    return null;
}

    }


      public static List <CertificatMedicalDTO> certificatMedicalsTOCertificatMedicalDTOs(List<CertificatMedical> certificatMedicals){
        List<CertificatMedicalDTO> certificatMedicalDTOs =new ArrayList<>();
        certificatMedicals.stream().map((certificatMedical) -> certificatMedicalTOCertificatMedicalDTO(certificatMedical)).forEachOrdered((certificatMedicalDTO) -> {
            certificatMedicalDTOs.add(certificatMedicalDTO);
         });
          return certificatMedicalDTOs;
      }

    
    
    
    
    
    
}
*/