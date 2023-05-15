/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.Employe;
import com.csys.template.dto.EmployeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dell
 */
@Repository
public interface EmployeRepository  extends JpaRepository<Employe, Integer>{
       Employe findBynDossier(Integer id);


    void deleteBynDossier(Integer nDossier);

}
