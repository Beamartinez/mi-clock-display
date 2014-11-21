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
    private NumberDisplay años;
    private NumberDisplay meses;
    private NumberDisplay dias;
    //String de 5 caracteres: la hora, dos puntos y los minutos
    private String horaAct;
    private String fechaAct;

    /*
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        años = new NumberDisplay(99);
        meses = new NumberDisplay(13);
        dias = new NumberDisplay(31);
        updateDisplay();
        fecha();
    }
    
    /*
     * Constructor que representa las horas y minutos a los que fijar la hora actual
     */
    public ClockDisplay(int hora, int minuto, int año, int mes, int dia)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        años = new NumberDisplay(99);
        meses = new NumberDisplay(13);
        dias = new NumberDisplay(31);
        horas.setValue(hora);
        minutos.setValue(minuto);
        años.setValue(año);
        meses.setValue(mes);
        dias.setValue(dia);
        updateDisplay();
        fecha();
    }
    
    /*
     * Método que acepte dos parámetros de tipo int, que represente horas y minutos
     * y que fije dichos valores como el tiempo actual del reloj
     */
    public void setTime(int newHoras, int newMinutos, int newAños, int newMeses, int newDias)
    {
        horas.setValue(newHoras);
        minutos.setValue(newMinutos);
        años.setValue(newAños);
        meses.setValue(newMeses);
        dias.setValue(newDias);
        updateDisplay();
        fecha();
    }
    
    /*
     * Método que devuelva la hora como String de 5 caracteres
     */
    public String getTime()
    {
        return horaAct + " " + fechaAct;
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
            
            if(horas.getValue() == 0)
            {
                dias.increment();
                
                if(dias.getValue() == 0)
                {
                    dias.increment();
                    meses.increment();
                    
                    if(meses.getValue() == 0)
                    {
                        meses.increment();
                        años.increment();
                    }
                }
            }
        }
        updateDisplay();
        fecha();
    }
    
    /*
     * Localiza el atributo horaAct
     * El private es un método
     */
    private void updateDisplay()
    {
        if (horas.getValue() > 12)
        {
            int otrasHoras;
            otrasHoras = horas.getValue() - 12;
            horaAct = otrasHoras + ":" + minutos.getDisplayValue() + " p.m.";
        }
        else if(horas.getValue() == 0)
        {
            int otrasHoras;
            otrasHoras = 12;
            horaAct = otrasHoras + ":" + minutos.getDisplayValue() + " a.m.";
        }
        else if(horas.getValue() == 12)
        {
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " p.m.";
        }
        else
        {
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " a.m.";
        }
    }
    
    public void fecha()
    {
        fechaAct = dias.getDisplayValue() + "/" + meses.getDisplayValue() + "/" + años.getDisplayValue();
    }
}
