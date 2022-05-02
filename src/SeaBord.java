public class SeaBord {

    private String field[][] = {
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
    };

    public String[][] getField() {

        return field;

    }

    public void shoot(int line, int column, String issue) {

        String result = null;

        if (issue.equals("m")) {
            result = "#";
        } else if (issue.equals("h") || issue.equals("d")) {
            result = "X";
        }

        field[line][column] = result;

    }

    public String check(int line, int column) {

        return field[line][column];

    }

}
