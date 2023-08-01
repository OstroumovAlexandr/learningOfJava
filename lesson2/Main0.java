package lesson2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main0 {
    public static void main(String[] args)
{
        //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.

        try {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        double number = scanner.nextDouble();
        System.out.println("Вы ввели число: " + number);
        scanner.close();
    
        } catch (InputMismatchException ex){
            System.out.println("Вы ввели не дробное число.");
            return;
        }

    }
}