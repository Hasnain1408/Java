package May07;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

//        System.out.println(cars);
//        System.out.println(cars.get(1));
//
//        cars.set(0,"Opel");
//        System.out.println(cars);
//
//        cars.remove(3);
//        System.out.println(cars);
//
//        cars.clear();
//        System.out.println(cars);
//
//        System.out.println(cars.size());

        Collections.sort(cars);

        for(String str : cars)
        {
            System.out.println(str);
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(7);
        myNumbers.add(9);
        myNumbers.add(23);
        myNumbers.add(21);


        Collections.sort(myNumbers);

        for(int i : myNumbers)
        {
            System.out.println(i);
        }


    }



}
