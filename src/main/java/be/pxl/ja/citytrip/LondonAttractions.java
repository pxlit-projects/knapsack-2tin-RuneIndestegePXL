package be.pxl.ja.citytrip;

import java.util.ArrayList;
import java.util.List;
import be.pxl.ja.Knapsack;
import be.pxl.ja.KnapsackUtil;

public class LondonAttractions {

    List<Attraction> items = new ArrayList<>();

    public void add(Attraction item) {
        items.add(item);
    }

    public List<Attraction> getItems() {
        return items;
    }
}
