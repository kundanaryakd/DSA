package String;

public class ReverseStringOnSameIndex {


        public static void main(String[] args) {
            String input = "Hello EY";
            String reversed = reverseWords(input);
            System.out.println(reversed);
        }

        public static String reverseWords(String str) {
            String[] words = str.split(" ");
            StringBuilder reversed = new StringBuilder();

            for (String word : words) {
                StringBuilder reverseWord = new StringBuilder(word);
                reversed.append(reverseWord.reverse().toString()).append(" ");
            }

            // Remove the trailing space
            return reversed.toString().trim();
        }
    }


