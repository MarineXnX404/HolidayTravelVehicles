package holidaytravelvehicles;

public class TradeInVehicle {
    private String serialNumber;
    private String model;
    private String name;
    private int year;
    private String manufacturer;
    private double price;

    public TradeInVehicle(String serialNumber, String model, String name, int year, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.name = name;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Getters & Setters
    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "TradeInVehicle [Serial=" + serialNumber + ", Name=" + name +
               ", Model=" + model + ", Year=" + year +
               ", Manufacturer=" + manufacturer + ", Price=" + price + "]";
    }
}
