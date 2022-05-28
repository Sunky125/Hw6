package urfu.lesson6;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ItemManager {
    private final ArrayList<Item> items = new ArrayList<>();

    public Item addItem(Item item) throws Exception {
        if (item.getPrice() < 0 || item.getInfo().getId() <= 0)
            throw new Exception();

        var randomId = (int)(Math.random() * 1000);
        var newItem = new Item(item.getPrice(), new Info(item.getInfo().getDate(), randomId));
        items.add(newItem);

        return newItem;
    }
}
