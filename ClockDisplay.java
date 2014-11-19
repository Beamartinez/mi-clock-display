/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ClockDisplay
{
    //objeto NumberDisplay que guarda las horas
    private NumberDisplay horas;
	//objeto NumberDisplay que guarda los minutos
    private NumberDisplay minutos;
	//String de 5 caracteres: la hora, dos puntos y los minutos
    private String horaAct;

    /*
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(13);
        minutos = new NumberDisplay(60);
        updateDisplay();
    }
    
    /*
     * Constructor que representa las horas y minutos a los que fijar la hora actual
     */
    public ClockDisplay(int horas2, int minutos2)
    {
        horas = new NumberDisplay(13);
        minutos = new NumberDisplay(60);
		horas.setValue(horas2);
		minutos.setValue(minutos2);
        updateDisplay();
    }
    
    /*
     * Método que acepte dos parámetros de tipo int, que represente horas y minutos
     * y que fije dichos valores como el tiempo actual del reloj
     */
    public void setTime(int newHoras, int newMinutos)
    {
        horas.setValue(newHoras);
        minutos.setValue(newMinutos);
        updateDisplay();
    }
    
    /*
     * Método que devuelva la hora como String de 5 caracteres
     */
    public String getTime()
    {
        return horaAct;
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
		updateDisplay();
    }
	
	/*
	 * Localiza el atributo horaAct
	 * El private es un método
	 */
	private void updateDisplay()
	{
		horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
	}
}
