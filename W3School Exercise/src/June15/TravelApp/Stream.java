package June15.TravelApp;

import java.util.*;
import java.util.stream.*;

class GFG {
    public static void main(String[] args) {
        String[] arr = { "Geeks", "for", "Geeks" };


        Stream<String> stream = Arrays.stream(arr);


        stream.forEach(str -> System.out.print(str + " "));

    }
}

