package com.medo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.medco.Enum.AppointmentStatus;


@Entity
@Table(name = "appointments") // Added table name for clarity
public class Appointment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @Column(name = "appointment_date_time", nullable = false)
    private LocalDateTime appointmentDate;  

    @Enumerated(EnumType.STRING)  
    @Column(name = "status", nullable = false)
    private AppointmentStatus status;

    @Column(name = "rating", nullable = true)
    private Integer rating; // Rating (1-5 stars)

    @Column(name = "feedback", columnDefinition = "TEXT", nullable = true)
    private String feedback; // User's written feedback

    
   
    public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long id, Patient patient, Doctor doctor, AppointmentStatus status, LocalDateTime appointmentDate, Integer rating, String feedback) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.status = status;
        this.appointmentDate = appointmentDate;
        this.rating = rating;
        this.feedback = feedback;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
    
}