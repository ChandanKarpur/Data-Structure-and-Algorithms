public class SubArraySum {
    static void findSubarray(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum = currentSum + arr[j];
                if (currentSum == sum) {
                    System.out.println("Subarray found");
                    System.out.println("Starting index: " + i);
                    System.out.println("Ending index: " + j);
                    return;
                }
            }
        }
        System.out.println("Subarray not found");
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 37;
        findSubarray(arr, sum);
    }
}
