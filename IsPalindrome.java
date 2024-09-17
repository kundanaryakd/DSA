package Numbers;

public class IsPalindrome {

    public static void main(String[] args) {

        int number = 12321;
        System.out.println(" is Palindrome >> " + checkPalindrome(number));

    }

    public static boolean checkPalindrome(int number) {
        int temp = number;
        int rev = 0;

        while (temp != 0) {
          int   lastNumber = temp % 10;
            rev = rev * 10 + lastNumber;
            temp = temp / 10;
        }
        return rev == number;
    }
}
