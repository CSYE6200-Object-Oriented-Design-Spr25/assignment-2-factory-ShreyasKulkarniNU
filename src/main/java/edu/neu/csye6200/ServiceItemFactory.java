package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ServiceItemFactory {
    private static final ServiceItemFactory instance = new ServiceItemFactory();

    private ServiceItemFactory() {}

    public static ServiceItemFactory getInstance() {
        return instance;
    }

    public List<ServiceItem> createFromCSV(String filename) {
        List<ServiceItem> items = new ArrayList<>();
        List<String> lines = FileUtil.readFile(filename);
        for (String line : lines) {
            items.add(new ServiceItem(line));
        }
        return items;
    }
}
