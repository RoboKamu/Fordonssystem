package fordon.Klasser.privata;

import java.util.Calendar;
import fordon.Klasser.Kund;

/**
 *
 * @author karzan.murad
 */
public class PersonBil extends PrivatFordon{

    private float trunkVolume;
    // personbil kan annorlunda värden på garantitid och antal passagerare
    
    // varierad infromations
    public PersonBil(String regPlate, Kund owner, int wheels, int maxPassengers, Calendar date, float originalPrice, float currentPrice, String adress, float trunkVolume) {
        super(regPlate, owner, maxPassengers, wheels, date, originalPrice, currentPrice, 10, adress);
        this.trunkVolume = trunkVolume;
    }

    // vanlig personBil när ingen passagerare eller antal däck anges (4 passagerare, 4 däck och 10 års garantitid)
    public PersonBil(String regPlate, Kund owner, Calendar date, float originalPrice, float currentPrice, String adress, float trunkVolume) {
        super(regPlate, owner, 4, 4, date, originalPrice, currentPrice, 10, adress);
        this.trunkVolume = trunkVolume;
    }
    @Override
    public String toString(){
        // är en bil så addera trunk Volymen till föräldrar klssens sträng 
        return super.toString() + "Trunk volume: " + trunkVolume + "\n";
    }
}
