// разработать программу которая будет выбрасывать Exception,
// когда пользователь вводит пустую строку.

package lesson2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        scanner.close();
        try {
            double d = Double.parseDouble(num.trim());
        }catch (NumberFormatException ex) {
            System.out.println("Не число или пустая строка!");
        }
    }
}
