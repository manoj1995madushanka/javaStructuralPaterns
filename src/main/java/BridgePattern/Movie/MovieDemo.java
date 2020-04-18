package BridgePattern.Movie;

public class MovieDemo {
    public void movieBridge(){
        Movie movie = new Movie();
        movie.setClassification("action");
        movie.setTitle("Manoj Madushanka");
        movie.setRunTime("2.5");
        movie.setYear("2020");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printMaterial = moviePrinter.print(printFormatter);
        System.out.println(printMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);
    }
}
