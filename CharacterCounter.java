import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' || ch == 'u') {

                    vowels++;

                } else {
                    consonants++;
                }

            } else if (ch >= '0' && ch <= '9') {
                digits++;

            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Vowels     : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Digits     : " + digits);
        System.out.println("Spaces     : " + spaces);

        sc.close();
    }
}