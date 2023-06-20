package lesson2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int a, b, n;
        boolean greenFlag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число определяющее длину последовательности: ");
        n = scanner.nextInt();
        System.out.println("Введите последовательность целых чисел: ");

        a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (a > b) {
                greenFlag = false;
            }
            a = b;
        }
        scanner.close();

        if (greenFlag == true) {
            System.out.println("Последовательность является возрастающей");
        } else {
            System.out.println("Последовательность не является возрастающей");
        }
    }
}