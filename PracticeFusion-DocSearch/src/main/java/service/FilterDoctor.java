package service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.example.practicefusion.DemoApplication;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Doctor;
import model.DoctorsList;

public class FilterDoctor { 
	
	/*read the JSON file from resources
	  get list of all doctors
	  add doctors to an arrayList */
	
	public List<Doctor> getDoctorsList(){
		 List<Doctor> doctors = new ArrayList<Doctor>();
		 ObjectMapper mapper = new ObjectMapper();
		 InputStream inputStream = DemoApplication.class.getClassLoader().getResourceAsStream("Doctors");
		 
		 try {
			DoctorsList doctorsList = mapper.readValue(inputStream, DoctorsList.class);
			for(Doctor d : doctorsList.getList()){
				doctors.add(d);
			}			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return doctors;	
	}
	
	/*process the request from user, 
	  Filter the list of doctors by 
	  comparing the details of input doctor*/
	
	public List<Doctor> processRequest(Doctor d){
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors = getDoctorsList();
		doctors = filterBasedOnAge(doctors,d);
		doctors = filterBasedOnSex(doctors,d);
		doctors = filterBasedOnspeciality(doctors,d);
		doctors = filterBasedOnReviewScore(doctors,d);
		doctors = filterBasedOnLocation(doctors,d);
		doctors = filterBasedOnSchoolAttended(doctors,d);
		return doctors;	
	}

	// Filter the list based on the age factor from input
	//If input is negative entire list is returned
    public List<Doctor> filterBasedOnAge(List<Doctor> list, Doctor d){
    	if(d.getAge()  <= 0){
        	return list;
    	}
    	int range = 5;
    	int maxRange = d.getAge()+range;
    	int minRange = d.getAge()-range;
    	List<Doctor> ageDoctors = new ArrayList<Doctor>();
    	for(int i=0;i<list.size();i++){
    		int age = list.get(i).getAge();
    		if(age >= minRange && age <= maxRange){
    			ageDoctors.add(list.get(i));
    		}
    	}
		return ageDoctors;	
	}
    
  // Filter the list based on the gender factor from input
	
    public List<Doctor> filterBasedOnSex(List<Doctor> list, Doctor d){
    	if(d.getSex() == null){
    		return list;
    	}
    	List<Doctor> genderDoctors = new ArrayList<Doctor>();
    	String sex = d.getSex();
    	for(int i=0;i<list.size();i++){
    		if((list.get(i).getSex()).equals(sex)){
    			genderDoctors.add(list.get(i));
    		}
    	}
		return genderDoctors;  	
    }
    
  // Filter the list based on the speciality factor from input
	
    public List<Doctor> filterBasedOnspeciality(List<Doctor> list, Doctor d){
    	if (d.getSpeciality() == null){
    		return list;
    	}
    	List<Doctor> specialityDoctors = new ArrayList<Doctor>();
    	String speciality = d.getSpeciality();
    	for(int i=0;i<list.size();i++){
    		String currentSpeciality = list.get(i).getSpeciality();
    		if(currentSpeciality.equals(speciality)){
    			specialityDoctors.add(list.get(i));
    		}
    	}
		return specialityDoctors;	
    }
    
  // Filter the list based on the review score from input
  //If input is negative entire list is returned
    public List<Doctor> filterBasedOnReviewScore(List<Doctor> list, Doctor d){
    	if(d.getReviewScore() <= 0){
    		return list;
    	}
    	List<Doctor> scoreDoctors = new ArrayList<Doctor>();
    	int reviewScore = d.getReviewScore();
		int range = 2;
		int maxScore = reviewScore+range;
		int minScore = reviewScore-range;
		for(int i=0;i<list.size();i++){
			int currentScore = list.get(i).getReviewScore();
			if(currentScore>=minScore && currentScore <= maxScore){
				scoreDoctors.add(list.get(i));
			}
		}
		return scoreDoctors;  	
    }
    
  // Filter the list based on the school attended from input
	
     public List<Doctor> filterBasedOnSchoolAttended(List<Doctor> list, Doctor d){
    	 if(d.getSchoolAttended() == null){
    		 return list;
    	 }
    	List<Doctor> schoolDoctors = new ArrayList<Doctor>();
    	String school = d.getSchoolAttended();
    	for(int i=0;i<list.size();i++){
    		String currentSchool =list.get(i).getSchoolAttended();
    		if(school.equals(currentSchool)){
    			schoolDoctors.add(list.get(i));
    		}
    	}
		return schoolDoctors;  	
    }
    
  // Filter the list based on the location factor from input
 	  
    public List<Doctor> filterBasedOnLocation(List<Doctor> list, Doctor d){
    	if(d.getLocation() == null){
    		return list;
    	}
    	List<Doctor> locationDoctors = new ArrayList<Doctor>();
    	String location = d.getLocation();
    	for(int i=0;i<list.size();i++){
    		String currentLocation = list.get(i).getLocation();
    		if(location.equals(currentLocation)){
    			locationDoctors.add(list.get(i));
    		}
    	}
		return locationDoctors;  	
    }
}
