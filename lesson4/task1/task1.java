package lesson4.task1;

import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>(List.of(1, 2, 3, 4));
        for (int i = numList.size() - 1; i >= 0; i--) {
            System.out.println(numList.get(i));
        }
    }
}