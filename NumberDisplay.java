
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    //El valor almacenado
    private int display;
    //El limite al que puede llegar el valor
    private int displayLimite;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limite)
    {
        // initialise instance variables
        display = 0;
        displayLimite = limite;
    }
    
    /*
     * Método que fija el valor actual del display al valor pasado
     */
    public void setValue(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < displayLimite)) {
            display = replacementValue;
        }

    }
    
    /*
     * Método que devuelve el valor actual del display en forma de cadena
     * de dos caracteres
     */
    public String getDisplayValue()
    {
        String displayValue;
        if(display<10 & display>=0)
        {
            displayValue = "0" + display;
        }
        else
        {
            displayValue = "" + display;
        }
        return displayValue;
    }
    
    /*
     * Método que devuelve el valor actual del display en forma de entero
     */
    public int getValue()
    {
        int value;
        value = display;
        return value;
    }
    
    /*
     * Método que incrementa 1 al display
     */
    public void increment()
    {
        display = (display + 1) % displayLimite;
    }


}
