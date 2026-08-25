import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nDuplicate elements:");

        boolean found = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {

                    boolean alreadyPrinted = false;

                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (!alreadyPrinted) {
                        System.out.print(arr[i] + " ");
                        found = true;
                    }

                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements.");
        }

        sc.close();
    }
}