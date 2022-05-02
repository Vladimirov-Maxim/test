public class ToLine {

    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {

        int[] resultArray = new int[data.length * data[0].length];

        int iterator = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {

                resultArray[iterator] = data[i][j];
                iterator++;

            }
        }

        return resultArray;

    }

}
