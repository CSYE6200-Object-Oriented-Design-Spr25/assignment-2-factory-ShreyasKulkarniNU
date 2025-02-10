package edu.neu.csye6200;

import java.util.List;

public abstract class AbstractStore {
    protected List<Item> inventory;

    public abstract void loadInventory();
    public abstract void sortById();
    public abstract void sortByName();
    public abstract void sortByPrice();
    public abstract void demo();
}
