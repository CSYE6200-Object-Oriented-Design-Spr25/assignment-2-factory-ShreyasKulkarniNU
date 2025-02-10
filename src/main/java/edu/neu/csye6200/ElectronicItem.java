package edu.neu.csye6200;

public class ElectronicItem extends Item {
    private String warranty;
    private String manufacturer;

    public ElectronicItem(String csvData) {
        super(0, "", 0.0);
        parseCSV(csvData);
    }

    private void parseCSV(String csvData) {
        String[] parts = csvData.split(",");
        this.id = Integer.parseInt(parts[0].trim());
        this.name = parts[1].trim();
        this.price = Double.parseDouble(parts[2].trim());
        this.warranty = parts[3].trim();
        this.manufacturer = parts[4].trim();
    }

    @Override
    public String toString() {
        return String.format("ElectronicItem [id=%d, name=%s, price=%.2f, warranty=%s, manufacturer=%s]",
                id, name, price, warranty, manufacturer);
    }
}