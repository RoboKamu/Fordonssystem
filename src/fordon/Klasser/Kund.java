
package fordon.Klasser;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karzan.murad
 */
public class Kund {
    private int ID;
    private String firstName;
    private String lastName;
    private String adress;
    private String postNum;
    private String teleNum;
    private String email;
    private String password;
    private List<Fordon> vehicles;
    
    // Konstuktor
    public Kund(int ID, String firstName, String lastName, String adress, String postNum, String teleNum, String email, String password){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.postNum = postNum;
        this.teleNum = teleNum;
        this.email = email;
        this.password = password;
    }

    public Kund() {
        vehicles = new ArrayList<>();
    }
    
    // SETTERS
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addVehicle(Fordon vehicle) {
        vehicles.add(vehicle);
    }
    
    // GETTERS 
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public String getPostNum() {
        return postNum;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public List<Fordon> getVehicles() {
        return vehicles;
    }
    
    public Kund getCustomerByEmail(String email, ArrayList<Kund> customers) {
        // iterera igenom listan för kustomer med forEach, om en element.getEmail är
        // lika med denna användares email; hämta användare
        for (Kund customer : customers) {
            if (customer.getEmail().equals(email)) {
                return customer;
            }
        }
        // hittade inte kunden
        return null; 
    }
    
    // skriver ut all relevant information från kunden
    @Override
    public String toString(){
        return "ID: " + getID() + "\n"
                + "name: " + getFirstName() + " " + getLastName() + "\n"
                + "password: " + getPassword() + "\n"
                + "email: " + getEmail() + "\n"
                + "adress: " + getAdress() + "\n"
                + "postal code: " + getPostNum() + "\n"
                + "telephone number: " + getTeleNum() + "\n";
    }
    
    // När det inte är kunden som loggar in, vis inte lösenord
    public String toStringDisplay() {
        return "ID: " + getID() + "\n"
                + "name: " + getFirstName() + " " + getLastName() + "\n"
                + "email: " + getEmail() + "\n"
                + "adress: " + getAdress() + "\n"
                + "postal code: " + getPostNum() + "\n"
                + "telephone number: " + getTeleNum() + "\n"
                + "------------------------\n";
    }
}

