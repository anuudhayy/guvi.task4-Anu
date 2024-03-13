package com.guvi.task4;

//import com.guvi.task4.Student.AgeNotWithInRangeException;

public class StudentManagementSystem {
	
		  public static void main(String[] args) {
		    try {
		      Student student1 = new Student(1, "Anu@", 18, "Computer Science");
		      // Add student1 to the system
		    } catch (AgeNotWithinRangeException e) {
		      System.out.println("Error: " + e.getMessage());
		    } catch (NameNotValidException e) {
		      System.out.println("Error: " + e.getMessage());
		    
}
		  }}
/*
Error: Age must be between 15 and 21
Error: Name must only contain letters

*/