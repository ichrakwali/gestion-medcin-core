<<<<<<< HEAD
package com.csys.template.web.rest;


=======


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/ 
package com.csys.template.web.rest;


import com.csys.template.Entity.Secretaire;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
import com.csys.template.dto.SecretaireDTO;

import com.csys.template.service.SecretaireService;
import com.csys.template.util.RestPreconditions;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/secretaires" )
public class SecretaireRessource {


    @Autowired
    SecretaireService secretaireService;
    private static final String ENTITY_NAME = "Secretaire";
    public SecretaireRessource(SecretaireService secretaireService) {
        this.secretaireService = secretaireService;
    }
    @GetMapping("")
    public List<SecretaireDTO> findAll() {
        return secretaireService.findAll();
    }

=======

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;



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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;




import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
@RequestMapping("/sec")

public class SecretaireRessource {
    @Autowired
    SecretaireService secretaireService;
    private static final String ENTITY_NAME = "Secretaire";
     
   private final Logger log = LoggerFactory.getLogger(SecretaireRessource.class);
         
    @GetMapping("/secretaires")
    public List<SecretaireDTO> findAll() {
        return secretaireService.findAll();
    
    }
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    @GetMapping("/(id)")
    public SecretaireDTO findByNcin(@PathVariable Integer id) {
        SecretaireDTO secretaire = secretaireService.findByNcin(id);
        RestPreconditions.checkFound(secretaire);
        return secretaireService.findByNcin(id);
    }
<<<<<<< HEAD
    @PostMapping("/{codesoc}")
    public ResponseEntity<SecretaireDTO> addSecretaireDTO(@PathVariable Integer codesoc, @Valid @RequestBody SecretaireDTO secretaireDTO, BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {

        if ( secretaireDTO.getNcin() == null )
        {
            bindingResults.addError(new FieldError(ENTITY_NAME, "ncin", "post does not accept ncin"));
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        SecretaireDTO result = secretaireService.save(secretaireDTO,codesoc);
        return ResponseEntity.created(new URI("/api/secretaires/" + result.getNcin())).body(result);
    }

// secretaire.getNcin().isEmpty()


    @PutMapping("/{id}")
    public ResponseEntity<SecretaireDTO> updateSecretaireDTO(@PathVariable Integer id,@RequestBody SecretaireDTO secretaireDTO) {
        SecretaireDTO result = secretaireService.update(secretaireDTO);
=======

            
            
    @PostMapping("/secretaires")

    
   
    public ResponseEntity<SecretaireDTO> addSecretaireDTO( @ Valid@RequestBody SecretaireDTO secretaire, BindingResult bindingResults, SecretaireDTO secretaireDTO) throws URISyntaxException, MethodeArgumentNotValidException {
    
        log.debug("REST request to save Secretaire : {}");
           if (bindingResults.hasErrors())
          { 
              throw new MethodeArgumentNotValidException(null, bindingResults);
          }
      
  
       if (secretaire.getNcin() != null) {
            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an secretaire with a code"));
        throw new MethodeArgumentNotValidException(null, bindingResults);
     
       }
        SecretaireDTO result = secretaireService.save(secretaireDTO);
        return ResponseEntity.created(new URI("/sec/secretaires/" + result.getNcin())).body(result);
    }
   
   
//    @PostMapping("/secretaires")

    
   
//    public ResponseEntity<SecretaireDTO> addSecretaireDTO(@Valid @RequestBody SecretaireDTO secretaire, BindingResult bindingResults, Secretaire secretaireDTO) throws URISyntaxException {
//    
//        log.debug("REST request to save Secretaire : {}");
//
////        if (secretaire.getNcin() != null) {
////            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an secretaire with a code"));
////            throw new MethodeArgumentNotValidException(null, bindingResults);
////        }
//        SecretaireDTO result = secretaireService.save(secretaire);
//        return ResponseEntity.created(new URI("/sec/secretaires/" + result.getNcin())).body(result);
//    } 
    
    
    @PutMapping("/secretaires")
    public ResponseEntity<SecretaireDTO> updateSecretaireDTO(@RequestBody SecretaireDTO secretaire) throws URISyntaxException {
        SecretaireDTO result = secretaireService.update(secretaire);
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
        return ResponseEntity.ok(result);

    }

<<<<<<< HEAD

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSecretaireDTO(@PathVariable Integer id) {
        secretaireService.delete(id);
        return ResponseEntity.ok().build();
    }



}
=======
      @DeleteMapping("/{id}")
      public ResponseEntity<Void> deleteSecretaireDTO(@PathVariable Integer id) {
          secretaireService.delete(id);
             return ResponseEntity.ok().build();
      }

   
  }

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
