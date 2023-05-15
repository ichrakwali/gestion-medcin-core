package com.csys.template.repository;

import com.csys.template.Entity.AccidentTravail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccidentTravailRepository extends JpaRepository<AccidentTravail, Long> {


    AccidentTravail findByIdAcc(Long id);

    void deleteByIdAcc(Long id);
}
