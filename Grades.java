/*****
Name: Jules Merrill
Date: 3-19-2024
Project: Grades
******/

import java.util.*;


public class Grades{
    public static void main(String[] args){
        int student_grade = 0;
        String letter_grade = "Blank";
        String message = "Blank";


        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numerical grade: ");
        student_grade = input.nextInt();

        if(student_grade >= 90){
            letter_grade = "A";
            message = "You're doing an excellent job.";
        }
        if(student_grade >= 80 && student_grade < 90){
            letter_grade = "B";
            message = "You're doing a better than average job.";
        }
        if(student_grade >= 70 && student_grade < 80){
            letter_grade = "C";
            message = "Start studying more.";
        }
        if(student_grade >= 60 && student_grade < 70){
            letter_grade = "D";
            message = "You should be concerned.";
        }
        if(student_grade < 60){
            letter_grade = "F";
            message = "F is for failure not fantastic.";
        }
        System.out.println("You've received a " + letter_grade) ;
        System.out.println(message);
        
        

        }

}