import static org.junit.Assert.*;

public class Quantity_Measurement_DeckTest {

    Quantity_Measurement_Deck object_of_QM = new Quantity_Measurement_Deck();

    //.....................................TEST CASES FOR FEET.........................................................
    @org.junit.Test
    public void Feet_is_zero_should_return_zero_feet() throws Exception
    {
        Object result = object_of_QM.function_for_returning_value_of_feet(0);
        assertEquals(0, (int) result );
    }

    @org.junit.Test
    public void null_check_for_feet() throws Exception
    {
        Object result = object_of_QM.function_for_returning_value_of_feet(null);
        assertEquals("Null Value", (String) result);
    }

    @org.junit.Test
    public void type_check_for_feet() throws Exception
    {
        Object result = object_of_QM.function_for_returning_value_of_feet(1);
        boolean b = Integer.class.isInstance(result);
        assertEquals(true, b );
    }

    @org.junit.Test
    public void value_check_for_feet() throws Exception
    {
        Object result = object_of_QM.function_for_returning_value_of_feet(1);
        assertEquals(1,(int) result);
    }



    //....................................TEST CASES FOR INCH................................................................
    @org.junit.Test
    public void inch_is_zero_should_return_zero_inch() throws Exception
    {
        Object result = object_of_QM.function_for_returning_value_of_inch(0);
        assertEquals(0, (int) result );
    }

    @org.junit.Test
    public void null_check_for_inch() throws Exception
    {
        Object result = object_of_QM.function_for_returning_value_of_inch(null);
        assertEquals("Null Value", (String) result);
    }

    @org.junit.Test
    public void type_check_for_inch() throws Exception
    {
        Object result = object_of_QM.function_for_returning_value_of_inch(1);
        boolean b = Integer.class.isInstance(result);
        assertEquals(true, b );
    }

    @org.junit.Test
    public void value_check_for_inch() throws Exception
    {
        Object result = object_of_QM.function_for_returning_value_of_inch(1);
        assertEquals(1,(int) result);
    }



    //.............................TEST CASE: 0 Feet and 0 Inch should return Equal....................................
    @org.junit.Test
    public void Equality_check_for_zero_feet_and_zero_inch() throws Exception
    {
        Object result1 = object_of_QM.function_for_returning_value_of_feet(1);
        Object result2 = object_of_QM.function_for_returning_value_of_inch(1);
        assertEquals((int) result2,(int) result1);
    }



    //..........................TEST CASES for COMPARING the LENGTHS...................................................
    @org.junit.Test
    public void one_feet_not_equals_one_inch() throws Exception
    {
        Object result1 = object_of_QM.function_for_returning_value_of_feet(1);
        Object result2 = object_of_QM.function_for_converting_feet_toInch(result1);
        boolean a=(result1).equals(result2);
        assertEquals(false,a);
    }

    @org.junit.Test
    public void one_inch_not_equals_one_feet() throws Exception
    {
        Object result1 = object_of_QM.function_for_converting_feet_toInch(1);
        Object result2 = object_of_QM.function_for_returning_value_of_feet(1);
        boolean a=(result1).equals(result2);
        assertEquals(false,a);
    }

    @org.junit.Test
    public void one_feet_equals_twelve_inch() throws Exception
    {
        Object result = object_of_QM.function_for_converting_feet_toInch(1);
        assertEquals(12,(int) result);
    }

    @org.junit.Test
    public void twelve_inch_equals_one_feet() throws Exception
    {
        Object result = object_of_QM.function_for_converting_inch_toFeet(12);
        assertEquals(1,(int) result);
    }


}