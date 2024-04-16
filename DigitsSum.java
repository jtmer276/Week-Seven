/*************
 * Name: Jules Merrill
 * Date: February 28th, 2024
 * Assingment: digits.jave
 */
import java.util.*;

public class DigitsSum{

  public static void main(String[] args){
  int num = 0;
  int num_length = 0;
  int num_final = 0;
  String i = "";

  Scanner input = new Scanner(System.in);

  System.out.print("Enter a positive integer: ");
  num = input.nextInt();

  String num_str = "" + num;
  num_length = num_str.length();

  for(int a = 0; a < num_length; a++){

    i = num_str.substring(a, a + 1);
    num_final += Integer.valueOf(i);


  }

  System.out.println("The sum of the digits is: " + num_final);



    
  input.close();
  }
}