

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/ 
package com.csys.template.web.rest;


import com.csys.template.Entity.Secretaire;
import com.csys.template.dto.SecretaireDTO;

import com.csys.template.service.SecretaireService;
import com.csys.template.util.RestPreconditions;

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
    @GetMapping("/(id)")
    public SecretaireDTO findByNcin(@PathVariable Integer id) {
        SecretaireDTO secretaire = secretaireService.findByNcin(id);
        RestPreconditions.checkFound(secretaire);
        return secretaireService.findByNcin(id);
    }

            
            
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
        return ResponseEntity.ok(result);

    }

      @DeleteMapping("/{id}")
      public ResponseEntity<Void> deleteSecretaireDTO(@PathVariable Integer id) {
          secretaireService.delete(id);
             return ResponseEntity.ok().build();
      }

   
  }

