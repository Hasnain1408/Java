public class Recursion {
    boolean reverseString( String input)
    {
        if (input.equals ( "" )){
            return "";
        }

        return reverseString ( input.substring ( 1 ) + input.charAt ( 0 ) );
    }
}
