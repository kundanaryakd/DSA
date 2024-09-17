package String;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "Madam";

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String s) {
        // Remove spaces and convert to lowercase
        s = s.replaceAll("\\s+", "").toLowerCase();

        // Create a StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();

        // Check if the reversed string equals the original string
        return s.equals(reversed.toString());
    }
}


