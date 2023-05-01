/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.Medecin;
import com.csys.template.dto.MedecinDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
 */

public interface MedecinRepository extends JpaRepository<Medecin, Integer> {
   public Medecin findBynommed(Long nom);



  public Medecin save (MedecinDTO medecin);

//    public MedecinDTO save(MedecinDTO medecin);


    public Medecin findByCodemed(Integer id);

  

    
    
}
  

    
