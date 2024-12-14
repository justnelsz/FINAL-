import java.util.*;

public class MainStackMenu {
    public void launchMenu() {
        String userChoice = " ";
        Scanner scan = new Scanner(System.in);
        ClassStackMenu stackMenu;

        System.out.print("Enter size: ");
        int size = scan.nextInt();
        stackMenu = new ClassStackMenu(size);
        scan.nextLine();

        if (size <= 0) {
            System.out.println("Size is being set to 10");
            size = 10;
            stackMenu = new ClassStackMenu(size);
        }

        while (true) {
            System.out.println();
            System.out.println("------ STACK ARRAY MENU ------");
            System.out.println("1] Push an item\n2] Pop\n3] Peek\n4] Display Stack\nX] Exit Program");
            System.out.print("Please select a choice: ");
            userChoice = scan.nextLine();

            switch (userChoice) {
                case "1": // push an item
                    System.out.print("Enter item size: ");
                    String enterSize = scan.nextLine().trim();
                    if (stackMenu.push(enterSize)) {
                        System.out.println(enterSize + " pushed successfully");
                    } else {
                        System.out.println("Stack is Full. Cannot push!");
                    }
                    break;

                case "2": // pop
                    if (stackMenu.pop())
                        System.out.println("Pop successfully!");
                    else
                        System.out.println("Stack is Empty. There is no element to pop!");
                    break;

                case "3": // peek
                    if (stackMenu.peek() == null) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.println(stackMenu.peek() + " is being peeked");
                    }
                    break;

                case "4": // display stack
                    stackMenu.display();
                    break;

                case "x":
                case "X":
                    System.out.println("The program has stopped.");
                    return; // Exit the menu

                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }

    public static void main(String... args) {
        new MainStackMenu().launchMenu();
    }
}
