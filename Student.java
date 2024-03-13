package com.guvi.task4;

public class Student {
	
		  private int rollNo;
		  private String name;
		  private int age;
		  private String course;

		  public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
		    if (age < 15 || age > 21) {
		      throw new AgeNotWithinRangeException("Age must be between 15 and 21");
		    }

		    if (!name.matches("[a-zA-Z]+")) {
		      throw new NameNotValidException("Name must only contain letters");
		    }

		    this.rollNo = rollNo;
		    this.name = name;
		    this.age = age;
		    this.course = course;
		  }

		  // Getters and setters omitted for brevity
		}

		class AgeNotWithinRangeException extends Exception {
		  public AgeNotWithinRangeException(String message) {
		    super(message);
		  }
		}

		class NameNotValidException extends Exception {
		  public NameNotValidException(String message) {
		    super(message);
		  }
		

		
		  }
		


