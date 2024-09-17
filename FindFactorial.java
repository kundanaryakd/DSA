package Numbers;
import java.util.Scanner;

public class FindFactorial {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Please Enter the number");

        int number = kb.nextInt();

        System.out.println(FindFactorial(number));
    }

    public static int FindFactorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

}
