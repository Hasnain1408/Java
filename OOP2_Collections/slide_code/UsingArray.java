package slide_code;

import java.util.Arrays;

public class UsingArray
{
    public static void main(String[] args)
    {
        int[] arr_01={13,27,33,4,51,6,71,8,9,1};
        int[] arr_02 = new int[10];
        int[] copy_arr=new int[arr_01.length];

        Arrays.fill(arr_02,8);

//        for(int x : arr_02)
//            System.out.print(x+" ");
//        System.out.println();

        System.out.println("arr_01 before sort : ");
        for(int x : arr_01)
            System.out.print(x+" ");
        System.out.println();

        Arrays.sort(arr_01);

//        Arrays.sort(arr_01,4,10);

        System.out.println("arr_01 after sort : ");
        for(int x : arr_01)
            System.out.print(x+" ");
        System.out.println();

        System.arraycopy(arr_01,0,copy_arr,0,5);
        System.out.println("Copy Array : ");
        for(int x : copy_arr)
            System.out.print(x+" ");
        System.out.println();

        int bs = Arrays.binarySearch(arr_01,8);
        System.out.println("Index of 8 : "+bs);

        System.out.println(Arrays.equals(arr_01,copy_arr));
        System.out.println("arr_01 " +((Arrays.equals(arr_01,arr_02))? "=" : "!=")+ " arr_02");


        System.out.println("arr_01 " +((arr_01.equals(arr_02))? "=" : "!=")+ " arr_02");



    }
}
