package Ship;

public class Ship {

    public String name;
    public int yearOfConstruction;

    public Ship(String name, int yearOfConstruction) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public String toString() {
        return String.format("Судно %s построено в %s году.", name, yearOfConstruction);
    }
}
