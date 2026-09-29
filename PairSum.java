import java.util.Scanner;

public class PairSum {
    static boolean checkPair(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j]);
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 7, 11, 15, 3, 6};

        System.out.print("Enter the sum: ");
        int sum = sc.nextInt();

        if (checkPair(arr, sum)) {
            System.out.println("Pair exists");
        } else {
            System.out.println("Pair does not exist");
        }
    }
}
