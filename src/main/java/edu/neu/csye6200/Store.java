package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store extends AbstractStore {
    @Override
    public void loadInventory() {
        inventory = new ArrayList<>();

        // Load food items
        List<FoodItem> foodItems = FoodItemFactory.createFromCSV("FoodItemCSV.txt");
        inventory.addAll(foodItems);

        // Load electronic items
        List<ElectronicItem> electronicItems = ElectronicItemFactory.getInstance().createFromCSV("ElectronicItemCSV.txt");
        inventory.addAll(electronicItems);

        // Load service items
        List<ServiceItem> serviceItems = ServiceItemFactory.getInstance().createFromCSV("ServiceItemCSV.txt");
        inventory.addAll(serviceItems);
    }

    @Override
    public void sortById() {
        inventory.sort(Comparator.comparingInt(Item::getId));
    }

    @Override
    public void sortByName() {
        inventory.sort(Comparator.comparing(Item::getName));
    }

    @Override
    public void sortByPrice() {
        inventory.sort(Comparator.comparingDouble(Item::getPrice));
    }

    @Override
    public void demo() {
        System.out.println("Loading inventory...");
        loadInventory();

        System.out.println("\nInventory sorted by ID:");
        sortById();
        inventory.forEach(System.out::println);

        System.out.println("\nInventory sorted by Name:");
        sortByName();
        inventory.forEach(System.out::println);

        System.out.println("\nInventory sorted by Price:");
        sortByPrice();
        inventory.forEach(System.out::println);
    }
}