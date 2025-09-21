package holidaytravelvehicles;

/**
 * Represents a Customer in the Holiday Travel Vehicle system.
 */
public class Customer {
    private int customerID;
    private String phone;
    private String address;
    private String name;

    public Customer(int customerID, String name, String phone, String address) {
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // Getters & Setters
    public int getCustomerID() { return customerID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Customer [ID=" + customerID + ", Name=" + name +
               ", Phone=" + phone + ", Address=" + address + "]";
    }
}
