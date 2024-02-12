package June15.MovieandReview;

import java.util.ArrayList;
import java.util.Arrays;

public class NewMain {
    public static void main(String[] args) {

      //  Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);



        NewMovie movie1 = new NewMovie("Titanic", "James Cameron",
                new ArrayList < String > (Arrays.asList("Leonardo DiCaprio", "Kate Winslet")),
                new ArrayList<Review>(Arrays.asList(new Review("Great movie!", "Irvine Rolf", 4.5),review2,review3,review4)));

        System.out.println("\nReviews for '" + movie1.getTitle() + "':");
        for (Review review: movie1.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }
    }
}
