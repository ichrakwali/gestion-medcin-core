/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.template.repository;

import com.csys.template.Entity.Societe;
import com.csys.template.dto.SocieteDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dell
 */
@Repository
public interface SocieteRepository extends JpaRepository<Societe, Integer> {

    Societe findByCodesoc(Integer id);


    void deleteByCodesoc(Integer id);
}
