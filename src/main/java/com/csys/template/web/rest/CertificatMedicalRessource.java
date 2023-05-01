/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;

import com.csys.template.Entity.CertificatMedical;
import com.csys.template.dto.CertificatMedicalDTO;
import com.csys.template.service.CertificatMedicalService;
import com.csys.template.util.RestPreconditions;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
@RequestMapping("/certif" )
public class CertificatMedicalRessource {
      @Autowired
    CertificatMedicalService certificatMedicalService;
    private static final String ENTITY_NAME = "CertificatMedical";
 private final Logger log = LoggerFactory.getLogger(CertificatMedicalRessource.class);

    @GetMapping("/certificatMedicals")
    public List<CertificatMedicalDTO> findAll() {
        return certificatMedicalService.findAll();
    }
    @GetMapping("/(id)")
    
    public CertificatMedicalDTO findByIdcertificat(@PathVariable Integer id) {
        CertificatMedicalDTO certificatMedical = certificatMedicalService.findByIdcertificat(id);
        RestPreconditions.checkFound(certificatMedical);
        return certificatMedicalService.findByIdcertificat(id);
    }

    @PostMapping("/certificatMedicals")
    public ResponseEntity<CertificatMedicalDTO> addCertificatMedicalDTO( @Valid @RequestBody CertificatMedicalDTO certificatMedical, BindingResult bindingResults , CertificatMedical certificatMedicalDTO) throws URISyntaxException, MethodeArgumentNotValidException {//throws URISyntaxException{ //MethodeArgumentNotValidException {//throws URISyntaxException, MethodeArgumentNotValidException{
        if (certificatMedical.getIdcertificat() != null) {
            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an certificatMedical with a code"));
            //throw new MethodeArgumentNotValidException(null bindingResults);
        }
              CertificatMedicalDTO result = certificatMedicalService.save(certificatMedical);
        return ResponseEntity.created(new URI("/certif/certificatMedicals/" + result.getIdcertificat())).body(result);
    }
//    @PostMapping("/certificatMedicals")
//    public CertificatMedicalDTO addCertificatMedicalDTO(  @RequestBody CertificatMedicalDTO certificatMedical) throws URISyntaxException, MethodeArgumentNotValidException {//throws URISyntaxException{ //MethodeArgumentNotValidException {//throws URISyntaxException, MethodeArgumentNotValidException{
////        if (certificatMedical.getnDossier() != null) {
////            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an certificatMedical with a code"));
////            throw new MethodeArgumentNotValidException(null bindingResults);
//        
//              CertificatMedicalDTO result = certificatMedicalService.save(certificatMedical);
//                return result;
//    }
    
// 
// 
    
//   @PostMapping("/add")
//   public ResponseEntity<CertificatMedicalDTO> addCertificatMedicalDTO(@RequestBody CertificatMedicalDTO certificatMedical, BindingResult bindingResults) throws URISyntaxException ,MethodeArgumentNotValidException{//throws URISyntaxException, MethodeArgumentNotValidException{
//if (certificatMedical.getnDossier()!=null){
//bindingResults.addError(new FieldError(ENTITY_NAME,"code","postdoes not allow an certificatMedical with a code"));
//    throw new MethodeArgumentNotValidException(null,bindingResults);
//
//        CertificatMedicalDTO result = certificatMedicalService.save(certificatMedical);
//        return ResponseEntity.created(new URI("/api/certificatMedicals/" + result.getnDossier())).body(result);
//    }

    @PutMapping("/certificatMedicals")
    public ResponseEntity<CertificatMedicalDTO> updateCertificatMedicalDTO(@RequestBody CertificatMedicalDTO certificatMedical) throws URISyntaxException {
        CertificatMedicalDTO result = certificatMedicalService.save(certificatMedical);
        return ResponseEntity.ok(result);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCertificatMedicalDTO(@PathVariable Integer id) {
        certificatMedicalService.delete(id);
        return ResponseEntity.ok().build();
    }

    
    
}


