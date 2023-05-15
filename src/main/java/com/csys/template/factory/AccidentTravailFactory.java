package com.csys.template.factory;

import com.csys.template.Entity.AccidentTravail;
import com.csys.template.Entity.Employe;
import com.csys.template.dto.AccidentTravailDTO;
import com.csys.template.dto.EmployeDTO;

import java.util.ArrayList;
import java.util.List;

public class AccidentTravailFactory {

    public static AccidentTravail accidentTravailDTOTOAccidentTravail(AccidentTravailDTO accidentTravailDTO){
        AccidentTravail accidentTravail =new AccidentTravail();

        accidentTravail.setDate(accidentTravailDTO.getDate());
        accidentTravail.setCause(accidentTravailDTO.getCause());
        accidentTravail.setNaturelLesion(accidentTravailDTO.getNaturelLesion());
        accidentTravail.setSiegeLesion(accidentTravailDTO.getSiegeLesion());
        accidentTravail.setDureeArret(accidentTravailDTO.getDureeArret());
        accidentTravail.setIpp(accidentTravailDTO.getIpp());
        accidentTravail.setEmploye(EmployeFactory.employeDTOTOEmploye(accidentTravailDTO.getEmploye()));
        return accidentTravail;

    }

    public static AccidentTravailDTO accidentTravailTOAccidentTravailDTO(AccidentTravail accidentTravail){
        if (accidentTravail!=null){
            AccidentTravailDTO accidentTravailDTO = new AccidentTravailDTO();
            accidentTravailDTO.setIdAcc(accidentTravail.getIdAcc());
            accidentTravailDTO.setDate(accidentTravail.getDate());
            accidentTravailDTO.setCause(accidentTravail.getCause());
            accidentTravailDTO.setNaturelLesion(accidentTravail.getNaturelLesion());
            accidentTravailDTO.setSiegeLesion(accidentTravail.getSiegeLesion());
            accidentTravailDTO.setDureeArret(accidentTravail.getDureeArret());
            accidentTravailDTO.setIpp(accidentTravail.getIpp());
            accidentTravailDTO.setEmploye(EmployeFactory.employeTOEmployeDTO(accidentTravail.getEmploye()));
            return accidentTravailDTO;
        } else {
            return null;
        }

    }
    public static List<AccidentTravailDTO> accidentTravailsTOAccidentTravailDTOs(List<AccidentTravail> accidentTravails){
        List<AccidentTravailDTO> accidentTravailDTOs =new ArrayList<>();
        accidentTravails.stream().map((accidentTravail) -> accidentTravailTOAccidentTravailDTO(accidentTravail)).forEachOrdered((accidentTravailDTO) -> {
            accidentTravailDTOs.add(accidentTravailDTO);
        });
        return accidentTravailDTOs;
    }


}
