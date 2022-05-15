package Ship;

import java.util.Arrays;

public class PassengerShip extends Ship{

    public int maxCountPassengers;

    public PassengerShip(String name, int yearOfConstruction, int maxCountPassengers) {
        super(name, yearOfConstruction);
        this.maxCountPassengers = maxCountPassengers;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result.replaceAll(".", " ");
        return result + "и способно принять на борт " + maxCountPassengers + " пассажира(ов)";
    }
}
