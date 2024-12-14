import java.util.*;

public class Main {
   public static void main(String[] args){
      String userChoice = " ";
      Scanner scan = new Scanner(System.in);
      ClassStackMenu csm = new ClassStackMenu();
      PostfixProgram pp = new PostfixProgram();
      MainQueueNode mqn = new MainQueueNode();
      MainStackMenu msm = new MainStackMenu();
      QueueMenu qm = new QueueMenu();
      QueueNode qn = new QueueNode();
      StackArray sa = new StackArray();
      StackList sl = new StackList();
      TestNodeList tnl = new TestNodeList();
      TestStackArray tsa = new TestStackArray();
      DupeFilter df = new DupeFilter();
      OddEvenNumbers oen = new OddEvenNumbers();
      SumProduct sp = new SumProduct();
   
      while (true){
         System.out.println();
         System.out.println("------ COMPILATION MENU ------");
         System.out.println("1] Duplicate Filter");
         System.out.println("2] Queue Node");
         System.out.println("3] Stack Array Menu");
         System.out.println("4] Odd Even Numbers");
         System.out.println("5] Postfix Menu");
         System.out.println("6] Queue Array Menu");
         System.out.println("7] Stack List");
         System.out.println("8] Sum Product");
         System.out.println("9] Node List");
         System.out.println("10] Test Stack Array");
         System.out.println("X] Exit Program");
         System.out.print("Please select a choice: ");
         userChoice = scan.nextLine();
      
         switch(userChoice){
            case "1": 
               df.filterDuplicates();
               break;
            
            case "2":
               mqn.launchMenu();
               break;
         
            case "3":
               msm.launchMenu();
               break;
         
            case "4":
               OddEvenNumbers.main(null);
               break;
            
            case "5":
               pp.launchPostfix();
               break;
            
            case "6":
               qm.launchQueueMenu();
               break;
         
            case "7":
               sl.push("java");
               sl.push("ccs");
               sl.push("uc");
               sl.push("it");
               sl.display();
               sl.push("cs");
               sl.display();
               sl.pop();
               sl.pop();
               sl.display();
               sl.push("c++");
               sl.display();
               break;
         
            case "8":
               sp.launchSumProduct();
               break;
         
            case "9":
               TestNodeList.main(null);
               break;
         
            case "10":
               TestStackArray.main(new String[0]);
               break;
         
            case "x":
            case "X":
               System.out.println("Thank you for using! Exiting...");
               return;
         
            default:
               System.out.println("Invalid input. Please try again.");
               break;
         }
      }
   }
}
