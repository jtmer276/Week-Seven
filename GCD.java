/********
Name: Jules Merrill
Date: 3-21-2024
Project: GCD
*********/

import java.util.*;

public class GCD {

    public static void main(String[] args){

        int temp = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first non-negative integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second non-negative integer: ");
        int num2 = input.nextInt();

        while (num2 != 0){
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
            
        
        }
        int GCD = num1;
        System.out.println("The GCD is " + GCD);

        input.close();

    }
}
