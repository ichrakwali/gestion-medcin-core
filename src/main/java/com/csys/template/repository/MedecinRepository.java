/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dell
*/
@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Integer> {


    Medecin findByCodemed(Integer id);

    void deleteByCodemed(Integer id);
}


    
