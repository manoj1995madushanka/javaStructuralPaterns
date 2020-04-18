package BridgePattern.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie){
        this.movie = movie;
    }

    protected String getHeader() {
        return movie.getClassification();
    }

    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("Titile",movie.getTitle()));
        details.add(new Detail("Year",movie.getYear()));
        details.add(new Detail("Runtime",movie.getRunTime()));

        return details;
    }
}
