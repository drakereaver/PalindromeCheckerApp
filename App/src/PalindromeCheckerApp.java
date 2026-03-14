import java.util.Scanner;

        /**
         * Application entry point for UC2
         *
         * This is a Palindrome Checker App Welcome Message
         *
         * @author Developer
         * @version 1.0
         */
public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
