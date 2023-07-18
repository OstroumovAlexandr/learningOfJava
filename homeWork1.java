// Задание:
// № 1. Вычислить сумму чисел от 1 до n и произведение чисел от 1 до n.
import java.io.IOException;
import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) throws IOException {
    System.out.println("Введите N: ");
    try (Scanner reader = new Scanner(System.in)) {
        int value = reader.nextInt();
        int result = showTotalSum(value);
        System.out.println("Сумма чисел от 1 до " + value + " равна " + result);
        int result1 = showTotalAmount(value);
        System.out.println("Произведение чисел от 1 до " + value + " равно " + result1);
        
// № 2. Вывести все простые числа от 1 до 1000.    
        for (int i = 2; i <= 100; i ++){
            Integer count = i;
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    count = null;
                    break;
                }
            }
                if (count != null){
                    System.out.println(count);
                }
            }

// № 3. Реализовать простой калькулятор
        System.out.println("\n Введите целое число: ");
        int num1;
            if(reader.hasNextInt()){
                num1 = reader.nextInt();
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                reader.next();
                num1 = reader.nextInt();}
        System.out.println("\n Введите операцию (+, -, *, /): ");
        char op = reader.next().charAt(0);
        System.out.println("\n Введите целое число: ");
        int num2;
            if(reader.hasNextInt()){
                num2 = reader.nextInt();
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                reader.next();
                num2 = reader.nextInt();}
        int ans;
        switch(op) {
             case '+': ans = num1 + num2;
                break;
             case '-': ans = num1 - num2;
                break;
             case '*': ans = num1 * num2;
                break;
             case '/': ans = num1 / num2;
                break;
             default:  System.out.printf("Неверная операция!");
                return;
        }
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
           
    public static int showTotalSum(int value){
{
    int result = 0;
    
    for (int i = 1; i <= value; i ++){
        result +=i;
    }    
    return result;
    }
}

     public static int showTotalAmount(int value){
{
    int result1 = 1;
    
    for (int i = 1; i <= value; i ++){
        result1 *=i;
    }    
    return result1;
    }
    
}

}
