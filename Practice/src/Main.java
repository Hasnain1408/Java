public class Main
{
    public static void main ( String[] args )
    {
//        int [] arr = {1,2,3,4,5,6,7};
//
//        for(int x : arr)
//        {
//            System.out.println (x );
//            x = x*10;
//        }
//
//        System.out.println (sum(5,7.5));
//        System.out.println (sum(7.5,5));

        Test ob = new Test(15);
       // int a = 15, b = 20;
        System.out.println("a : " +ob.a );
        Test ob2 = new Test(15);
        System.out.println("a  after: " +ob2.a);
        ob2 = ob.incrByTen();
        System.out.println("a  after: " +ob.incrByTen().a);
        System.out.println("a  after: " +ob2.a);




    }

    static double sum(int x, double y)
    {
        return x+y;
    }

    static double sum( double y,int x)
    {
        return x*y;
    }

}

