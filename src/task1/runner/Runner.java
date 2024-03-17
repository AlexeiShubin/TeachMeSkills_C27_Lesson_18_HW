package task1.runner;

import java.util.List;
import task1.randomArray.FabricList;
import task1.service.ServiceOfArr;


public class Runner {
    public static void main(String[] args) {
        List<Integer>arr= FabricList.arr();
        System.out.println();
        ServiceOfArr.metod1(arr);
        ServiceOfArr.metod2(arr);
        ServiceOfArr.metod3(arr);
        ServiceOfArr.metod4(arr);
        ServiceOfArr.metod5(arr);
        ServiceOfArr.metod6(arr);
    }
}
