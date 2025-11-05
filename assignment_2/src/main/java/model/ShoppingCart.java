package model;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }


    public ArrayList<Item> getItems() {
        return items;
    }
}
