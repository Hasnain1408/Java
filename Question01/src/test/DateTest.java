package test;

public class DateTest {
    public static void main(String[] args) {
        Date today = new Date(12,24);
        Date tomorrow = new Date(6,5);

        today.displayDate();
        today.displayDate(1);
    }
}
