package task2.runner;

import task2.nameSearch.NameSearch;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Artem");
        names.add("Ivan");
        names.add("Ann");
        names.add("Alex");
        names.add("Ruslan");
        NameSearch.names(names);
        NameSearch.firstElement(names);
    }
}
