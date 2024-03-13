package com.guvi.task4;

import java.util.HashMap;

public class StudentGrades {

    private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        this.studentGrades = new HashMap<String, Integer>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public Integer getStudentGrade(String name) {
        return studentGrades.get(name);
    }

    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        grades.addStudent("Anu", 90);
        grades.addStudent("Arthy", 85);
        grades.addStudent("vicky", 75);

        System.out.println("Anu grade: " + grades.getStudentGrade("Anu"));
        System.out.println("Arthy grade: " + grades.getStudentGrade("Arthy"));
        System.out.println("vicky grade: " + grades.getStudentGrade("Vicky"));

      grades.removeStudent("Arthy");

        System.out.println("Arthy grade after removal: " + grades.getStudentGrade("Arthy"));
    }

}


/*
Anu grade: 90
Arthy grade: 85
vicky grade: null
Arthy grade after removal: null
*/