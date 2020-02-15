package stream;

import stream.model.Movie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapy {
    public static void main(String[] args) {

        Map<String, Movie> movieMap = new HashMap<>();
        movieMap.put("Jumanji", new Movie("Jumanji", "Johnston Joe", 1995, 6.8));
        movieMap.put("The Shawshank Redemption", new Movie("The Shawshank Redemption", "Johnston Joe", 1994, 8.75));
        movieMap.put("The Green Mile", new Movie("The Green Mile", "Darabont Frank", 1999, 8.61));
        movieMap.put("Spider Man", new Movie("Spider Man", "Raimi Sam", 2002, 6.7));
        movieMap.put("Transformers", new Movie("Transformers", "Bay Michael", 2007, 7.3));
        movieMap.put("Alien", new Movie("Alien", "Scott Ridley", 1979, 7.8));
        movieMap.put("Home Alone", new Movie("Home Alone", "Columbus Chris", 1979, 7.1));

        Set<Map.Entry<String, Movie>> entries = movieMap.entrySet();

        entries
                .forEach(stringMovieEntry -> System.out.println(stringMovieEntry.getKey() + " - " + stringMovieEntry.getValue()));

    }
}
