package task1.service;

/*
 * the class has methods to process
 * the collection in different ways
 */

import java.util.List;

public class ServiceOfArr {

    public static void metod1(List<Integer> list){
        List<Integer> listWithoutDuplicate = list.stream()
                .distinct()
                .toList();
        System.out.println(listWithoutDuplicate);
    }
    public static void metod2(List<Integer> list){
        List<Integer> listWithEven = list.stream()
                .filter(n -> n > 6 && n < 17)
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(listWithEven);
    }
    public static void metod3 (List<Integer> list){
        List<Integer> multiList = list.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(multiList);
    }
    public static void metod4 (List<Integer> list){
        List<Integer> firstFourList = list.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.println(firstFourList);
    }
    public static void metod5(List<Integer> list){
        long elInStream = list.size();
        System.out.println(elInStream);
    }
    public static void metod6(List<Integer> list) {
        long sumStream = list.stream()
                .mapToInt(n -> n)
                .sum();
        long elInStream = list.size();
        long average = sumStream / elInStream;
        System.out.println(average);
    }
}
