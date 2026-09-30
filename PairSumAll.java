public class PairSumAll {
    static void findPairs(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int sum = 7;
        findPairs(arr, sum);
    }
}
