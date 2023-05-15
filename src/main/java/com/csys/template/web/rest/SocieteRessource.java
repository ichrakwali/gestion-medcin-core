/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;

import com.csys.template.dto.SocieteDTO;
import com.csys.template.service.SocieteService;
import com.csys.template.util.RestPreconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;

=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


/**
 *
 * @author Dell
 */

@RestController
@RequestMapping("/api/societes")
public class SocieteRessource {

    private final Logger log = LoggerFactory.getLogger(SocieteRessource.class);
    @Autowired
    SocieteService societeService;
    private static final String ENTITY_NAME = "Societe";

<<<<<<< HEAD
    public SocieteRessource(SocieteService societeService) {
        this.societeService = societeService;
    }

=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    @GetMapping("")
    public List<SocieteDTO> findAll() {
        log.debug("REST request to societe findAll");
        return societeService.findAll();
    }

    @GetMapping("/(id)")
    public SocieteDTO findByCodesoc(@PathVariable Integer id) {
        SocieteDTO societe = societeService.findByCodesoc(id);
        RestPreconditions.checkFound(societe);
        return societeService.findByCodesoc(id);
    }

    @PostMapping("")
    public ResponseEntity<SocieteDTO> addSocieteDTO(@Valid @RequestBody SocieteDTO societe, BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
        if (societe.getCodesoc() != null  ) {
            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "post does not accept code"));
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        SocieteDTO result = societeService.save(societe);
<<<<<<< HEAD
        return ResponseEntity.created(new URI("/api/societes/" + result.getCodesoc())).body(result);
=======
        return ResponseEntity.created(new URI("/soc/societes/" + result.getCodesoc())).body(result);
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    }

    @PutMapping("/{id}")
    public ResponseEntity<SocieteDTO> updateSocieteDTO(@PathVariable Integer id, @RequestBody SocieteDTO societeDTO) {
        societeDTO.setCodesoc(id);
        SocieteDTO result = societeService.update(societeDTO);
        return ResponseEntity.ok(result);

    }
<<<<<<< HEAD
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeDTO(@PathVariable Integer id) {
        societeService.delete(id);
        return ResponseEntity.ok().build();
    }
=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

}

