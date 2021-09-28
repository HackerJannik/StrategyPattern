package Movie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final List<Movie> movies = new ArrayList<>();

        Movie movie = new RegularMovie("REGULAR");
        movie.determineAmount(3);
        movies.add(movie);
        //movie = new ChildrensMovie("Childrens");
        //movie.determineAmount(4);
        //movies.add(movie);
        //movie = new NewReleaseMovie("New_Release");
        //movie.determineAmount(4);
        //movies.add(movie);

        movies.forEach(System.out::println);

    }
}
