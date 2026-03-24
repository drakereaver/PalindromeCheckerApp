import java.util.Deque;
import java.util.Scanner;

        /**
         * Application entry point for UC7
         *
         * This is a Palindrome Checker App Welcome Message
         *
         * @author Developer
         * @version 1.0
         */


import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toLowerCase().toCharArray()) {
            list.add(c);
        }
        boolean isPalindrome = true;
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
