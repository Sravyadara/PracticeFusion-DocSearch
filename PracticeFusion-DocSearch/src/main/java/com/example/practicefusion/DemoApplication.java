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
		System.out.println("------Input search with doctor age and speciality------");
		System.out.println("InputDoctorAge:"+d.getAge()+" InputDoctorSpeciality:"+d.getSpeciality());
		
		FilterDoctor search = new FilterDoctor();
		System.out.println("------Search Results with doctor age and speciality------");
		for(Doctor doc : search.processRequest(d)){
			System.out.println("DoctorName:"+doc.getFirstName()+","+"DoctorAge:"+doc.getAge()+","+"DoctorSpeciality:"+doc.getSpeciality());
		}
		
		System.out.println("*************************************************");
		System.out.println("Negative Test Case");
		//Negative Test
		Doctor emily = new Doctor().withAge(-21);
		System.out.println("InputDoctorAge:"+emily.getAge());
		System.out.println("------Search Results with doctor age --------");
		for(Doctor dr:search.processRequest(emily)){
			System.out.println("DoctorName:"+dr.getFirstName()+","+"DoctorAge"+dr.getAge());
		}
		
	}
	
	
}
