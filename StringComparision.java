public class StringComparision {
    static String str1 = "Hello";
    static String str2 = "World";
    static String str3 = "Hello";

    public static void main(String[] args) {
        System.out.println("s1 == s2: " + (str1 == str2));
        System.out.println("s1 == s3: " + (str1 == str3));
        System.out.println("s2 == s3: " + (str2 == str3));

        System.out.println("s1.equals(s2): " + str1.equals(str2));
        System.out.println("s1.equals(s3): " + str1.equals(str3));
        System.out.println("s2.equals(s3): " + str2.equals(str3));
    }
}
