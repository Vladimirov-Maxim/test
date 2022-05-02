public class ToTable {

    public int[] data;
    public int x, y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {

        int[][] resultArray = new int[x][y];

        int iterator = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                if (iterator < data.length) {
                    resultArray[i][j] = data[iterator];
                    iterator++;
                } else {
                    break;
                }

            }
        }

        return resultArray;

    }

}
