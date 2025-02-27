import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a new Vehicle object
        Vehicle myVehicle = new Vehicle("MN1234B", "Toyota Corolla", "XLE", 2023, "Toyota", 25000);

        // Create a new Customer object
        Customer myCustomer = new Customer("C001", "Vichai Yut", "Phuket", "0812345678");

        // Create Dealer Installed Options
        DealerInstalledOption option1 = new DealerInstalledOption("D001", "Sunroof", 45000);
        DealerInstalledOption option2 = new DealerInstalledOption("D002", "Leather Seats", 23000);

        // Create an Invoice
        Invoice myInvoice = new Invoice("INV0001", myCustomer, myVehicle, Arrays.asList(option1, option2));

        // Display the invoice details
        myInvoice.displayInvoice();
    }
}
