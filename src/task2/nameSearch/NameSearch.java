package task2.nameSearch;
/*
 the class has a method for displaying
 an array of valid names and displays the first element of the collection
 */
import java.util.List;
import java.util.stream.Collectors;

public class NameSearch {

    public static void names(List<String> list) {
        list = list.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Верные имена: " + list);
    }

    public static void firstElement(List<String> list) {
        //noinspection OptionalGetWithoutIsPresent
        System.out.println("Первый элемент коллекции " + list.stream().sorted().findFirst().get());
    }
}
