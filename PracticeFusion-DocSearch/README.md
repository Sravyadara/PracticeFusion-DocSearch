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
Get List of all Doctors: Object Mapper is used to read the values from input stream and map them to the DoctorsList class. DoctorsList is a class which contains an array of all the doctors.

filterBasedOnAge method takes input of list of doctors and doctor object.If the age is not specified in the input or if the input is negative ,it returns the input list else it compares age of all doctors with the age of input doctor. If the age is greater or less than the range, the specific doctor is removed from the list of doctors.

filterBasedOnSex method takes the processed list from the above step.If the sex is not specified in the input it returns the input list else it compares the gender of each doctor with the input doctor. If it’s not equal, the doctor is removed from the list.

filterBasedOnSpeciality method takes the processed list from the above step. If the speciality field is not specified it returns the input list else it compares the speciality of each doctor with the input doctor. If it’s not equal, the doctor is removed from the list.

filterBasedOnReviewScore method takes the processed list from the above step. If review score is not specified in the input or the entered input is negative, it returns the input list else it compares the review score of each doctor with the input doctor. If it’s not within the range, the doctor is removed from the list.

filterBasedOnLocation method takes the processed list from the above step. If the location is not specified it just returns the input list else it compares the location of each doctor with the input doctor. If it’s not equal, the doctor is removed from the list.

filterBasedOnSchoolAttended method takes the processed list from the above step, if the school attended is not specified in input it just returns the input list else it compares the school of each doctor with the input doctor. If it’s not equal, the doctor is removed from the list.

The list returned from the above method is output list of doctors who are similar to the doctor passed as input.

How To Run:
Navigate to the target folder from the project folder
Give java -jar “name of the jar file present in the target folder”
Here it is “java -jar demo-0.0.1-SNAPSHOT.jar”
It executes the code and results are printed.

Below are the results:

------Input search with doctor age and speciality------
InputDoctorAge:25 InputDoctorSpeciality:Cardiologist

------Search Results with doctor age and speciality------
DoctorName:Sravya,DoctorAge:26,DoctorSpeciality:Cardiologist
DoctorName:Sravanthi,DoctorAge:26,DoctorSpeciality:Cardiologist
DoctorName:Viha,DoctorAge:28,DoctorSpeciality:Cardiologist

Here when input is provided with age and speciality, it checks for doctors within the age limit of the input doctor. Range can be between inputage-5 and input age+5. If its beyond this range the doctor is eliminated. The output list is next passed to filter based on the speciality. If the speciality of doctor in the list doesn’t match with input speciality then the doctor is eliminated. The final result is both filtered based on age and speciality.

Negative Test Case:

InputDoctorAge:-21

Output:
DoctorName:Sravya,DoctorAge26
DoctorName:Sravanthi,DoctorAge26
DoctorName:Swetha,DoctorAge32
DoctorName:Hemanth,DoctorAge29
DoctorName:Bavana,DoctorAge28
DoctorName:Viha,DoctorAge28
DoctorName:Sowmya,DoctorAge38

Here the input provided is negative, so it returns list of all doctors present.






