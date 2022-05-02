import java.util.Arrays;

public class TicTacToe {

    String[][] field = new String[3][3];;
    boolean gameStarted = false;
    int countMove = 0;

    public TicTacToe() {
        newGame();
    }

    public void newGame() {
        gameStarted = true;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                field[i][j] = "-";

            }
        }

    }

    public void getField() {

        for (int i = 0; i < field.length; i++) {

            System.out.println(Arrays.toString(field[i]));

        }

    }

    public String checkGame() {

        String result = null;

        if (!field[0][0].equals("-")) {

            if (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2])) {

                gameStarted = false;
                return field[0][0];

            }else if (field[0][0].equals(field[0][1]) && field[0][1].equals(field[0][2])) {

                gameStarted = false;
                return field[0][0];

            } else if (field[0][0].equals(field[1][0]) && field[1][0].equals(field[2][0])) {

                gameStarted = false;
                return field[0][0];

            }

        }

        if (!field[0][2].equals("-")) {

             if (field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) {

                gameStarted = false;
                return field[0][2];

            } else if (field[0][2].equals(field[1][2]) && field[1][2].equals(field[2][2])) {

                gameStarted = false;
                return field[0][2];

            }

        }

        if (!field[0][1].equals("-")) {

            if (field[0][1].equals(field[1][1]) && field[1][1].equals(field[2][1])) {
                gameStarted = false;
                return field[0][1];
            }

        }

        if (!field[1][0].equals("-")) {

            if (field[1][0].equals(field[1][1]) && field[1][1].equals(field[1][2])) {
                gameStarted = false;
                return field[1][0];
            }

        }

        if (!field[2][0].equals("-")) {

            if (field[2][0].equals(field[2][1]) && field[2][1].equals(field[2][2])) {
                gameStarted = false;
                return field[2][0];
            }

        }


        if (countMove == 10) {
            gameStarted = false;
            return "D";
        }

        return result;

    }

    public String makeMove(int x, int y) {

        int indexX = x - 1;
        int indexY = y - 1;

        if (!gameStarted) {
            return "Game was ended";
        } else if (!field[indexX][indexY].equals("-")) {
            return String.format("Cell %s, %s is already occupied", x,y);
        }

        countMove++;

        if (countMove % 2 == 0) {
            field[indexX][indexY] = "0";
        } else {
            field[indexX][indexY] = "X";
        }

        String result = checkGame();

        if (result == null) {
            return "Move completed";
        } else if (result.equals("D")) {
            return "Draw";
        } else {
            return String.format("Player %s won", result);
        }

    }

}
