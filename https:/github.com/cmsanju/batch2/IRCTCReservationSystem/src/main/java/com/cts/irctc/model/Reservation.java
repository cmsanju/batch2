package com.cts.irctc.model;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;



public class Reservation {
	
	@NotEmpty//(message = "First name is required")
	private String firstName;
	@NotEmpty//(message = "Last name is required")
	private String lastName;
	@NotEmpty//(message = "Please select gender")
	private String Gender;
	
	private String[] Food;
	@NotEmpty//(message = "From city is required")
	private String cityFrom;
	@NotEmpty//(message = "To city is required")
	private String cityTo;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotEmpty
	private String jDate;
	
	@NotEmpty
	private String[] seat;

	public Reservation() {
	}

	
	 public Reservation( String firstName,  String lastName,  String gender, String[] food,
			 String cityFrom,  String cityTo,  String[] seat, String jDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		Food = food;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
		this.seat = seat;
		this.jDate = jDate;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String[] getFood() {
		return Food;
	}


	public void setFood(String[] food) {
		Food = food;
	}


	public String getCityFrom() {
		return cityFrom;
	}


	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}


	public String getCityTo() {
		return cityTo;
	}


	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}


	public String[] getSeat() {
		return seat;
	}


	public void setSeat(String[] seat) {
		this.seat = seat;
	}

	
	

	public String getjDate() {
		return jDate;
	}


	public void setjDate(String jDate) {
		this.jDate = jDate;
	}


	public boolean validate(String u1, String p1) 
	    { 
	        if (u1.equals(cityTo)) 
	            return true; 
	        else
	            return false; 
	    } 
}
