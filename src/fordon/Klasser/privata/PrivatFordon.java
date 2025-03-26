package fordon.Klasser.privata;

import java.util.Calendar;
import fordon.Klasser.Kund;
import fordon.Klasser.Fordon;

/**
 *
 * @author karzan.murad
 */
public abstract class PrivatFordon extends Fordon{
    
    private String adress;
    
    public PrivatFordon(String regPlate, Kund owner, int maxPassengers, int wheels, Calendar date, float originalPrice, float currentPrice, float warranty, String adress) {
        super(regPlate, owner, maxPassengers, wheels, date, originalPrice, currentPrice, warranty);
        this.adress = adress;
    }
    
    public void setAdress(String adressInput){
        adress = adressInput;
    }
    
    public String getAdress(String adressInput){
        return adress;
    }
}
