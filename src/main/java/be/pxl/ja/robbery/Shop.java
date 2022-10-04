package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;
import be.pxl.ja.Knapsack;
import be.pxl.ja.KnapsackUtil;

public class Shop {
    private List<Product> items;
    //List<Product> items = new ArrayList<>();

    public Shop(){

    }
    public List<Product> getItems() {
        return items;
    }
    public void add(Product product){
        items.add(product);
    }


}
