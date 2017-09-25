package is.ru.honn.library.models;

public class Customer {

    public int id;
    /**
     * The name of the customer
     */
    public String name;

    /**
     * The address of the customer
     */
    public String address;

    /**
     * The email of the customer
     */
    public String email;

    /**
     * The phone number of the customer
     */

    public Customer(){

    }
    public Customer(int id, String name, String address, String email){
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + email;
    }
}
