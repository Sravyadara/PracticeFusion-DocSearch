package com.example.practicefusion;

import static org.junit.Assert.*;

import java.util.List;

import model.Doctor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import service.FilterDoctor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void filterByAge() {
		Doctor d = new Doctor().withAge(26);
		FilterDoctor search = new FilterDoctor();
		List<Doctor> l = search.processRequest(d);
		assertTrue(l.size()==5);
	}
	
	@Test
	public void filterBySpeciality(){
		Doctor d = new Doctor().withSpeciality("General Medicine");
		FilterDoctor search = new FilterDoctor();
		List<Doctor> l = search.processRequest(d);
		assertTrue(l.get(0).getFirstName().equals("Swetha"));
	}
	
	@Test
	public void filterBySchool(){
		Doctor d = new Doctor().withSchoolAttended("Stanford University");
		FilterDoctor search = new FilterDoctor();
		List<Doctor> l = search.processRequest(d);
		assertTrue(l.size()==1);
		assertTrue(l.get(0).getFirstName().equals("Swetha"));	
	}
	
	@Test
	public void filterByLocation(){
		Doctor d = new Doctor().withLocation("BayArea");
		FilterDoctor search = new FilterDoctor();
		List<Doctor> l = search.processRequest(d);
		assertTrue(l.size()==7);
		
	}
	
	@Test
	public void filter(){
		Doctor d = new Doctor().withFirstName("Anya").withAge(25).withSpeciality("Cardiologist");
		FilterDoctor search = new FilterDoctor();
		List<Doctor> l = search.processRequest(d);
		assertTrue(l.size()==3);
		
	}
	
	

}
