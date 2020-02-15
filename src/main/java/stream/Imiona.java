package stream;

import java.util.ArrayList;
import java.util.List;

public class Imiona {

    private static String transform2(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();                            // imiona STRING
        list.add("stefan");
        list.add("robert");
        list.add("michał");
        list.add("adam");
        list.add("zbigniew");
        list.add("adrian");
        list.add("sylwek");
        list.add("patryk");
        list.add("Patryk");
        list.add("damian");
        list.add("Robert");
        list.add("adam");

        list.stream()
                .map(Imiona::transform2).forEach(System.out::println);


        System.out.println(transform2("dupa"));

    }
}
