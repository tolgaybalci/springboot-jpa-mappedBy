package com.tolgaybalci.crudexample.repository;

import com.tolgaybalci.crudexample.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {
}
