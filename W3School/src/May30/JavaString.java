package May30;

public class JavaString {
    public static void main(String[] args){
        String txt = "Hello World ! ";

//        System.out.println(txt.toUpperCase());
//        System.out.println(txt.toLowerCase());
//        System.out.println(txt.indexOf('W'));
//        System.out.println(txt.indexOf("World"));
//        System.out.println(txt.indexOf("llo"));


        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName+lastName);
        System.out.println(firstName+" "+lastName);

        String x = "10", y = "20";
        int a = 50;
        System.out.println(x+y);
        System.out.println(y+a);

    }

}
