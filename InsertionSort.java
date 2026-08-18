public class InsertionSort {
    public static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,6,10,5,9,2,1,15,7};
        int n = arr.length;

        InsertionSort.InsertionSort(arr);

        System.out.println("sorted array: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
