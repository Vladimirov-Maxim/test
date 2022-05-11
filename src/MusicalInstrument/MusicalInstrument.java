package MusicalInstrument;

public class MusicalInstrument {

    public String name, manufacturer;
    public int price;

    public MusicalInstrument(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String info(){
        return name + " " + manufacturer + " " + price;
    }

}
