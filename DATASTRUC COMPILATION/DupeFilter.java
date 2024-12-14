import java.util.Scanner;

public class DupeFilter {

    public void filterDuplicates() {
        boolean duplicate;

        int outSize = 0;
        int nums[] = new int[10];
        int out[] = new int[10];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            duplicate = false;

            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                out[outSize] = nums[i];
                outSize++;
            }
        }

        System.out.print("The numbers you entered (w/o duplicates): ");
        for (int i = 0; i < outSize; i++) {
            System.out.print(out[i] + " ");
        }
        System.out.println();
    }
}
