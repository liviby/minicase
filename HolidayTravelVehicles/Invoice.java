import java.util.List;

public class Invoice {
    private String invoiceNumber;
    private Customer customer;
    private Vehicle vehicle;
    private List<DealerInstalledOption> options;
    private double finalPrice;

    public Invoice(String invoiceNumber, Customer customer, Vehicle vehicle, List<DealerInstalledOption> options) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.vehicle = vehicle;
        this.options = options;
        this.finalPrice = calculateFinalPrice();
    }

    private double calculateFinalPrice() {
        double total = vehicle.getBaseCost();
        for (DealerInstalledOption option : options) {
            total += option.getPrice();
        }
        return total;
    }

    public void displayInvoice() {
        System.out.println("Invoice Number: " + invoiceNumber);
        customer.displayInfo();
        vehicle.displayInfo();
        System.out.println("Dealer Installed Options:");
        for (DealerInstalledOption option : options) {
            System.out.println(option.getOptionDetails());
        }
        System.out.println("Final Price: " + finalPrice + "฿");
    }

    public String getInvoiceNumber() { return invoiceNumber; }
    public Customer getCustomer() { return customer; }
    public Vehicle getVehicle() { return vehicle; }
    public List<DealerInstalledOption> getOptions() { return options; }
    public double getFinalPrice() { return finalPrice; }
}
