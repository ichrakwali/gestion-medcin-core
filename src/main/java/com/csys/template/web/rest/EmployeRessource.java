/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;



import com.csys.template.dto.EmployeDTO;

import com.csys.template.service.EmployeService;
import com.csys.template.util.RestPreconditions;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
@RequestMapping("/api/employes" )
public class EmployeRessource {


    @Autowired
    EmployeService employeService;
    private static final String ENTITY_NAME = "Employe";
    public EmployeRessource(EmployeService employeService) {
        this.employeService = employeService;
    }
    @GetMapping("")
    public List<EmployeDTO> findAll() {
        return employeService.findAll();
    }

    @GetMapping("/(id)")
    public EmployeDTO findBynDossier(@PathVariable Integer id) {
        EmployeDTO employe = employeService.findBynDossier(id);
        RestPreconditions.checkFound(employe);
        return employeService.findBynDossier(id);
    }
    @PostMapping("/{codesoc}")
    public ResponseEntity<EmployeDTO> addEmployeDTO(  @PathVariable Integer codesoc,@Valid @RequestBody EmployeDTO employeDTO, BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
        if (employeDTO.getnDossier() != null   ) {
            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "post does not accept code"));
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        EmployeDTO result = employeService.save(employeDTO,codesoc);
        return ResponseEntity.created(new URI("/api/employes/" + result.getnDossier())).body(result);
    }



    @PutMapping("/{id}")
    public ResponseEntity<EmployeDTO> updateEmployeDTO(@PathVariable Integer id,@RequestBody EmployeDTO employeDTO) {
        EmployeDTO result = employeService.update(employeDTO);
        return ResponseEntity.ok(result);

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeDTO(@PathVariable Integer id) {
        employeService.delete(id);
        return ResponseEntity.ok().build();
    }

    
    
}

