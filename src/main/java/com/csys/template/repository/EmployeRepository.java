/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.Employe;
import com.csys.template.dto.EmployeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
 */
public interface EmployeRepository  extends JpaRepository<Employe, Integer>{
       Employe findBynDossier(Integer id);
  
    public Employe save(EmployeDTO employeDTO);
    
   public Employe save (Employe employe);
}
