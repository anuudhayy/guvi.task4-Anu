package com.guvi.task4;

public class Voter {
	
	    private int voterId;
	    private String name;
	    private int age;

	    public Voter(int voterId, String name, int age) throws InvalidAgeException {
	        this.voterId = voterId;
	        this.name = name;
	        if (age < 18) {
	            throw new InvalidAgeException("Invalid age for voter");
	        }
	        else {
	        	System.out.println("Eligible for voting");
	        }
	        this.age = age;
	    }

	   	}

	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}


