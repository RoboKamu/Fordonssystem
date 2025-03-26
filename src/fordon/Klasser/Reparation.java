package fordon.Klasser;

/**
 *
 * @author karzan.murad
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reparation {
    // variabler
    private int reparationID;
    private String regPlate;
    private Date date;
    private String description;
    private String customerID;

    // konstruktor
    public Reparation(int reparationID, String regPlate, Date date, String description, String customerID) {
        this.reparationID = reparationID;
        this.regPlate = regPlate;
        this.date = date;
        this.description = description;
        this.customerID = customerID;
    }

    // GETTERS och SETTERS 
    
    public int getReparationID() {
        return reparationID;
    }

    public void setReparationID(int reparationID) {
        this.reparationID = reparationID;
    }

    public String getregPlate() {
        return regPlate;
    }

    public void setregPlate(String regPlate) {
        this.regPlate = regPlate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    // override på toString för att kunna skriva ut reparationens information
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "ReparationsID: " + reparationID + "\n"
                + "RegPlate:" + regPlate + "\n"
                + "Date: " + dateFormat.format(date) + "\n"
                + "Description: " + description + "\n"
                + "customer: " + customerID + "\n"
                + "---------------------------------------\n";
    }
}
