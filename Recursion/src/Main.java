public class Main {
    public static void main ( String[] args ) {

        System.out.println ( A ( ) );

        Recursion r = new Recursion ();

         System.out.println ( r.reverseString ( "Hello" ) );




    }


    public static String A() {
    return "Hello "+B();
    }
    public  static String B() {
        return "my  "+C();
    }
    public  static String C() {
        return "friend";
    }
}

