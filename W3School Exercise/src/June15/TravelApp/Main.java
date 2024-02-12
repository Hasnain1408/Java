package June15.TravelApp;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateConfirmationNumber());

    }

    private static int generateConfirmationNumber() {
        // Generate a random 6-digit confirmation number
        Random rand = new Random();
        return rand.nextInt(1) + 1000000;
    }
}
