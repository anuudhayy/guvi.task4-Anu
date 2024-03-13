package com.guvi.task4;

public class VoterMain {
public static void main(String[] args)   {
	try {
		Voter vote= new Voter(1234, "Anu", 19);
		Voter v2= new Voter(125465, "vicky", 15);
	} catch (InvalidAgeException e) {
		
		e.printStackTrace();
	}
	
}
}


//Eligible for voting
//com.guvi.task4.InvalidAgeException: Invalid age for voter
//	at com.guvi.task4.Voter.<init>(Voter.java:13)
//	at com.guvi.task4.VoterMain.main(VoterMain.java:7)
