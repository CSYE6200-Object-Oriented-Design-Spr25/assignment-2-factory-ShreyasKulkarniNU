package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ElectronicItemFactory {
    private static ElectronicItemFactory instance;

    private ElectronicItemFactory() {}

    public static ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }

    public List<ElectronicItem> createFromCSV(String filename) {
        List<ElectronicItem> items = new ArrayList<>();
        List<String> lines = FileUtil.readFile(filename);
        for (String line : lines) {
            items.add(new ElectronicItem(line));
        }
        return items;
    }
}