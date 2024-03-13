package com.guvi.task4;

import java.util.Scanner;
public class PrintingWeekDays {
    public static void main(String[] args)  {
    	//PrintingWeekDays pd= new PrintingWeekDays();

String[] weekdays = new String[7];
weekdays[0] = "Sunday";
weekdays[1] = "Monday";
weekdays[2] = "Tuesday";
weekdays[3] = "Wednesday";
weekdays[4] = "Thursday";
weekdays[5] = "Friday";
weekdays[6] = "Saturday";

Scanner scanner = new Scanner(System.in);
System.out.println("Enter a day position (0-6): ");
int dayPosition = scanner.nextInt();
try {
if (dayPosition < 0 ) {
	throw new InvalidArrayException("index not in range");
    //System.out.println("Invalid day position. Please enter a number between 0 and 6.");
} else {
    System.out.println("Day at position " + dayPosition + " is " + weekdays[dayPosition]);
}
}
catch(Exception e) {
	e.printStackTrace();
}


}
}
	



