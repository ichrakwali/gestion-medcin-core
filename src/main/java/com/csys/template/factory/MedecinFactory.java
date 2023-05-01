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

    private static Medecin medecin;

    public static Medecin medecinDTOTOMedecin(MedecinDTO medecinDTO) {
        Medecin medecin = new Medecin();
        medecin.setCodemed(medecinDTO.getCodemed());
        medecin.setNommed(medecinDTO.getNommed());
        medecin.setPrenommed(medecinDTO.getPrenommed());
        medecin.setAdresseEmailmed(medecinDTO.getAdresseEmailmed());
        medecin.setTelmed(medecinDTO.getTelmed());
        return medecin;

    }

    public static MedecinDTO medecinTOMedecinDTO(Medecin medecin) {
        if (medecin != null) {
            MedecinDTO medecinDTO = new MedecinDTO();
            medecinDTO.setCodemed(medecin.getCodemed());
            medecinDTO.setNommed(medecin.getNommed());
            medecinDTO.setPrenommed(medecin.getPrenommed());
            medecinDTO.setAdresseEmailmed(medecin.getAdresseEmailmed());
            medecinDTO.setTelmed(medecin.getTelmed());
//            medecinDTO.setCodesoc(medecin.getCodesoc());
            medecinDTO.setSociete(medecin.getSociete());
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



