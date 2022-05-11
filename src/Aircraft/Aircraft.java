package Aircraft;

public class Aircraft {

    public int number, speed;

    public Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public double flight(int n) {
        return n / speed;
    }

}
