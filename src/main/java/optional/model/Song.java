package optional.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Song {

    private String title;
    private int length;

    public Song(String title, int length) {
        this.title = title;
        this.length = length;
    }
}
