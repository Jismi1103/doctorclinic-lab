package com.medo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medo.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}

