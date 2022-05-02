public class Mage {

    public String name, type;
    public int damage, level;

    public Mage(String name, String type, int damage, int level) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.level = level;
    }

    public String getInfo() {
        return this.name + ", " + this.level + ", " + this.damage + ", " + this.type;
    }

    public String fight(Mage mage) {

        String winnerName;

        String typeEnemy = mage.type;

        if (type.equals("fire") && typeEnemy.equals("ice") || type.equals("ice") && typeEnemy.equals("earth") || type.equals("earth") && typeEnemy.equals("fire")) {
            winnerName = name;
        } else if (type.equals("fire") && typeEnemy.equals("earth") || type.equals("ice") && typeEnemy.equals("fire") || type.equals("earth") && typeEnemy.equals("ice")) {
            winnerName = mage.name;
        } else
            winnerName = compareByScore(mage);

        return winnerName;
    }

    public String compareByScore(Mage mage) {

        String winnerName;

        if (mage.level > level) {
            winnerName = mage.name;
        } else if (level > mage.level) {
            winnerName = name;
        } else {

            if (mage.damage > damage) {
                winnerName = mage.name;
            } else if (damage > mage.damage) {
                winnerName = name;
            } else {
                winnerName = "draw";
            }

        }

        return winnerName;

    }

}
