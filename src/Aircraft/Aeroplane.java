package Aircraft;

public class Aeroplane extends Aircraft{

    public int wingspan;

    public Aeroplane(int number, int speed, int wingspan) {
        super(number, speed);
        this.wingspan = wingspan;
    }

}
