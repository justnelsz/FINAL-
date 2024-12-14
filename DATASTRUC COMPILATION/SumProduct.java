/*This java program will allow user to enter 10 integer numbers, computes the total sum and product that are greater than 0
Written by: Janelie S. Blanco BSCS 2A August 31, 2024*/
import java.util.Scanner;
 
public class SumProduct{
   public void launchSumProduct(){
      int userInput, sum = 0, product = 1;
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Enter 10 integer numbers to be calculated: "); //prompts the user
     
      for (int i = 0; i < 10; i++){
         userInput = scan.nextInt(); 
         if (userInput > 0){ 
            sum += userInput; //calc the sum
            product *= userInput; //calc the product
         }
      }
   
      //prints the sum and product of the userinput
      System.out.println("Total Sum: " + sum);
      System.out.println("Total Product: " + product);
   }
   public static void main(String[] args){
      new SumProduct().launchSumProduct();
   }
}

