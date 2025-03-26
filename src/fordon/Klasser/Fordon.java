package fordon.Klasser;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Fordon {

    // init variabler
    private String regPlate;
    private Kund owner;
    private int maxPassengers;
    private int wheels;
    private Calendar date;
    private float originalPrice;
    private float currentPrice;
    private float warranty;
   
    // skapa en arrayList för reparationehistoriken på fordonet
    private ArrayList<Reparation> history;
    // date format för att ta reda på när fordonet köptes
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Fordon(String regPlate, Kund owner, int maxPassengers, int wheels, Calendar date, float originalPrice, float currentPrice, float warranty) {
        this.owner = owner;
        this.regPlate = regPlate;
        this.maxPassengers = maxPassengers;
        this.wheels= wheels;
        this.date = date;
        this.originalPrice = originalPrice;
        this.currentPrice = currentPrice;
        this.warranty = warranty;
        this.history = new ArrayList<>();
    }
    
    // Setters och Getters 
    public String getregPlate() {
        return regPlate;
    }

    public void setregPlate(String regPlate) {
        this.regPlate = regPlate;
    }

    public Kund getOwner() {
        return owner;
    }

    public void setOwner(Kund owner) {
        this.owner = owner;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getDate() {
        String dateFormatted = dateFormat.format(date.getTime());
        return dateFormatted;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    // automatisk sätter sig själv, så bara get behövs 
    public float getCurrentPrice() {
        // Hämta det nuvarande året
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        // Beräkna antalet år sedan fordonets köp
        int yearsSincePurchase = currentYear - date.get(Calendar.YEAR);

        // Beräkna det aktuella priset baserat på värdeminskning och reparationer
        currentPrice = originalPrice;

        // Tillämpa värdeminskning för varje år
        for (int i = 0; i < yearsSincePurchase; i++) {
            // Minska priset med 10%
           currentPrice *= 0.9f;

            // Om garantitiden fortfarande gäller, hoppa över ökningen efter reparation
            if (warranty > 0) {
                // Minska garantitiden med 1 år
                warranty--;
            } else {
                // Om garantitiden har löpt ut, öka priset med 20% för reparationer (upp till 100%)
               currentPrice *= 1.2f;
                if (currentPrice > originalPrice) {
                   currentPrice = originalPrice; // Begränsa prishöjningen till det ursprungliga priset
                }
            }
        }

        // Om garantitiden har löpt ut, sätt priset till 20% av inköpspriset
        if (warranty <= 0) {
           currentPrice = 0.2f * originalPrice;
        }

        return currentPrice;
    }

    public float getWarranty() {
        return warranty;
    }

    public void setWarranty(float warranty) {
        this.warranty = warranty;
    }

    public ArrayList<Reparation> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Reparation> history) {
        this.history = history;
    }
    
    public void addReparation(Reparation reparation) {
        history.add(reparation);
    }
    
    @Override
    public String toString(){
        return  "\nID: " + regPlate + "\n"
                + "Owner: " + owner.getEmail() + "\n"
                + "Max Passengers: " + maxPassengers + "\n"
                + "Number of Wheels: " + wheels + "\n"
                + "Purchase Date: " + date.getTime() + "\n"
                + "Remaining Warranty (years): " + warranty + "\n"
                + "Original Price: " + originalPrice + "\n"
                + "Current Price: " + getCurrentPrice() + "\n";
    }
    
}
