import Game.Barracks;
import Game.Knight;
import Game.Rifleman;
import Game.Soldier;
import Game2.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Human("Vasiliy"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new Tower("Big Ben"));

        battle.start();
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
