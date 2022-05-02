public class LimitingRectangle {

    int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int getWidth() {

        int width = 0;

        if (points.length > 0) {

            int x1 = points[0][0];
            int x2 = points[1][0];

            width = x1 >= x2 ? x1 - x2 : x2 -x1;

        }

        return width;
    }

    public int getHeight() {

        int height = 0;

        if (points.length > 0) {

            int y1 = points[0][1];
            int y2 = points[1][1];

            height = y1 >= y2 ? y1 - y2 : y2 - y1;

        }

        return height;
    }

    public String getBorders() {
        return null;
    }

}
