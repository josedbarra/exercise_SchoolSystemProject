package org.generation;
import org.generation.classes.Student;

public class Courses {
	
	//Atributos
	String courseName;
	String professorName;
	int year;
	
	//Constructor
	public Courses(String courseName, String professorName, int year) {
			this.courseName = courseName;
			this.professorName = professorName;
			this.year = year;
	}
	
	//Getters & Setters
	   public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getProfessorName() {
		return professorName;
	}


	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	
	//toString
	



	public void enroll(Student student){
		      //TODO add the student to the collection
		   }

		  
		public void unEnroll(Student student){
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
		   }

		   public int countStudents(){
		       //TODO implement
		       return 0;
		   }
		   
		   public int bestGrade(){
		       //TODO implement
		       return 0;
		   }
}
