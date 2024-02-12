public class VariableLengthArgument
{
    public static void main(String[] args)
    {
        int perimeter = polygon(1,2,3,4);
        System.out.println(perimeter);
    }

    private static int polygon(int... num)
    {
        int sum = 0;

        for(int x : num)
            sum += x;
     return sum;
    }
}
