import static org.junit.Assert.*;

public class Quantity_Measurement_DeckTest {

    @org.junit.Test
    public void toInch_check_for_zero() throws Exception {
        Quantity_Measurement_Deck feet = new Quantity_Measurement_Deck(0);
        assertEquals(0,feet.toInch());
    }
}