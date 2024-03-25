/********
Name: Jules Merrill
Date: 3-25-2024
Project: Investment

*********/
import java.text.NumberFormat;

public class investment{
    public static void main(String[] args){
        double initial_value = 2500.00;
        double final_value = 5000.00;
        int years = 0;

        NumberFormat currency= NumberFormat.getCurrencyInstance();
        
        while(initial_value < final_value){

            initial_value += initial_value*0.075;
            years += 1;

        }

        System.out.println("It will take " +(years)+" years to reach " + currency.format(initial_value));
    }
}

