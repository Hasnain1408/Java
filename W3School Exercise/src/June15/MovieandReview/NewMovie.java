package June15.MovieandReview;



//Movie.java
import java.util.ArrayList;

public class NewMovie {
    private String title;
    private String director;
    private ArrayList < String > actors;
    private ArrayList < Review > reviews;

    public NewMovie(String title, String director, ArrayList < String > actors,ArrayList< Review > r) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList < Review > (r);
       //this.reviews = r;
    }

    public ArrayList < Review > getReviews() {
        return this.reviews;
    }

    public String getTitle() {
        return this.title;
    }


}
