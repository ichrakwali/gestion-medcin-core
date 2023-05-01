/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.service;

import com.csys.template.Entity.Action;
import com.csys.template.Entity.Action;
import com.csys.template.dto.ActionDTO;
import com.csys.template.dto.ActionDTO;
import com.csys.template.factory.ActionFactory;
import com.csys.template.factory.ActionFactory;
import com.csys.template.repository.ActionRepository;
import com.csys.template.web.rest.ActionRessource;
import java.util.List;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */

@Service
@Transactional
public class ActionService {
       
@Autowired 
     private ActionRepository actionRepository;
    private final Logger log = LoggerFactory.getLogger(ActionRessource.class);
@Transactional
  public ActionDTO findByIdaction(Integer id) {
        Action action = actionRepository.findByIdaction(id);
        return ActionFactory.actionTOActionDTO(action);
    }

     
 public List<ActionDTO> findAll() {
     log.debug("Request to societe findAll");
        List<Action> result = actionRepository.findAll();
        return   ActionFactory.actionsTOActionDTOs(result);
//               
    }
  public ActionDTO save(ActionDTO actionDTO) {
   Action action = ActionFactory.actionDTOTOAction(actionDTO);
    Action actionsave  = actionRepository.save(action);
     return ActionFactory.actionTOActionDTO(action);
    }

    public Action add(Action action) {
        return actionRepository.save(action);
    }
 

    public Action update(Action action) {
        return actionRepository.save(action);
    }

    public void deleteAction(Integer idaction) {
        actionRepository.delete(idaction);
    }

    

//    public Action add(ActionDTO action) { 
//        return actionRepository.save(action);
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Action update(ActionDTO action) {
//        return actionRepository.save(action) ;
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public ActionDTO add(ActionDTO action) {
         return  action;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ActionDTO update(ActionDTO action) {
       return  action;// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}