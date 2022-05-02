import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*ToTable toTable = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] resultArray = toTable.resize();
        System.out.println(Arrays.deepToString(resultArray));

        ToLine toLine = new ToLine(resultArray);
        int[] resultArray2 = toLine.resize();
        System.out.println(Arrays.toString(resultArray2));*/

       /* TicTacToe board = new TicTacToe();
        board.getField();
        System.out.println(board.makeMove(1, 1));
        board.getField();
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
        board.getField();
        System.out.println(board.makeMove(2, 1));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 1));
        System.out.println(board.makeMove(2, 2));
        board.getField();*/

        Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
        System.out.println(s.maxNuts());
        Squirrel s2 = new Squirrel(new int[] {1, -2, 3, 1, -1, -4, 2, 3});
        System.out.println(s2.maxNuts());
        Squirrel s3 = new Squirrel(new int[] {-2, 2, -1, -7, 9, 5, -1, 4});
        System.out.println(s3.maxNuts());
        Squirrel s4 = new Squirrel(new int[] {-2, -7, 2, 6, -3, 5, 4, -8});
        System.out.println(s4.maxNuts());
        Squirrel s5 = new Squirrel(new int[] {-2, -4, -3, -9, -2, 1, 3, -5});
        System.out.println(s5.maxNuts());
        Squirrel s6 = new Squirrel(new int[] {-2});
        System.out.println(s6.maxNuts());


    }
}
