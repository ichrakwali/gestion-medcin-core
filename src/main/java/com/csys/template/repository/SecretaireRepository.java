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
<<<<<<< HEAD
import org.springframework.stereotype.Repository;
=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d

/**
 *
 * @author Dell
<<<<<<< HEAD
*/
@Repository
public interface SecretaireRepository extends JpaRepository<Secretaire, Integer>{

     Secretaire findByNcin(Integer id);

    void deleteByNcin(Integer id);
=======
 */
public interface SecretaireRepository extends JpaRepository<Secretaire, Integer>{

    
//public Secretaire findOne(Long id);
//    public Secretaire save(SecretaireDTO secretaire);
   
 

 public SecretaireDTO save(SecretaireDTO secretaire);

    public Secretaire findByNcin(Integer id);   
    @Override
    public void delete(Integer id);
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
}
