import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        /**
         * Application entry point for UC2
         *
         * This is a Palindrome Checker App Welcome Message
         *
         * @author Developer
         * @version 1.0
         */
        String str = "madam";
        boolean isPalindrome = true;

        for(int i = 0; i < str.length() / 2; i++)
            if(str.charAt(1) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
