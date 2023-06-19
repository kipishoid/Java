
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int a, b = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность целых чисел, оканчивающаяся нулем: ");

        a = scanner.nextInt();
        while (b != 0) {
            b = scanner.nextInt();
            if (a > 0 & b < 0) {
                sum += a;
            }
            a = b;
        }
        System.out.println("Сумма положительных чисел равна: " + sum);
        scanner.close();
    }
}