/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;

import com.csys.template.Entity.Medecin;
import com.csys.template.dto.MedecinDTO;
import com.csys.template.service.MedecinService;
import com.csys.template.util.RestPreconditions;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.validation.Valid;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
//// 
*/
@RestController
@RequestMapping("/api/medecins")
public class MedecinRessource {

    @Autowired
    MedecinService medecinService;
    private static final String ENTITY_NAME = "Medecin";

    @GetMapping
//    public ResponseEntity <List<Medecin>> findAll() {
//        return ResponseEntity.ok(medecinService.findAll());
//    }
    public List<MedecinDTO> findAll() {
        return medecinService.findAll();
    }

    @GetMapping("/id")
    public MedecinDTO findByCodemed(@PathVariable Integer id) {
        MedecinDTO medecin = medecinService.findByCodemed(id);
        RestPreconditions.checkFound(medecin);
        return medecinService.findByCodemed(id);
    }

    @PostMapping
    public ResponseEntity<MedecinDTO> addMedecinDTO(@Valid @RequestBody MedecinDTO medecin, BindingResult bindingResults , Medecin medecinDTO) throws URISyntaxException {  //throws URISyntaxException, MethodeArgumentNotValidException){
//        if (medecin.getCodemed() != null) {
//            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an medecin with a code"));
////    throw new MethodeArgumentNotValidException(null,bindingResults);
//}
        MedecinDTO result = medecinService.add(medecin);
        return ResponseEntity.created(new URI("/api/medecins/" + result.getCodemed())).body(result);
    }
          
    @PutMapping
    public ResponseEntity<MedecinDTO> updateMedecinDTO(@RequestBody MedecinDTO medecin) throws URISyntaxException {
        MedecinDTO result = medecinService.update(medecin);
        return ResponseEntity.ok(result);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedecinDTO(@PathVariable Integer id) {
        medecinService.delete(id);
        return ResponseEntity.ok().build();
    }

    
    
}

