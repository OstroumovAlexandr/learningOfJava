import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class lesson2 {
    public static void main(String[] args) throws IOException{
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
        Logger logger1 = Logger.getAnonymousLogger();
        FileWriter fileWriter = new FileWriter("test.txt");
        String happy = "Hello!";
        logger1.info(happy);
        fileWriter.write(happy);
        //fileWriter.write(String.valueOf(logger1.toString()));
        fileWriter.close();


}
}