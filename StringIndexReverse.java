package String;

public class StringIndexReverse {

    public static void main(String[] args) {

        String phrase = "I Love my India";

        System.out.println(reversedByIndex(phrase));
    }

    public static String reversedByIndex (String phrase){
        String [] words = phrase.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i = words.length -1 ; i>=0; i--){
            sb.append(words[i]).append(" ");
        }

        return sb.toString().trim();

    }
}
