import java.util.*;

public class PostfixProgram {
    public void launchPostfix() {  // Non-static method to handle postfix menu
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println();
            System.out.println("------ POSTFIX MENU ------");
            System.out.println("1] Convert to Postfix\n2] Evaluate Postfix\nX] Exit Program");
            System.out.print("Please select a choice: ");
            String userChoice = scan.nextLine();
                         
            switch (userChoice) {
                case "1": // Convert to postfix
                    System.out.print("Enter expression: ");
                    String expression = scan.nextLine();
                    InfixtoPostfix ip = new InfixtoPostfix(expression);
                    System.out.println("Result: " + ip.convert());
                    break;
          
                case "2": // Evaluate the postfix
                    System.out.println("Enter postfix expression to be evaluated: ");
                    String postfixE = scan.nextLine();
                    Evaluate e = new Evaluate(postfixE);
                    System.out.println("Result: " + e.getResult());
                    break;
                
                case "x":
                case "X":
                    System.out.println("The program has stopped.");
                    return;
                
                default:
                    System.out.println("Invalid input. Please try again");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        new PostfixProgram().launchPostfix();
    }
}
