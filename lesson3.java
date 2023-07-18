// import java.util.*;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Random;
// import java.util.Set;
// import javax.swing.plaf.synth.SynthOptionPaneUI;
// import javax.swing.text.html.HTMLDocument.Iterator;

// public class lesson3 {
//     public static void main(String[] args) {

    //Задание 1.
    // Создать программу которая заполнит массив случайными 
    // числами и отсортирует его по возрастанию
        // S3Task1 s3Task1 = new S3Task1();
        // System.out.println(s3Task1.arrayFiller(10));


    // Задание 2.1
    // Заполнить список названиями планет Солнечной системы
    // в произвольном порядке с повторениями.
    // Вывести название каждой планеты и количество его повторений в списке.  
        // ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Марс", "Меркурий", 
        //     "Венера", "Нептун", "Меркурий", "Венера", "Нептун","Земля", "Марс", 
        //     "Меркурий","Меркурий", "Венера", "Нептун","Земля", "Марс"));
        // HashMap<String, Integer> planets = new HashMap<>();
        // for (String planet : planetList) {
        //     planets.put(planet, planets.getOrDefault(planet, 0) + 1);
        // }
        // for (String key : planets.keySet()){
        //     System.out.println(key + ": " + planets.get(key));
        // }

    // Задание 2.2
    // Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        //  Set<String> uniquePlanets = new HashSet<>(planetList);
        //  System.out.println(uniquePlanets);


    // Задание 3.
    // Создать список типа ArraList<Object>. Поместить в него как строки, так и целые числа.
    // Пройти по списку, найти и удалить целые числа.

    //     ArrayList<Object> myList = new ArrayList<>(Arrays.asList("mama", 2, "мыла", 8, "раму", 9, 
    //     "долго", 3, "мыла"));
    //     java.util.Iterator<Object> iterator = myList.iterator();
    //     while (iterator.hasNext()){
    //         Object el = iterator.next();
    //         if (el instanceof Integer){
    //             iterator.remove();
    //         }
    //     }
    //     System.out.println(myList);


    // }
//static class S3Task1{
// public ArrayList<Integer> arrayFiller(int size) {
//     ArrayList<Integer> result = new ArrayList<>();
//     Random random = new Random();
//     for (int i = 0; i < size; i++) {
//         result.add(random.nextInt(1,50));
//     }
//     Collections.sort(result);
//     return result;
// }
//}


//}
