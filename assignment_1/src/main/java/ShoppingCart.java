import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingCart {

    HashMap<Integer, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public HashMap<Integer, Item> getItems() {
        return items;
    }

    public void setItems(HashMap<Integer, Item> items) {
        this.items = items;
    }


    public void removeItem(Item item) {
        if (items.containsKey(item.getName())) {
            items.remove(item);
        } else {
            System.out.println("Item not in the basket");
        }
    }

    public double getItemPrices() {
        double totalAmount = 0;
        return totalAmount;
    }
}
