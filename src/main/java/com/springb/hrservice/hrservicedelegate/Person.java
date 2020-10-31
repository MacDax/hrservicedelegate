package com.springb.hrservice.hrservicedelegate;

import java.time.LocalDate;

public class Person {

	// private String personIdNumber;
	private String fname;
	private String lname;
	private LocalDate birthdate;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

}
