/*******
Name: Jules Merrill
Date: 3-21-2024
Project: NumbersSum
******/

import java.util.*;

public class NumbersSum{

    public static void main(String[] args){
        int initial_number = 0;
        int the_sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        initial_number = input.nextInt();
        System.out.println(initial_number);
        the_sum += initial_number;

        while( initial_number>1 )
        {
            initial_number = initial_number - 1;
            the_sum += initial_number;
            System.out.println(initial_number);
        }
        
        System.out.println("This is the sum of the numbers: " + the_sum);


        input.close();
    }
}