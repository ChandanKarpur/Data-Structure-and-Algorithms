import java.util.Scanner;

public class RemoveSpecialCharacter {
    static String removeSpecial(String str) {
        return str.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeSpecial(str);

        System.out.println("After removing special characters: " + result);

        sc.close();
    }
}
