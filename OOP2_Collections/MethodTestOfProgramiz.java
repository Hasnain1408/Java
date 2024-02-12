import java.util.ArrayList;
public class MethodTestOfProgramiz {

//    private static class Main {

        public static void main(String[] args) {
            // create an ArrayList
            ArrayList<String> countries = new ArrayList<>();

            // add elements to the ArrayList
            countries.add("Iceland");
            countries.add("America");
            countries.add("Ireland");
            countries.add("Canada");
            countries.add("Greenland");
            System.out.println("Countries: " + countries);

            // remove all even countries
            countries.removeIf(i-> i.contains("land"));;
            System.out.println("Countries without land: " + countries);
        }
//    }
}
