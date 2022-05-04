import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getNumberWithSeparator(scanner.nextLine()));
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

            result.append(stringForHandling, start, end);

        }

        return result.reverse().toString();

    }

}
