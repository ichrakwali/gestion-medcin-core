/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.Secretaire;
import com.csys.template.dto.SecretaireDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
 */
public interface SecretaireRepository extends JpaRepository<Secretaire, Integer>{

    
//public Secretaire findOne(Long id);
//    public Secretaire save(SecretaireDTO secretaire);
   
 

 public SecretaireDTO save(SecretaireDTO secretaire);

    public Secretaire findByNcin(Integer id);   
    @Override
    public void delete(Integer id);
}
