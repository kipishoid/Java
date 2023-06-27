package lesson3.task1;

import lesson3.task1.model.Item;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        Item item1 = new Item("Товар1 высший сорт", 1000, 1);
        Item item2 = new Item("Товар2 первый сорт", 800, 3);
        Item item3 = new Item("Товар3 высший сорт", 1000, 2);
        Item item4 = new Item("Товар4 второй сорт", 500, 4);

        List<Item> listItem = new ArrayList<>();
        listItem.add(item1);
        listItem.add(item2);
        listItem.add(item3);
        listItem.add(item4);

        int max = 0;
        for (int i = 0; i < listItem.size(); i++) {
            if (listItem.get(i).getName().contains("высший")) {
                if (listItem.get(i).getPrice() > max) {
                    max = listItem.get(i).getPrice();
                }
            }
        }
        System.out.println(max);
    }
}
