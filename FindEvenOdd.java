package Numbers;

import java.util.Scanner;

public class FindEvenOdd {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = kb.nextInt();

        System.out.println(CheckEvenOdd(number));
    }


    public static String CheckEvenOdd(int number) {

        if (number % 2 == 0) {
            return "Even number";
        } else return "Odd Number";

    }
}
