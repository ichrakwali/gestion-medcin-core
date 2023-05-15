package com.csys.template.web.rest;

import com.csys.template.dto.AccidentTravailDTO;
import com.csys.template.service.AccidentTravailService;
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
@RequestMapping("/api/accidents" )
public class AccidentTravailRessource {
    public AccidentTravailRessource(AccidentTravailService accidentTravailService) {
        this.accidentTravailService = accidentTravailService;
    }

    @Autowired
    AccidentTravailService accidentTravailService;
    private static final String ENTITY_NAME = "AccidentTravail";

    @GetMapping("")
    public List<AccidentTravailDTO> findAll() {
        return accidentTravailService.findAll();
    }

    @GetMapping("/(id)")
    public AccidentTravailDTO findByIdacc(@PathVariable Long id) {
        AccidentTravailDTO accidentTravail = accidentTravailService.findByIdAcc(id);
        RestPreconditions.checkFound(accidentTravail);
        return accidentTravailService.findByIdAcc(id);
    }

    @PostMapping("/{nDossier}")
    public ResponseEntity<AccidentTravailDTO> addAccidentTravailDTO(@PathVariable Integer nDossier, @Valid @RequestBody AccidentTravailDTO accidentTravailDTO, BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
        if (accidentTravailDTO.getIdAcc() != null   ) {
            bindingResults.addError(new FieldError(ENTITY_NAME, "id", "post does not accept id"));
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        AccidentTravailDTO result = accidentTravailService.save(accidentTravailDTO,nDossier);
        return ResponseEntity.created(new URI("/api/accidents/" + result.getIdAcc())).body(result);
    }
    @PutMapping("/{id}")
    public ResponseEntity<AccidentTravailDTO> updateAccidentTravailDTO(@PathVariable Long id,@RequestBody AccidentTravailDTO accidentTravailDTO) {
        AccidentTravailDTO result = accidentTravailService.update(accidentTravailDTO);
        return ResponseEntity.ok(result);

    }


    @DeleteMapping("/{idAcc}")
    public ResponseEntity<Void> deleteAccidentTravailDTO(@PathVariable Long id) {
        accidentTravailService.delete(id);
        return ResponseEntity.ok().build();
}}
git