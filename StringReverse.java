package String;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        String name;
        String reverse = "";
        Scanner kb = new Scanner(System.in);
        System.out.println("Please Enter the name you want to reverse");
        name = kb.nextLine();

        for(int i = name.length()-1; i>=0;i--){
            reverse += name.charAt(i);
        }

        System.out.println("The Reverse of name " + name + " is >> " + reverse);
    }
}
