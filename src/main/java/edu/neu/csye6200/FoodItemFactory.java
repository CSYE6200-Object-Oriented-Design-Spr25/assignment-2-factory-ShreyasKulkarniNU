package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class FoodItemFactory {
    public static List<FoodItem> createFromCSV(String filename) {
        List<FoodItem> items = new ArrayList<>();
        List<String> lines = FileUtil.readFile(filename);
        for (String line : lines) {
            items.add(new FoodItem(line));
        }
        return items;
    }
}