package Game;

public class Barracks {

    public Soldier[] units = new Soldier[3];

    public void add(Soldier unit) {
        for (int i = 0; i < units.length; i++) {
            if (units[i] == null) {
                units[i] = unit;
                break;
            }
        }
    }

    public void visit() {
        for (int i = 0; i < units.length; i++) {
            if (units[i] != null) {
                units[i].sound();
            }
        }
    }


}
