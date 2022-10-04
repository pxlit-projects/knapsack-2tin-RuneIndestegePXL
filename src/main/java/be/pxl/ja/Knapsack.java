package be.pxl.ja;

import be.pxl.ja.robbery.Product;

import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Product> items;
    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight() {
        return maximumCapacity;
    }
    public void add(Product product){
        items.add(product);
    }
    public List<Product> getItems() {
        return items;
    }
}
