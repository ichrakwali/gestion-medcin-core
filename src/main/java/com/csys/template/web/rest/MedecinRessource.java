/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;

<<<<<<< HEAD
//import com.csys.template.Entity.Medecin;
import com.csys.template.dto.EmployeDTO;
import com.csys.template.dto.MedecinDTO;
//import com.csys.template.service.MedecinService;
=======
import com.csys.template.Entity.Medecin;
import com.csys.template.dto.MedecinDTO;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
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

<<<<<<< HEAD


    @Autowired
    MedecinService medecinService;
    private static final String ENTITY_NAME = "Medecin";
    public MedecinRessource(MedecinService medecinService) {
        this.medecinService = medecinService;
    }
    @GetMapping("")
    public List<MedecinDTO> findAll() {

        return medecinService.findAll();
    }
=======
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

>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    @GetMapping("/id")
    public MedecinDTO findByCodemed(@PathVariable Integer id) {
        MedecinDTO medecin = medecinService.findByCodemed(id);
        RestPreconditions.checkFound(medecin);
        return medecinService.findByCodemed(id);
    }
<<<<<<< HEAD
    @PostMapping("/{codesoc}")
    public ResponseEntity<MedecinDTO>addMedecinDTO (  @PathVariable Integer codesoc,@Valid @RequestBody MedecinDTO medecin, BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
        if (medecin.getCodemed() != null   ) {
            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "post does not accept code"));
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        MedecinDTO result = medecinService.save(medecin,codesoc);
        return ResponseEntity.created(new URI("/api/medecins/" + result.getCodemed())).body(result);
    }
    @PutMapping("/{id}")
    public ResponseEntity<MedecinDTO>updateMedecinDTO (@PathVariable Integer id,@RequestBody MedecinDTO medecinDTO) {
        MedecinDTO result = medecinService.update(medecinDTO);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedecinDTO(@PathVariable Integer id) {
        medecinService.delete(id);
        return ResponseEntity.noContent().build();
=======

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
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
    }

    
    
}

