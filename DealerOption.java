package holidaytravelvehicles;

/**
 * Represents an optional dealer add-on for a vehicle.
 */
public class DealerOption {
    private String optionCode;
    private String description;
    private double price;

    public DealerOption(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    // Getters & Setters
    public String getOptionCode() { return optionCode; }
    public void setOptionCode(String optionCode) { this.optionCode = optionCode; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "DealerOption [Code=" + optionCode + ", Description=" + description + ", Price=" + price + "]";
    }
}
