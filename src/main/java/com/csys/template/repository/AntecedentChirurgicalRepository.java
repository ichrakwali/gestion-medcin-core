package com.csys.template.repository;

import com.csys.template.Entity.AntecedentChirurgical;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedentChirurgicalRepository extends JpaRepository<AntecedentChirurgical, Long> {
    AntecedentChirurgical findByIdch(Long id);
    void deleteByIdch(Long id);

}
