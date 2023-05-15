/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.Medecin;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
=======
import com.csys.template.dto.MedecinDTO;
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

/**
 *
 * @author Dell
<<<<<<< HEAD
*/
@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Integer> {


    Medecin findByCodemed(Integer id);

    void deleteByCodemed(Integer id);
}

=======
 */

public interface MedecinRepository extends JpaRepository<Medecin, Integer> {
   public Medecin findBynommed(Long nom);



  public Medecin save (MedecinDTO medecin);

//    public MedecinDTO save(MedecinDTO medecin);


    public Medecin findByCodemed(Integer id);

  

    
    
}
  
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

    
