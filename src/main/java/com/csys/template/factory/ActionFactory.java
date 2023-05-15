/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
package com.csys.template.factory;

import com.csys.template.Entity.Action;
import com.csys.template.dto.ActionDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell

public class ActionFactory {
      private static Action action;

    public static Action actionDTOTOAction(ActionDTO actionDTO) {
        Action action = new Action();
        action.setIdaction(actionDTO.getIdaction());
        action.setType(actionDTO.getType());
        action.setResultat(actionDTO.getResultat());
        action.setExamenMedical(actionDTO.getExamenMedical());
       
        return action;

    }

    public static ActionDTO actionTOActionDTO(Action action) {
        if (action != null) {
            ActionDTO actionDTO = new ActionDTO();
            actionDTO.setIdaction(action.getIdaction());
            actionDTO.setType(action.getType());
            actionDTO.setResultat(action.getResultat());
            actionDTO.setExamenMedical(action.getExamenMedical());
       

            return actionDTO;
        } else {
            return null;
        }

    }

    public static List<ActionDTO> actionsTOActionDTOs(List<Action> actions) {
        List<ActionDTO> actionDTOs = new ArrayList<>();
        actions.stream().map((action) -> actionTOActionDTO(action)).forEachOrdered((actionDTO) -> {
            actionDTOs.add(actionDTO);
        });
        return actionDTOs;
    }

}

*/