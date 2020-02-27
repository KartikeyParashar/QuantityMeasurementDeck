// Welcome to Quantity Measurement Program
public class Quantity_Measurement_Deck
{
    private Object feet;
    private Object inch;

    public Object function_for_returning_value_of_feet(Object feet)
    {
        if (feet instanceof Integer)
        {
            int value = (int) feet;
            return value;
        }
        return "Null Value";
    }

    public Object function_for_returning_value_of_inch(Object inch)
    {
        if (inch instanceof Integer)
        {
            int value = (int) inch;
            return value;
        }
        return "Null Value";
    }

    public Object function_for_converting_feet_toInch(Object feet)
    {
        int feet_to_inch = (int) feet * 12;
        return feet_to_inch;
    }

    public Object function_for_converting_inch_toFeet(Object inch)
    {
        int inch_to_feet = (int) inch / 12;
        return inch_to_feet;
    }
}
