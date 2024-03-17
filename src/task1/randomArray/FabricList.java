package task1.randomArray;

/*
 * the method fills the array with random numbers
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class FabricList {

    public static List<Integer> arr(){
        List<Integer>arr=new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int element = random.nextInt(0, 10);
            arr.add(element);
            System.out.print(element+", ");
        }
        return arr;
    }
}
