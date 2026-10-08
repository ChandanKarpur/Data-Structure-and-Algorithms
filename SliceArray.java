import java.util.*;

public class SliceArray {
    static int[] sliceArray(int[] arr, int start, int end) {
        int[] result = new int[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int start = 1;
        int end = 4;
        int[] result = sliceArray(arr, start, end);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sliced Array: " + Arrays.toString(result));
    }
}
