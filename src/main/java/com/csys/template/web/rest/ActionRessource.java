/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.web.rest;

import com.csys.template.Entity.Action;
import com.csys.template.dto.ActionDTO;
import com.csys.template.service.ActionService;
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
 */

@RestController
@RequestMapping("/act" )
public class ActionRessource {
      @Autowired
    ActionService actionService;
    private static final String ENTITY_NAME = "Action";

    @GetMapping("/actions")
//    public ResponseEntity <List<Action>> findAll() {
//        return ResponseEntity.ok(actionService.findAll());
//    }
    public List<ActionDTO> findAll() {
        return actionService.findAll();
    }

    @GetMapping("/id")
    public ActionDTO findByIdaction(@PathVariable Integer id) {
        ActionDTO action = actionService.findByIdaction(id);
        RestPreconditions.checkFound(action);
        return actionService.findByIdaction(id);
    }

    @PostMapping
    public ResponseEntity<ActionDTO> addActionDTO(@Valid @RequestBody ActionDTO action, BindingResult bindingResults , Action actionDTO) throws URISyntaxException {  //throws URISyntaxException, MethodeArgumentNotValidException){
//        if (action.getIdaction() != null) {
//            bindingResults.addError(new FieldError(ENTITY_NAME, "code", "postdoes not allow an action with a code"));
////    throw new MethodeArgumentNotValidException(null,bindingResults);
//}
        ActionDTO result = actionService.add(action);
        return ResponseEntity.created(new URI("/act/actions/" + result.getIdaction())).body(result);
    }
          
    @PutMapping
    public ResponseEntity<ActionDTO> updateActionDTO(@RequestBody ActionDTO action) throws URISyntaxException {
        ActionDTO result = actionService.update(action);
        return ResponseEntity.ok(result);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteActionDTO(@PathVariable Integer id) {
        actionService.delete(id);
        return ResponseEntity.ok().build();
    }

    
}
