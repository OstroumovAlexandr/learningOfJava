import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class homeWork3 {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
        result.add(random.nextInt(1,50));
    }
        System.out.println(result);
        System.out.println(Collections.max(result));
        System.out.println(Collections.min(result));
        
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()){
            Integer el = iterator.next();
            if (el % 2 == 0){
                iterator.remove();
                }
        }
        System.out.println(result);
    }
}

