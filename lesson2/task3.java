package lesson2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];

        System.out.println("Введите массив целых чисел: ");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
            if (Math.abs(mass[i]) < 100 & Math.abs(mass[i]) > 10) {
                sum += i;
            }
            System.out.println("Сумма индексов двузначных элементов массива = " + sum);
        }

        for (int i = 0; i < n; i++) {
            if (mass[i] < 0) {
                mass[i] = sum;
            }
            System.out.print(" " + mass[i]);
        }
        scanner.close();
    }
}
