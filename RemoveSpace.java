import java.util.Scanner;
public class RemoveSpace {
    static String removeSpaces(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result = result + ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = removeSpaces(str);
        System.out.println("After removing spaces: " + result);
        sc.close();
    }
}
