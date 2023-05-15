package com.csys.template.web.rest;


import com.csys.template.dto.SecretaireDTO;

import com.csys.template.service.SecretaireService;
import com.csys.template.util.RestPreconditions;
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

    @GetMapping("/(id)")
    public SecretaireDTO findByNcin(@PathVariable Integer id) {
        SecretaireDTO secretaire = secretaireService.findByNcin(id);
        RestPreconditions.checkFound(secretaire);
        return secretaireService.findByNcin(id);
    }
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
        return ResponseEntity.ok(result);

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSecretaireDTO(@PathVariable Integer id) {
        secretaireService.delete(id);
        return ResponseEntity.ok().build();
    }



}