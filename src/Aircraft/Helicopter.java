package Aircraft;

public class Helicopter extends Aircraft{

    public int screwDiameter, power;

    public Helicopter(int number, int speed, int screwDiameter, int power) {
        super(number, speed);
        this.screwDiameter = screwDiameter;
        this.power = power;
    }
}
