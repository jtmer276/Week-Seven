/********
Name: Jules Merrill
Date: 3-21-2024
Project: Prompter
*********/

import java.util.*;

public class Prompter {

    public static void main(String[] args){

        int temp = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first non-negative integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second non-negative integer: ");
        int num2 = input.nextInt();

        while (num2 > 0){
            temp = num1 % num2;
            if(num1 != 0){
                num1 = num2;
            }
            num2 = temp;
            System.out.println(temp);
        }

        input.close();

    }
}
