package test;

public class Date {
    int month;
    int day;
    int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(int month, int day) {
        this.month = month;
        this.day = day;
        year = 2023;
    }

    void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }

    void displayDate(int b){
        System.out.println(month+"."+day+"."+year);
    }
}
