/*************
 * Name: Jules Merrill
 * Date: February 28th, 2024
 * Assingment: digits.jave
 */
import java.util.*;

public class DigitsSum{

  public static void main(String[] args){
    int num = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    num = input.nextInt();

    while(num > 1){
        for(int i = 10000; i <= 0; i--){
            num -= num%i;

        }
    }

    

    
    input.close();
  }
}