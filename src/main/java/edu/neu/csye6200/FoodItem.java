package edu.neu.csye6200;

public class FoodItem extends Item {
    private String expiryDate;
    private String category;

    public FoodItem(String csvData) {
        super(0, "", 0.0);
        parseCSV(csvData);
    }

    private void parseCSV(String csvData) {
        String[] parts = csvData.split(",");
        this.id = Integer.parseInt(parts[0].trim());
        this.name = parts[1].trim();
        this.price = Double.parseDouble(parts[2].trim());
        this.expiryDate = parts[3].trim();
        this.category = parts[4].trim();
    }

    @Override
    public String toString() {
        return String.format("FoodItem [id=%d, name=%s, price=%.2f, expiry=%s, category=%s]",
                id, name, price, expiryDate, category);
    }
}