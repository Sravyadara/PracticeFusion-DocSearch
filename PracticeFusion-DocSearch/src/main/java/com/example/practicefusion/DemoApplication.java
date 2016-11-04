package com.example.practicefusion;

import model.Doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import service.FilterDoctor;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Doctor d = new Doctor().withFirstName("Anya").withAge(25).withSpeciality("Cardiologist");
		
		FilterDoctor search = new FilterDoctor();
		for(Doctor doc : search.processRequest(d)){
			System.out.println(doc.getFirstName());
		}
	}
}
