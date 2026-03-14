import java.util.Scanner;

/**
 * Application entry point for UC3
 *
 * This is a Palindrome Checker App Welcome Message
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "radar";

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}