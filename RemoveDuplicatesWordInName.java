package String;

import java.util.HashSet;

public class RemoveDuplicatesWordInName {


    public static void main(String[] args) {
        String input = "Kundan Kumar";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        HashSet<Character> hset = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!hset.contains(c)) {
                hset.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }

}

