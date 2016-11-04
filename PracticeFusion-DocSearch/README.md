# PracticeFusion-DocSearch
Doctors.json : This file contains list of doctors in JSON format.

Model:
Doctor : Doctor class is a blueprint of a doctor.
Doctors List: It contains List of all doctors.

Doctor and DoctorsList are both used to read the values from JSON object, since we stored all doctors in JSON format.

Service:
It contains DoctorSearch class where methods to filter doctors based on age, speciality, location etc are present.

When a doctor object  is passed as an input, processRequest method takes the doctor object as input and further processes by getting a list of all doctors and filtering the doctors based on their age, location, speciality etc.

Logic:
Get List of all Doctors

filterBasedOnAge method takes input of list of doctors and doctor object.If the age is not specified in the input it returns the input list else it compares age of all doctors with the age of input doctor. If the age is greater or less than the range, the specific doctor is removed from the list of doctors.

filterBasedOnSex method takes the processed list from the above step.If the sex is not specified in the input it returns the input list else it compares the gender of each doctor with the input doctor. If it’s not equal, the doctor is removed from the list.

filterBasedOnSpeciality method takes the processed list from the above step. If the speciality field is not specified it returns the input list else it compares the speciality of each doctor with the input doctor. If it’s not equal, the doctor is removed from the list.

filterBasedOnReviewScore method takes the processed list from the above step. If review score is not specified in the input it returns the input list else it compares the review score of each doctor with the input doctor. If it’s not within the range, the doctor is removed from the list.

filterBasedOnLocation method takes the processed list from the above step. If the location is not specified it just returns the input list else it compares the location of each doctor with the input doctor. If it’s not equal, the doctor is removed from the list.

filterBasedOnSchoolAttended method takes the processed list from the above step, if the school attended is not specified in input it just returns the input list else it compares the school of each doctor with the input doctor. If it’s not equal, the doctor is removed from the list.

The list returned from the above method is output list of doctors who are similar to the doctor passed as input.



