package stream;

import stream.model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort1 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();                        //Movie
        movies.add(new Movie("Jumanji", "Johnston Joe", 1995, 6.8));
        movies.add(new Movie("The Shawshank Redemption", "Johnston Joe", 1994, 8.75));
        movies.add(new Movie("The Green Mile", "Darabont Frank", 1999, 8.61));
        movies.add(new Movie("Spider Man", "Raimi Sam", 2002, 6.7));
        movies.add(new Movie("Transformers", "Bay Michael", 2007, 7.3));
        movies.add(new Movie("Alien", "Scott Ridley", 1979, 7.8));
        movies.add(new Movie("Home Alone", "Columbus Chris", 1979, 7.1));

        Collections.sort(movies, Comparator.comparing(Movie::getTitle));

        List<String> list2 = new ArrayList<>();                    //email
        list2.add("ipla@onet.pl");
        list2.add("wp.pl");
        list2.add("chelsea.pl");
        list2.add("onet.pl");
        list2.add("soft@wp.pl");
        list2.add("poniedziałek@wtorek@.pl");
//
//        list2.stream()
//                .sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        list2.stream()
                .filter(s -> s.contains("@")).collect(Collectors.toList()).forEach(System.out::println);


    }
}
