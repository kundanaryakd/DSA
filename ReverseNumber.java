package Numbers;

public class ReverseNumber {


    public static int reverseInteger(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseInteger(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
