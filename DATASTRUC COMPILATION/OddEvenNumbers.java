import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int userInput;
        int[] evenNumber = new int[10];
        int[] oddNumber = new int[10];
        int countEven = 0, countOdd = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 integer numbers: "); // Prompt user to enter 10 integers
        for (int i = 0; i < 10; i++) {
            userInput = scan.nextInt();
            if (userInput % 2 == 0)
                evenNumber[countEven++] = userInput; // Even
            else
                oddNumber[countOdd++] = userInput; // Odd
        }

        System.out.println("Even\t\t\tOdd"); // Output
        for (int i = 0; i < (Math.max(countEven, countOdd)); i++) {
            if (i < countEven)
                System.out.print(evenNumber[i] + "\t\t\t");
            else
                System.out.print("\t\t\t");  // To align with odd numbers

            if (i < countOdd)
                System.out.println(oddNumber[i] + " ");
            else
                System.out.println();
        }
    }
}
