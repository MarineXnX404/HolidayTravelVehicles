package holidaytravelvehicles;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", "0812345678", "Bangkok, Thailand");
        Salesperson sp = new Salesperson(101, "Jane Smith", "0898765432");

        NewVehicle nv = new NewVehicle("SN001", "Corolla Cross", "SUV", 2025, "Toyota", 950000);
        TradeInVehicle tiv = new TradeInVehicle("SN100", "Civic", "Honda Civic", 2018, "Honda", 450000);

        DealerOption opt1 = new DealerOption("D01", "Leather Seats", 30000);
        DealerOption opt2 = new DealerOption("D02", "Premium Audio", 25000);

        Invoice invoice = new Invoice(5001, customer, sp, nv);
        invoice.setTradeInVehicle(tiv);
        invoice.addOption(opt1);
        invoice.addOption(opt2);
        invoice.calculateTotal();

        System.out.println(invoice);
    }
}
