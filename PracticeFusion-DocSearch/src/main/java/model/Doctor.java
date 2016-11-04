package model;

public class Doctor {
	
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private int phoneNumber;
	private int age;
	private String sex;
	private String speciality;
	private int yearsOfExp;
	private int reviewScore;
	private String schoolAttended;
	private String degree;
    private String location;
    
    
	public long getId() {
		return id;
	}
	public Doctor withId(int id) {
		this.id = id;
		return this;
	}
	public String getFirstName() {
		return firstName;
	}
	public Doctor withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getLastName() {
		return lastName;
	}
	public Doctor withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public Doctor withAddress(String address) {
		this.address = address;
		return this;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public Doctor withPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Doctor withAge(int age) {
		this.age = age;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public Doctor withSex(String sex) {
		this.sex = sex;
		return this;
	}
	public String getSpeciality() {
		return speciality;
	}
	public Doctor withSpeciality(String speciality) {
		this.speciality = speciality;
		return this;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public Doctor withYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
		return this;
	}
	public String getSchoolAttended() {
		return schoolAttended;
	}
	public Doctor withSchoolAttended(String schoolAttended) {
		this.schoolAttended = schoolAttended;
		return this;
	}
	public String getDegree() {
		return degree;
	}
	public Doctor withDegree(String degree) {
		this.degree = degree;
		return this;
	}
	public String getLocation() {
		return location;
	}
	public Doctor withLocation(String location) {
		this.location = location;
		return this;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public Doctor withReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
		return this;
	}
	

}
