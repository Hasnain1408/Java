package June12;

import java.time.LocalDate;
import java.time.LocalTime;

public class Localtime {
    public static void main ( String[] args ) {
        LocalDate Today = LocalDate.now (  );
        LocalDate day1 = LocalDate.ofYearDay ( 2023,45 );


        LocalTime Now = LocalTime.now();
        LocalTime Time = LocalTime.ofSecondOfDay ( 20000 );
        System.out.println (Today);
        System.out.println (Now);
        System.out.println (day1);
    }
}
