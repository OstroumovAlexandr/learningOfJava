//import java.time.LocalDateTime;
//import java.util.Scanner;
//import java.util.Arrays;

import javax.swing.text.html.FormView;

public class lesson1 {
    //public static void main(String[] args) {
        // System.out.println("Hello world" + LocalDateTime.now()); // выводим в консоль приветствие 
        //                                                             и дату с временем
        // Scanner inputRead = new Scanner(System.in);              // считываем введенные данные с консоли
        // int a = inputRead.nextInt();                             // присваиваем эти данные переменной
        // System.out.println(a + " is the number");                //выводим в консоль переменную и строку
        
        //// Задание № 1:
        //// Ввести имя пользователя и вывести приветствие "Привет + <ИМЯ>"
        // System.out.println("Введите имя: ");
        // Scanner inputName = new Scanner(System.in);
        // int name = inputName.nextInt();
        // System.out.println("Привет " + name);
        

        // Как работает массив:
        // int[] ints = {1,2,3,4,5,6,7,8,9};
        // for (int i = 0; i < ints.length; i ++){
        //     System.out.println(ints[i]);
        // }

        // Задание № 2:
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести 
        // максимальное количество подряд идущих 1.
    //     int[] array = {1,1,0,1,1,1};
    //     int count = 0;
    //     for (int i = 0; i < array.length; i ++){
    //         switch (array[i]) {
    //             case (1):
    //                 count ++;
    //                 break;
    //             case (0):
    //                 count = 0;
    //                 break;
    //         }
    // }
    //     System.out.println(count);

        // Задание № 3:
        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть, числа равные заданному, нужно перенести
        // эти элементы в конец массива.
        // Таким образом, первые несколько (или все) элементов массива
        // должны быть отличны от заданного, а остальные - равны ему.

    //      // Функция для перемещения всех троек, присутствующих в массиве, в конец
    // public static void reorder(int[] A)
    // {
    //     // `k` сохраняет индекс следующей доступной позиции
    //     int k = 0;
 
    //     // делаем для каждого элемента
    //     for (int i: A)
    //     {
    //         // если текущий элемент отличен от тройки, поместить элемент в
    //         // следующаю свободнаю позицию в массиве
    //         if (i != 3) {
    //             A[k++] = i;
    //         }
    //     }
 
    //     // перемещаем все 3 в конец массива (оставшиеся индексы)
    //     for (int i = k; i < A.length; i++) {
    //         A[i] = 3;
    //     }
    // }
 
    // public static void main(String[] args)
    // {
    //     int[] A = { 3,3,3,2,1,1,3,4,7,2,2,3 };
 
    //     reorder(A);
    //     System.out.println(Arrays.toString(A));
    // }



// public static void main(String[] args){
//     String[] strings = {"flower", "flow", "flight", "apple", "flip"};
//     String Prefix = "f1";
//     int len = 0,count = 0;
//     for (int i = 0; i < strings.length; i++){
//         if( strings[i].startsWith(Prefix)){
//             if(strings[i].length() > len){
//                 len = strings[i].length();
//                 count = i;
//             }
//         }

//         }
//         System.out.println(strings[count]);
//     }
// }
//}
