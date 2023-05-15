package com.csys.template.web.rest;

import com.csys.template.dto.AntecedentChirurgicalDTO;

import com.csys.template.service.AntecedentChirurgicalService;

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
@RequestMapping("/api/antecedents" )
public class AntecedentChirurgicalRessource {

    public AntecedentChirurgicalRessource(AntecedentChirurgicalService antecedentChirurgicalService) {
        this.antecedentChirurgicalService = antecedentChirurgicalService;
    }

    @Autowired
    AntecedentChirurgicalService antecedentChirurgicalService;
    private static final String ENTITY_NAME = "AntecedentChirurgical";
    @GetMapping("")
    public List<AntecedentChirurgicalDTO> findAll() {
        return antecedentChirurgicalService.findAll();
    }

    @GetMapping("/(id)")
    public AntecedentChirurgicalDTO findByIdch(@PathVariable Long idch) {
        AntecedentChirurgicalDTO antecedentChirurgical = antecedentChirurgicalService.findByIdch(idch);
        RestPreconditions.checkFound(antecedentChirurgical);
        return antecedentChirurgicalService.findByIdch(idch);
    }
    @PostMapping("/{nDossier}")
    public ResponseEntity<AntecedentChirurgicalDTO> addAntecedentChirurgicalDTO(@PathVariable Integer nDossier, @Valid @RequestBody AntecedentChirurgicalDTO antecedentChirurgicalDTO, BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
        if (antecedentChirurgicalDTO.getIdch() != null   ) {
            bindingResults.addError(new FieldError(ENTITY_NAME, "id", "post does not accept id"));
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        AntecedentChirurgicalDTO result = antecedentChirurgicalService.save(antecedentChirurgicalDTO,nDossier);
        return ResponseEntity.created(new URI("/api/antecedents/" + result.getIdch())).body(result);
    }
    @PutMapping("/{id}")
    public ResponseEntity<AntecedentChirurgicalDTO> updateAntecedentChirurgicalDTO(@PathVariable Long id,@RequestBody AntecedentChirurgicalDTO antecedentChirurgicalDTO) {
        AntecedentChirurgicalDTO result = antecedentChirurgicalService.update(antecedentChirurgicalDTO);
        return ResponseEntity.ok(result);

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAntecedentChirurgicalDTO(@PathVariable Long id) {
        antecedentChirurgicalService.delete(id);
        return ResponseEntity.ok().build();
    }

}
