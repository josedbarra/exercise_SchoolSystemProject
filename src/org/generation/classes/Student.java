package org.generation.classes;

public class Student {
	//Propiedades
        String firstName;
		String lastName;
        int registration;
        int grade;
        int year;
        
        //Constructores
        public Student(String firstName, String lastName, int registration, int grade, int year) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.registration = registration;
			this.grade = grade;
			this.year = year;
		}//Constructor 1
    
        public Student(String firstName, int registration, int grade) {
			super();
			this.firstName = firstName;
			this.registration = registration;
			this.grade = grade;
        }//Constructor 2
	 
        public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
        }//Constructor 3

		public void printFullName(String firstName, String lastName){
            System.out.println(firstName + lastName);
         }//printFullName

         public boolean isApproved(int grade){
        	 
             //TODO implement: should return true if grade >= 60
        	 if(grade >=60) {
        		 return true;
        	 }
			return false;
         }//isApproved

         public void changeYearIfApproved(int grade, int year){
             //TODO implement: the student should advance to the next year if he/she grade is >= 60
             // Make year = year + 1, and print "Congratulations" if the student has been approved
             if (grade >= 60) {
            	 year = year + 1;
             }
             System.out.println("Congratulations");
         }//changeYearIfApproved


}//class Student

