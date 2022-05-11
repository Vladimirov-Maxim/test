import Game.Barracks;
import Game.Knight;
import Game.Rifleman;
import Game.Soldier;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        Barracks barracks = new Barracks();
        barracks.add(new Soldier("Пехотинец"));
        barracks.add(new Knight("Рыцарь"));
        barracks.add(new Rifleman("Мушкетер"));

        barracks.visit();


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
