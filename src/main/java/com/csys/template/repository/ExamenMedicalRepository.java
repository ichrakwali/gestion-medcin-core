/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.ExamenMedical;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
 */
public interface ExamenMedicalRepository extends JpaRepository<ExamenMedical, Integer>{ 
    

    public ExamenMedical findByIdExamen(Integer id);
       public ExamenMedical save (ExamenMedical examenMedical); 
    
}
