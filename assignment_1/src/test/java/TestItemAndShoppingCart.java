import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestItemAndShoppingCart {


    @BeforeEach
    public void Test() {
        ShoppingCart s = new ShoppingCart();
        Item item1 = new Item("lonkero", 3.95);
        Item item2 = new Item("lonkero", 3.95);
        Item item3 = new Item("lonkero", 3.95);
        Item item4 = new Item("lonkero", 3.95);
        Item item5 = new Item("lonkero", 3.95);

    }



    @Test
    public void AddItemsToShoppingCartTest() {

    }
}
