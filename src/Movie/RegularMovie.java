package Movie;

public class RegularMovie implements Movie {

    private String title = "";
    private double thisAmount = 0;

    public RegularMovie(final String title) {
        this.title = title;
    }

    @Override
    public void determineAmount(int daysRented) {
        thisAmount += 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
    }
}
