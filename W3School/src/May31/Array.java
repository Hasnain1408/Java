package May31;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        final var i = 2;

//        int[][] myNum ={{1,3,5} ,{2,4}};
        int[][] myNum = new int[2][];
        myNum[0] = new int[3];
        myNum[1] = new int[2];
//        myNum[2] = new int[1];

        for(int i =0; i<myNum.length; i++)
        {
            for(int j=0; j<myNum[i].length; ++j)
            {
                int x = sc.nextInt();
                myNum[i][j] = x;
            }
            System.out.println();
        }

//      for(int i =0; i<myNum.length; i++)
//      {
////          for(int j=0; j<myNum[i].length; ++j)
////          {
////              System.out.print(myNum[i][j]+"\t");
////          }
//        for(int x : myNum[i])
//        {
//            System.out.print(x+"\t");
//        }
//          System.out.println();
//      }

      for(int[] x : myNum)
      {
          for(int y : x)
          {
              System.out.print(y+"\t");
          }
          System.out.println();

      }




    }
}
