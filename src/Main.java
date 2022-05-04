import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(getNumberWithSeparator("12345678"));
    }

    public static String getNumberWithSeparator(String number) {

        StringBuilder result = new StringBuilder();
        String stringForHandling = new StringBuilder(number).reverse().toString();

        Pattern pattern = Pattern.compile("\\d{1,3}");
        Matcher matcher = pattern.matcher(stringForHandling);

        while (matcher.find()) {

            int start = matcher.start();
            int end = matcher.end();

            if (!result.toString().equals("")) {
                result.append(",");
            }

            result.append(number, start, end);

        }

        return result.reverse().toString();

    }

}
