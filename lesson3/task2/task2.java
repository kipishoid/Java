package lesson3.task2;

import lesson3.task2.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Item item1 = new Item("Товар1", "Russia", 15, 1000, 1);
        Item item2 = new Item("Товар2", "Russia", 12, 500, 2);
        Item item3 = new Item("Товар3", "Russia", 15, 1000, 1);
        Item item4 = new Item("Товар4", "Russia", 10, 400, 3);

        List<Item> listItem = new ArrayList<>();
        listItem.add(item1);
        listItem.add(item2);
        listItem.add(item3);
        listItem.add(item4);

        Scanner sc = new Scanner(System.in);
        String minPriceName = "";
        int min = Integer.MAX_VALUE;
        int variety = sc.nextInt();
        for (int i = 0; i < listItem.size(); i++) {
            if (listItem.get(i).getVarieties() == variety) {
                if (listItem.get(i).getPrice() < min) {
                    min = listItem.get(i).getPrice();
                    minPriceName = listItem.get(i).getName();
                }
            }
        }
        sc.close();
        System.out.println(minPriceName);
    }

}
