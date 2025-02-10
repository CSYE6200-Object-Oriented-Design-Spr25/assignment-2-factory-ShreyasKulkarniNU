package edu.neu.csye6200;

public abstract class Item implements Comparable<Item> {
    protected int id;
    protected String name;
    protected double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public abstract String toString();
}
