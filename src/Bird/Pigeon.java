package Bird;

import Bird.Bird;

public class Pigeon extends Bird {

    private int hunger;

    public Pigeon(String[] continents, int population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;
    }

    public void askForSeeds() {
        hunger = Math.max(hunger - 7, 0);
    }

    public void sleep() {
        hunger += 3;
    }

    public int getHunger() {
        return hunger;
    }
}
