public class DealerInstalledOption {
    private String optionCode;
    private String description;
    private double price;

    public DealerInstalledOption(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public String getOptionDetails() {
        return description + " (Code: " + optionCode + "), Price: " + price + "฿";
    }

    // Getter methods
    public String getOptionCode() { return optionCode; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
}
