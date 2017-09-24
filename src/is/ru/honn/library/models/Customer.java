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
    public String phoneNumber;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + email + ", " + phoneNumber;
    }
}
