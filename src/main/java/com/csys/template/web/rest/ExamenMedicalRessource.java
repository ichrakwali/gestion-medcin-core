/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;

import com.csys.template.Entity.ExamenMedical;
import com.csys.template.dto.ExamenMedicalDTO;
import com.csys.template.service.ExamenMedicalService;
import com.csys.template.util.RestPreconditions;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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
 */@RestController
@RequestMapping("/Examen" )
public class ExamenMedicalRessource {
    


      @Autowired
    ExamenMedicalService examenMedicalService;
    private static final String ENTITY_NAME = "ExamenMedical";

    @GetMapping("/examenMedicals")
    public List<ExamenMedicalDTO> findAll() {
        return examenMedicalService.findAll();
    }

    @GetMapping("/(id)")
    public ExamenMedicalDTO findByIdExamen(@PathVariable Integer id) {
        ExamenMedicalDTO examenMedical = examenMedicalService.findByIdExamen(id);
        RestPreconditions.checkFound(examenMedical);
        return examenMedicalService.findByIdExamen(id);
    }

    @PostMapping("/examenMedicals")
    public ResponseEntity<ExamenMedicalDTO> addExamenMedicalDTO( @Valid @RequestBody ExamenMedicalDTO examenMedical, BindingResult bindingResults , ExamenMedical examenMedicalDTO) throws URISyntaxException, MethodeArgumentNotValidException {//throws URISyntaxException{ //MethodeArgumentNotValidException {//throws URISyntaxException, MethodeArgumentNotValidException{
//        if (examenMedical.getnDossier() != null) {
//            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an examenMedical with a code"));
//            throw new MethodeArgumentNotValidException(null bindingResults);
        
              ExamenMedicalDTO result = examenMedicalService.save(examenMedical);
        return ResponseEntity.created(new URI("/emp/examenMedicals/" + result.getIdExamen())).body(result);
    }
//    @PostMapping("/examenMedicals")
//    public ExamenMedicalDTO addExamenMedicalDTO(  @RequestBody ExamenMedicalDTO examenMedical) throws URISyntaxException, MethodeArgumentNotValidException {//throws URISyntaxException{ //MethodeArgumentNotValidException {//throws URISyntaxException, MethodeArgumentNotValidException{
////        if (examenMedical.getnDossier() != null) {
////            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an examenMedical with a code"));
////            throw new MethodeArgumentNotValidException(null bindingResults);
//        
//              ExamenMedicalDTO result = examenMedicalService.save(examenMedical);
//                return result;
//    }
    
// 
// 
    
//   @PostMapping("/add")
//   public ResponseEntity<ExamenMedicalDTO> addExamenMedicalDTO(@RequestBody ExamenMedicalDTO examenMedical, BindingResult bindingResults) throws URISyntaxException ,MethodeArgumentNotValidException{//throws URISyntaxException, MethodeArgumentNotValidException{
//if (examenMedical.getnDossier()!=null){
//bindingResults.addError(new FieldError(ENTITY_NAME,"code","postdoes not allow an examenMedical with a code"));
//    throw new MethodeArgumentNotValidException(null,bindingResults);
//
//        ExamenMedicalDTO result = examenMedicalService.save(examenMedical);
//        return ResponseEntity.created(new URI("/api/examenMedicals/" + result.getnDossier())).body(result);
//    }

    @PutMapping("/examenMedicals")
    public ResponseEntity<ExamenMedicalDTO> updateExamenMedicalDTO(@RequestBody ExamenMedicalDTO examenMedical) throws URISyntaxException {
        ExamenMedicalDTO result = examenMedicalService.save(examenMedical);
        return ResponseEntity.ok(result);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExamenMedicalDTO(@PathVariable Integer id) {
        examenMedicalService.delete(id);
        return ResponseEntity.ok().build();
    }

    
    
}

