package fordon.Klasser.kommunala;

import java.util.Calendar;
import fordon.Klasser.Fordon;
import fordon.Klasser.Kund;

/**
 *
 * @author karzan.murad
 */
public abstract class KommunalFordon extends Fordon{

    // skapa variable kommun då en kommunal fordon tillhör till en kommun inte specifik adress 
    private String kommun;
    
    public KommunalFordon(String regPlate, Kund owner, int maxPassengers, int wheels, Calendar date, float originalPrice, float currentPrice, float warranty, String kommun) {
        super(regPlate, owner, maxPassengers, wheels, date, originalPrice, currentPrice, warranty);
        this.kommun = kommun;
    }
    
    // Setter
    public void setKommun(String kommunInput){
        kommun = kommunInput;
    }
    // Getter
    public String getKommun(){
        return kommun;
    }    
}
