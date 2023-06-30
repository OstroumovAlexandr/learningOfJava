//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.logging.Logger;

public class lesson2 {
    public static void main(String[] args) /*throws IOException*/{
        // String name = "name";
        // String anotheString = new String("name");
        // char[] chars= {'n', 'a', 'm', 'e'};
        // String string3 = new String(chars);
        // System.out.println(name.equals(anotheString));
        // System.out.println(string3.equals(anotheString));
        // String hello = "hello ";
        // String world = "world";

        // StringBuilder stringBuilder = new StringBuilder();
        // stringBuilder.append(hello).append(world);
        // System.out.println(stringBuilder.toString());
        // System.out.println(stringBuilder.reverse());

        // Logger logger1 = Logger.getAnonymousLogger();
        // FileWriter fileWriter = new FileWriter("test.txt");
        // String happy = "Hello!";
        // logger1.info(happy);
        // fileWriter.write(happy);
        // //fileWriter.write(String.valueOf(logger1.toString()));
        // fileWriter.close();

        //Задание 1.
        //Создать и заполнить строку n раз повторяющимися элементами с1 и с2.
        //System.out.println(createString(5));

        //Задание 2.
        //Написать метод, который сжимает строку. 
        //Пример: вход - ааааbbbcddd
        //        выход - a4b3cd2
        String str = "waaaabbbcddu";
        System.out.println(zipString(str));

}

// public static String createString(int n){
//     StringBuilder str = new StringBuilder();
//     String c1 = "c1";
//     String c2 = "c2";
//     for (int i = 0; i < n; i++) {
//         str.append(c1);
//         str.append(c2);
//     }
//     return str.toString();
// }

public static String zipString(String str){
    StringBuilder zipStr = new StringBuilder();
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
        if(str.charAt(i - 1) == str.charAt(i)) {
            count ++;
        }else{
            zipStr.append(str.charAt(i - 1));
            if (count != 1)
                zipStr.append(String.valueOf(count));
            
            count = 1;
        }
    }
    zipStr.append(str.charAt(str.length() - 1));
    if(count != 1)
        zipStr.append(String.valueOf(count));
    
    return zipStr.toString();
}

}
