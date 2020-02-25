// Welcome to Quantity Measurement Program
public class Quantity_Measurement_Deck {
    private int feet;

    public Quantity_Measurement_Deck(int feet) {
        this.feet = feet;
    }

    public int toInch() {

        return feet*12;
    }
}
