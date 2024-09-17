package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractOrderNum {
    public static void main(String[] args) {
        String str1 = "order#12345 is successfully placed.";

        System.out.println("Extracted order number: " + extractOrderNumber(str1));
    }

    public static String extractOrderNumber(String str) {
        String regex = "order#(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
