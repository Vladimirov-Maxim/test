package Game;

public class Rifleman extends Soldier {

    public Rifleman(String name) {
        super(name);
        price = 205;
        phrase = "Мушкет и жену не дам никому";
    }

    @Override
    public void attack() {
        super.attack();
    }

}
