/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.Employe;
import com.csys.template.dto.EmployeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;
=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

/**
 *
 * @author Dell
 */
<<<<<<< HEAD
@Repository
public interface EmployeRepository  extends JpaRepository<Employe, Integer>{
       Employe findBynDossier(Integer id);


    void deleteBynDossier(Integer nDossier);

=======
public interface EmployeRepository  extends JpaRepository<Employe, Integer>{
       Employe findBynDossier(Integer id);
  
    public Employe save(EmployeDTO employeDTO);
    
   public Employe save (Employe employe);
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
}
