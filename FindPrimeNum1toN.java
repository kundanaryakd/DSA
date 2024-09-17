package Numbers;

import java.util.Scanner;

public class FindPrimeNum1toN {

    public static void main(String[] args) {
        int number;
        Scanner kb = new Scanner(System.in);
        number = kb.nextInt();

        for (int i = 1; i < number; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {

        if (num == 0 && num == 1) return false;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) return false;
        }

        return true;
    }

}

