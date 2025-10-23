import java.util.HashMap;

public class ShoppingCart {

    HashMap<Item,Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public HashMap<Item,Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Item,Integer> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        if (items.containsKey(item)) {
            items.compute(item, (k, currentQuantity) -> currentQuantity + 1);
        } else {
            items.put(item, 1);
        }

    }

    public void removeItem(Item item) {
        if (items.containsKey(item)) {
            items.remove(item);
        } else {
            System.out.println("Item not in the basket");
        }
    }

    public double getItemPrices() {
        double totalAmount = 0;
        for (Item i : items.keySet()) {
            int itemQuantity = items.get(i);
            totalAmount += i.getPrice() * itemQuantity;
        }
        return totalAmount;
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }
}
