package lesson2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int a, sum = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число определяющее длину последовательности: ");
        n = scanner.nextInt();
        System.out.println("Введите последовательность целых чисел: ");

        for (int i = 1; i <= n; i++) {
            a = scanner.nextInt();
            sum += a;
            if (a > 0) {
                for (int k = 2; k <= Math.sqrt(a); k++) {
                    if (a % k == 0) {
                        sum -= a;
                        break;
                    }
                }
            } else {
                sum -= a;
            }
        }
        System.out.println("Сумма простых чисел равна: " + sum);
        scanner.close();
    }
}
