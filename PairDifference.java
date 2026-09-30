public class PairDifference {
    static boolean findPair(int[] arr, int difference) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == difference) {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5, 20, 3, 2, 50, 80};
        if (!findPair(arr, 18)) {
            System.out.println("Pair not found");
        }
    }
}
