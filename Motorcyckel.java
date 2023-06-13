package slutuppgift.Klasser.privata;

import java.util.Calendar;
import slutuppgift.Klasser.Kund;

/**
 *
 * @author karzan.murad
 */
public class Motorcyckel extends PrivatFordon{
    
    // varierad
    public Motorcyckel(String regPlate, Kund owner, int maxPassengers, int wheels, Calendar date, float originalPrice, float currentPrice, float warranty, String adress) {
        super(regPlate, owner, maxPassengers, wheels, date, originalPrice, currentPrice, warranty, adress);
    }
    
    // vanlig motorcyckel
    public Motorcyckel(String regPlate, Kund owner, int maxPassengers, int wheels, Calendar date, float originalPrice, float currentPrice, String adress) {
        super(regPlate, owner, maxPassengers, wheels, date, originalPrice, currentPrice, 2, adress);
    }
}
