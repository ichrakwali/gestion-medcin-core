/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;

<<<<<<< HEAD


import com.csys.template.dto.EmployeDTO;

=======
import com.csys.template.Entity.Employe;
//import static com.csys.template.Entity.QEmploye.employe;
import com.csys.template.dto.EmployeDTO;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
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
<<<<<<< HEAD
import org.springframework.web.bind.MethodArgumentNotValidException;
=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
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
<<<<<<< HEAD
@RequestMapping("/api/employes" )
public class EmployeRessource {


    @Autowired
    EmployeService employeService;
    private static final String ENTITY_NAME = "Employe";
    public EmployeRessource(EmployeService employeService) {
        this.employeService = employeService;
    }
    @GetMapping("")
=======
@RequestMapping("/emp" )
public class EmployeRessource {
      @Autowired
    EmployeService employeService;
    private static final String ENTITY_NAME = "Employe";

    @GetMapping("/employes")
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    public List<EmployeDTO> findAll() {
        return employeService.findAll();
    }

    @GetMapping("/(id)")
    public EmployeDTO findBynDossier(@PathVariable Integer id) {
        EmployeDTO employe = employeService.findBynDossier(id);
        RestPreconditions.checkFound(employe);
        return employeService.findBynDossier(id);
    }
<<<<<<< HEAD
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
=======

    @PostMapping("/employes")
    public EmployeDTO addEmployeDTO(@RequestBody EmployeDTO employe) {//throws URISyntaxException{ //MethodeArgumentNotValidException {//throws URISyntaxException, MethodeArgumentNotValidException{
//        if (employe.getnDossier() != null) {
//            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an employe with a code"));
//            throw new MethodeArgumentNotValidException(null bindingResults);
        
              EmployeDTO result = employeService.save(employe);
        return result;}
//    @PostMapping("/employes")
//    public EmployeDTO addEmployeDTO(  @RequestBody EmployeDTO employe) throws URISyntaxException, MethodeArgumentNotValidException {//throws URISyntaxException{ //MethodeArgumentNotValidException {//throws URISyntaxException, MethodeArgumentNotValidException{
////        if (employe.getnDossier() != null) {
////            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an employe with a code"));
////            throw new MethodeArgumentNotValidException(null bindingResults);
//        
//              EmployeDTO result = employeService.save(employe);
//                return result;
//    }
    
// 
// 
    
//   @PostMapping("/add")
//   public ResponseEntity<EmployeDTO> addEmployeDTO(@RequestBody EmployeDTO employe, BindingResult bindingResults) throws URISyntaxException ,MethodeArgumentNotValidException{//throws URISyntaxException, MethodeArgumentNotValidException{
//if (employe.getnDossier()!=null){
//bindingResults.addError(new FieldError(ENTITY_NAME,"code","postdoes not allow an employe with a code"));
//    throw new MethodeArgumentNotValidException(null,bindingResults);
//
//        EmployeDTO result = employeService.save(employe);
//        return ResponseEntity.created(new URI("/api/employes/" + result.getnDossier())).body(result);
//    }

    @PutMapping("/employes")
    public ResponseEntity<EmployeDTO> updateEmployeDTO(@RequestBody EmployeDTO employe) throws URISyntaxException {
        EmployeDTO result = employeService.save(employe);
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
        return ResponseEntity.ok(result);

    }

<<<<<<< HEAD

=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeDTO(@PathVariable Integer id) {
        employeService.delete(id);
        return ResponseEntity.ok().build();
    }

    
    
}

