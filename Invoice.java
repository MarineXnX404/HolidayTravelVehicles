package holidaytravelvehicles;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an Invoice for a customer purchase.
 */
public class Invoice {
    private double negotiatedPrice;
    private double tax;
    private double licenseFees;
    private double total;
    private int invoiceID;

    private Customer customer;
    private Salesperson salesperson;
    private NewVehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private List<DealerOption> options;

    public Invoice(int invoiceID, Customer customer, Salesperson salesperson, NewVehicle vehicle) {
        this.invoiceID = invoiceID;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.options = new ArrayList<>();
    }

    public void addOption(DealerOption option) {
        options.add(option);
    }

    public void setTradeInVehicle(TradeInVehicle tiv) {
        this.tradeInVehicle = tiv;
    }

    public void calculateTotal() {
        double optionTotal = 0;
        for (DealerOption opt : options) {
            optionTotal += opt.getPrice();
        }
        this.negotiatedPrice = vehicle.getBaseCost() + optionTotal;
        this.licenseFees = negotiatedPrice * 0.05;
        this.tax = negotiatedPrice * 0.07;
        this.total = negotiatedPrice + licenseFees + tax;
    }

    @Override
    public String toString() {
        return "Invoice [ID=" + invoiceID + ", Customer=" + customer +
               ", Salesperson=" + salesperson + ", Vehicle=" + vehicle +
               ", TradeInVehicle=" + tradeInVehicle +
               ", Options=" + options + ", NegotiatedPrice=" + negotiatedPrice +
               ", LicenseFees=" + licenseFees + ", Tax=" + tax +
               ", Total=" + total + "]\n";
    }
}
