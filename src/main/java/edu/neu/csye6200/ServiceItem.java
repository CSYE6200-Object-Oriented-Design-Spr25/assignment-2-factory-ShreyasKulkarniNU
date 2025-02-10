package edu.neu.csye6200;

public class ServiceItem extends Item {
    private String duration;
    private String provider;

    public ServiceItem(String csvData) {
        super(0, "", 0.0);
        parseCSV(csvData);
    }

    private void parseCSV(String csvData) {
        String[] parts = csvData.split(",");
        this.id = Integer.parseInt(parts[0].trim());
        this.name = parts[1].trim();
        this.price = Double.parseDouble(parts[2].trim());
        this.duration = parts[3].trim();
        this.provider = parts[4].trim();
    }

    @Override
    public String toString() {
        return String.format("ServiceItem [id=%d, name=%s, price=%.2f, duration=%s, provider=%s]",
                id, name, price, duration, provider);
    }
}
