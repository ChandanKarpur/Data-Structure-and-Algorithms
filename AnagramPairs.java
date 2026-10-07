import java.util.*;
class AnagramPairs {
    static int countPairs(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char[] a = arr[i].toCharArray();
                char[] b = arr[j].toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                if (Arrays.equals(a, b)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Number of anagram pairs: "
                + countPairs(arr));
    }
}