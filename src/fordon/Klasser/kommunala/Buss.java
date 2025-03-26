package fordon.Klasser.kommunala;

import java.util.Calendar;
import fordon.Klasser.Kund;

/**
 *
 * @author karzan.murad
 */
public class Buss extends KommunalFordon{
    // skapa två konstruktor; en med grundvärdet på garantitid och en ändrad
    
    // orginal garantitid ( 15 år )
    public Buss(String regPlate, Kund owner, int maxPassengers, int wheels, Calendar date, float originalPrice, float currentPrice, String kommun) {
        super(regPlate, owner, maxPassengers, wheels, date, originalPrice, currentPrice, 15, kommun);
    }
    // med varierad garantitid
    public Buss(String regPlate, Kund owner, int maxPassengers, int wheels, Calendar date, float originalPrice, float currentPrice, float warranty, String kommun) {
        super(regPlate, owner, maxPassengers, wheels, date, originalPrice, currentPrice, warranty, kommun);
    }
}
