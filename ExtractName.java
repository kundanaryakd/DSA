package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractName {

    public static void main(String[] args) {
        String input = "Welcome Kundan Kumar";
        String regex = "Welcome(.+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String name = matcher.group(1);
            System.out.println("Extracted Name: " + name);
        } else {
            System.out.println("No match found.");
        }
    }
}


