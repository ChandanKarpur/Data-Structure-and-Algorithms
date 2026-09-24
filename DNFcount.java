public class DNFcount {
    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 2, 1, 0, 0, 2};

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i=0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero++;
            else if (arr[i] == 1)
                one++;
            else
                two++;
        }

        System.out.println("0 = " + zero);
        System.out.println("1 = " + one);
        System.out.println("2 = " + two);
    }
}
