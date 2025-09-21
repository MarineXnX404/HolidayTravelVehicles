package holidaytravelvehicles;

/**
 * Represents a Salesperson in the system.
 */
public class Salesperson {
    private int salesPersonID;
    private String name;
    private String phone;

    public Salesperson(int salesPersonID, String name, String phone) {
        this.salesPersonID = salesPersonID;
        this.name = name;
        this.phone = phone;
    }

    // Getters & Setters
    public int getSalesPersonID() { return salesPersonID; }
    public void setSalesPersonID(int salesPersonID) { this.salesPersonID = salesPersonID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Salesperson [ID=" + salesPersonID + ", Name=" + name + ", Phone=" + phone + "]";
    }
}
