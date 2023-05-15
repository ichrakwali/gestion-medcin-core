/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.factory;


import com.csys.template.Entity.Medecin;

import com.csys.template.dto.MedecinDTO;
import static com.csys.template.factory.MedecinFactory.medecinTOMedecinDTO;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dell
*/
public class MedecinFactory {

    public static Medecin medecinDTOTOMedecin(MedecinDTO medecinDTO) {
        Medecin medecin = new Medecin();

        medecin.setNommed(medecinDTO.getNommed());
        medecin.setPrenommed(medecinDTO.getPrenommed());
        medecin.setAdresse(medecinDTO.getAdresse());
        medecin.setEmailmed(medecinDTO.getEmailmed());
        medecin.setTelmed(medecinDTO.getTelmed());
        medecin.setEmplacement(medecinDTO.getEmplacement());

        medecin.setSociete(SocieteFactory.SocieteDTOTOSociete(medecinDTO.getSociete()));
        return medecin;

    }

    public static MedecinDTO medecinTOMedecinDTO(Medecin medecin) {
        if (medecin != null) {
            MedecinDTO medecinDTO = new MedecinDTO();
            medecinDTO.setCodemed(medecin.getCodemed());
            medecinDTO.setNommed(medecin.getNommed());
            medecinDTO.setPrenommed(medecin.getPrenommed());
            medecinDTO.setAdresse(medecin.getAdresse());
            medecinDTO.setEmailmed(medecin.getEmailmed());
            medecinDTO.setTelmed(medecin.getTelmed());
            medecinDTO.setEmplacement(medecin.getEmplacement());
            medecinDTO.setSociete(SocieteFactory.societeTOSocieteDTO(medecin.getSociete()));
            return medecinDTO;
        } else {
            return null;
        }

    }

    public static List<MedecinDTO> medecinsTOMedecinDTOs(List<Medecin> medecins) {
        List<MedecinDTO> medecinDTOs = new ArrayList<>();
        medecins.stream().map((medecin) -> medecinTOMedecinDTO(medecin)).forEachOrdered((medecinDTO) -> {
            medecinDTOs.add(medecinDTO);
        });
        return medecinDTOs;
    }

}



