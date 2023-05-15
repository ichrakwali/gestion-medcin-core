package com.csys.template.factory;

import com.csys.template.Entity.AntecedentChirurgical;

import com.csys.template.dto.AntecedentChirurgicalDTO;


import java.util.ArrayList;
import java.util.List;


public class AntecedentChirurgicalFactory {

    public static AntecedentChirurgical antecedentChirurgicalDTOTOAntecedentChirurgical(AntecedentChirurgicalDTO antecedentChirurgicalDTO) {
        AntecedentChirurgical antecedentChirurgical = new AntecedentChirurgical();

        antecedentChirurgical.setDescription(antecedentChirurgicalDTO.getDescription());
        antecedentChirurgical.setDate(antecedentChirurgicalDTO.getDate());
        antecedentChirurgical.setNomclinique(antecedentChirurgicalDTO.getNomclinique());
        antecedentChirurgical.setEmploye(EmployeFactory.employeDTOTOEmploye(antecedentChirurgicalDTO.getEmploye()));
        return antecedentChirurgical;

    }
    public static AntecedentChirurgicalDTO antecedentChirurgicalTOAntecedentChirurgicalDTO(AntecedentChirurgical antecedentChirurgical){
        if (antecedentChirurgical!=null){
            AntecedentChirurgicalDTO antecedentChirurgicalDTO = new AntecedentChirurgicalDTO();
           antecedentChirurgicalDTO.setIdch(antecedentChirurgical.getIdch());
            antecedentChirurgicalDTO.setDescription(antecedentChirurgical.getDescription());
            antecedentChirurgicalDTO.setDate(antecedentChirurgical.getDate());
            antecedentChirurgicalDTO.setNomclinique(antecedentChirurgical.getNomclinique());

            antecedentChirurgicalDTO.setEmploye(EmployeFactory.employeTOEmployeDTO(antecedentChirurgical.getEmploye()));
            return antecedentChirurgicalDTO;
        } else {
            return null;
        }
    }
    public static List<AntecedentChirurgicalDTO> antecedentChirurgicalsTOAntecedentChirurgicalDTOs(List<AntecedentChirurgical> antecedentChirurgicals){
        List<AntecedentChirurgicalDTO> antecedentChirurgicalDTOs =new ArrayList<>();
        antecedentChirurgicals.stream().map((antecedentChirurgical) -> antecedentChirurgicalTOAntecedentChirurgicalDTO(antecedentChirurgical)).forEachOrdered((antecedentChirurgicalDTO) -> {
            antecedentChirurgicalDTOs.add(antecedentChirurgicalDTO);
        });
        return antecedentChirurgicalDTOs;
    }
}