package stream.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movie {

    private String title;
    private String director;
    private int year;
    private double rate;

    public Movie(String title, String director, int year, double rate) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rate = rate;
    }
}
