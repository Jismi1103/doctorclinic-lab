package com.medo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medo.entity.Appointment;



public interface AppointmentRepository extends JpaRepository<Appointment,Long>{


	List<Appointment> findByPatientIdAndStatus(Long patientId, String status);

}
