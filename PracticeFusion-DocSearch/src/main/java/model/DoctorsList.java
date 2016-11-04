package model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import model.Doctor;

public class DoctorsList {
	
	private Doctor[] doctors;

	@JsonProperty("doctors")
	public Doctor[] getList() {
		return this.doctors;
	}

	public void setList(Doctor[] list) {
		this.doctors = list;
	}

}
