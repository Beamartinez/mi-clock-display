
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String horaAct;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(23);
        minutos = new NumberDisplay(59);
        horas.setValue(0);
        minutos.setValue(0);
        horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    /*
     * Constructor que representa las horas y minutos a los que fijar la hora actual
     */
    public ClockDisplay(int horas2, int minutos2)
    {
        horas = new NumberDisplay(23);
        minutos = new NumberDisplay(59);
        horas.setValue(horas2);
        minutos.setValue(minutos2);
        horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    /*
     * Método que acepte dos parámetros de tipo int, que represente horas y minutos
     * y que fije dichos valores como el tiempo actual del reloj
     */
    public void setTime(int newHoras, int newMinutos)
    {
        horas.setValue(newHoras);
        minutos.setValue(newMinutos);
        getDisplayValue();
    }
    
    public void getDisplayValue()
    {
        horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    /*
     * Método que devuelva la hora como String de 5 caracteres
     */
    public String getTime()
    {
        return horaAct;
    }
    
    public void getValue()
    {
        System.out.println(horas.getValue() + " " + minutos.getValue());
    }
    
    /*
     * Método que haga avanzar un minuto la hora actual
     */
    public void timeTick()
    {
        minutos.increment();
        if(minutos.getValue() == 0)
        {
            horas.increment();
        }
        getDisplayValue();
    }

}
