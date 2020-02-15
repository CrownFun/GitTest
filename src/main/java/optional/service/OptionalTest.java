package optional.service;

import optional.exception.SongNotFoundException;
import optional.model.Song;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest {

    private static Song getSong1(Song song) {
        return Optional.ofNullable(song)
                .orElseThrow(SongNotFoundException::new);
    }

    private static Song getSong2(Song song) {
        return Optional.ofNullable(song)
                .map(song1 -> new Song(song1.getTitle().toUpperCase(), song1.getLength()))
                .orElseThrow(SongNotFoundException::new);
    }

    private static String getSongTitle(Song song) {
        return Optional.ofNullable(song)
                .map(song1 -> song1.getTitle().toUpperCase())
                .orElse("Pusty tyuł!");
    }

    private static int getSongLength(Song song) {
        return Optional.ofNullable(song)
                .map(Song::getLength)
                .orElse(0);
    }


    private static boolean getYes(Song song) {
        return Optional.ofNullable(song)
                .map(song1 -> song1.getLength() > 130)
                .orElse(true);
    }

    private static int getTotalLength(List<Song> songs) {

        return songs.stream()
                .mapToInt(value -> Optional.ofNullable(value).map(Song::getLength).orElse(0))
                .sum();

    }

    private static List<Song> getTransformedTitles(List<Song> songs) {
        return songs.stream()
                .map(song -> Optional.ofNullable(song).map(song1 -> new Song(song1.getTitle().toUpperCase(), song1.getLength()))
                        .orElse(new Song()))
                .collect(Collectors.toList());
    }

    private static List<Song> getFilteredSongs(List<Song> songs) {
        return songs.stream()
                .map(song -> Optional.ofNullable(song).orElse(new Song()))
                .filter(song -> song.getLength() > 150)
                .collect(Collectors.toList());
    }

    private static void change(Song song) {
        Optional.ofNullable(song)
                .ifPresentOrElse(song1 -> System.out.println(song1.getTitle()), () -> {
                    throw new SongNotFoundException();
                });

    }

    private static String extremeOptional(Song song) {
        Optional<Song> song1 = Optional.ofNullable(song);
        song1.ifPresent(song2 -> song2.setTitle("Dupa"));

        return song1.map(Song::getTitle)
                .orElse("Pusty");
    }


    public static void main(String[] args) {

        Song song = new Song("aaa bbbc cc", 120);
        Song song2 = null;
        Song song3 = new Song(null, 34);

        List<Song> songs = Arrays.asList(
                new Song("aaa", 178),
                new Song("ddd", 276),
                new Song("attt", 111),
                new Song("vvv", 156),
                null);

        try {
//            System.out.println(getSong2(song).getTitle());
//            System.out.println(getSongTitle(song2));
//            System.out.println(getSongLength(song2));
//            System.out.println(getYes(song));
//            System.out.println(getTotalLength(songs));
//            getTransformedTitles(songs).forEach(System.out::println);
//            getFilteredSongs(songs).forEach(System.out::println);
//            change(song2);
//            System.out.println(extremeOptional(song));
        } catch (SongNotFoundException e) {
            System.err.println(e.getMessage());
        }


    }
}
