// import java.io.IOException;
// import java.io.FileWriter;
// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.logging.Logger;
// public class homeWork2 {
// public static void main(String[] args) throws IOException {
// try (Scanner reader = new Scanner(System.in)) {
//     Logger logger1 = Logger.getAnonymousLogger();
//     FileWriter fileWriter1 = new FileWriter("task1.log");
//     String log1 = "-я итерация. ";
//     int counter = 1;
//     int [] mas = {11, 3, 14, 16, 7};
//     boolean isSorted = false;
//     int buf;
       
//     while(!isSorted) {
//         isSorted = true;
//         logger1.info(counter + log1);
//         fileWriter1.write(counter + log1 );
//         counter++;    
//         for (int i = 0; i < mas.length-1; i++) {
//             if(mas[i] > mas[i+1]){
//                 isSorted = false;
//                 buf = mas[i];
//                 mas[i] = mas[i+1];
//                 mas[i+1] = buf;
//             }
//         }
//     }
//     System.out.println(Arrays.toString(mas));

//     fileWriter1.close();        

       

// // Задание 2. К калькулятору из предыдущего дз добавить логирование.

//     Logger logger2 = Logger.getAnonymousLogger();
//     FileWriter fileWriter2 = new FileWriter("task2.log");
//     String log2 = " действия ";


//     System.out.println("\n Введите целое число: ");
//     int num1;
//     if(reader.hasNextInt()){
//         num1 = reader.nextInt();
//         logger2.info("Ввод числа " + num1);
//         fileWriter2.write("Ввод числа " + num1);
//     } else {
//         System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//         logger2.info(" Ошибка ввода числа. ");
//         fileWriter2.write(" Ошибка ввода числа. ");
//         reader.next();
//         num1 = reader.nextInt();
//         logger2.info("Ввод числа " + num1);
//         fileWriter2.write("Ввод числа " + num1);}
//     System.out.println("\n Введите операцию (+, -, *, /): ");
//     char op = reader.next().charAt(0);
//     logger2.info(" выбор " + log2);
//     fileWriter2.write(" выбор " + log2);
//     System.out.println("\n Введите целое число: ");
//     int num2;
//         if(reader.hasNextInt()){
//             num2 = reader.nextInt();
//             logger2.info("Ввод числа " + num2);
//             fileWriter2.write("Ввод числа " + num2);
//         } else {
//             System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//             logger2.info("Ошибка ввода числа. ");
//             fileWriter2.write("Ошибка ввода числа. ");
//             reader.next();
//             num2 = reader.nextInt();
//             logger2.info("Ввод числа " + num2);
//             fileWriter2.write("Ввод числа " + num2);}
//     int ans;
//     switch(op) {
//         case '+': ans = num1 + num2;
//         logger2.info(" Результат сложения " + num1 + " и " + num2 + " равен " + ans);
//         fileWriter2.write(" Результат сложения " + num1 + " и " + num2 + " равен " + ans);
//             break;
//          case '-': ans = num1 - num2;
//         logger2.info(" Результат вычитания " + num1 + " и " + num2 + " равен " + ans);
//         fileWriter2.write(" Результат вычитания " + num1 + " и " + num2 + " равен " + ans);
//             break;
//          case '*': ans = num1 * num2;
//         logger2.info(" Результат умножения " + num1 + " и " + num2 + " равен " + ans);
//         fileWriter2.write(" Результат умножения " + num1 + " и " + num2 + " равен " + ans);
//             break;
//          case '/': ans = num1 / num2;
//         logger2.info(" Результат деления " + num1 + " и " + num2 + "равен " + ans);
//         fileWriter2.write(" Результат деления " + num1 + " и " + num2 + "равен " + ans);
//             break;
//          default:  System.out.printf("Неверная операция!");
//         logger2.info("Такого " + log2 + " быть не может");
//         fileWriter2.write("Такого " + log2 + " быть не может");
//             return;
//     }
//     System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
// fileWriter2.close();
// }

// // Задание 1.
// // Реализуйте алгоритм сортировки пузырьком числового массива,
// // результат после каждой итерации запищите в лог-файл.
  

// }

// }
