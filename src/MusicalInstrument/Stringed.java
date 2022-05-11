package MusicalInstrument;

public class Stringed extends MusicalInstrument{

    public int quantityOfStrings;

    public Stringed(String name, String manufacturer, int price, int quantityOfStrings) {
        super(name, manufacturer, price);
        this.quantityOfStrings = quantityOfStrings;
    }

    public String play() {
        return "name sounds beautiful";
    }

}
