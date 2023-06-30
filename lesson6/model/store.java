package lesson6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class store {
    private laptop[] listLaptop;

    public store(int count) {
        Random rand = new Random();
        listLaptop = new laptop[count];
        for (int i = 0; i < listLaptop.length; i++) {
            listLaptop[i] = new laptop(rand.nextInt(8000), rand.nextInt(1024), "Windows", "Red");
        }
    }

    public void findLaptop() {
        System.out.println("1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет");
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.print("Введите минимальный объём ОЗУ: ");
                int ram = sc.nextInt();
                for (var item : getListLaptop()) {
                    if (item.get_ram() >= ram) {
                        System.out.println(item);
                    }
                }
                break;
            case 2:
                System.out.print("Введите минимальный объём жёсткого диска: ");
                int hd = sc.nextInt();
                for (var item : getListLaptop()) {
                    if (item.get_hd() >= hd) {
                        System.out.println(item);
                    }
                }
                break;
            case 3:
                System.out.print("Введите требуемую ос: ");
                String os = sc.nextLine();
                for (var item : getListLaptop()) {
                    if (item.get_os().equals(os)) {
                        System.out.println(item);
                    }
                }
                break;
            case 4:
                System.out.print("Введите цвет: ");
                String color = sc.nextLine();
                for (var item : getListLaptop()) {
                    if (item.get_color().equals(color)) {
                        System.out.println(item);
                    }
                }
                break;
            default:
                System.out.println("Not found!");
                break;
        }
    }
}
