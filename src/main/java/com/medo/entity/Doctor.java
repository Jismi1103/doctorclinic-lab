package com.medo.entity;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
//import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private String qualification;
    
    @ElementCollection
    private List<String> languages;  
    
    private double amount;
    private String experience;
    
    
    private String availableAt;
    private String about;
    private String imageUrl;

    @ElementCollection
    @Column(name = "available_slots") 
    private List<String> availableSlots;   

    @Column(name = "appointment_date", nullable = false)
    private String availableDate;   

    @Column(name = "rating", nullable = false)
    private double rating;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAvailableAt() {
		return availableAt;
	}

	public void setAvailableAt(String availableAt) {
		this.availableAt = availableAt;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<String> getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(List<String> availableSlots) {
		this.availableSlots = availableSlots;
	}

	// Convert stored string to List<String>
    public List<String> getAvailableDates() {
        return availableDate != null ? Arrays.asList(availableDate.split(",")) : null;
    }

    // Convert List<String> to a single string before saving
    public void setAvailableDates(List<String> dates) {
        this.availableDate = (dates != null) ? String.join(",", dates) : null;
    }

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}  


}


