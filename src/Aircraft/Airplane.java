package Aircraft;

public class Airplane extends Aeroplane{

    public int power;

    public Airplane(int number, int speed, int wingspan, int power) {
        super(number, speed, wingspan);
        this.power = power;
    }
}
