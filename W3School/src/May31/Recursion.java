package May31;

public class Recursion {
        public static void main(String[] args) {

            System.out.println(sum(5,10));
        }
        public static int sum(int k) {

            return (k == 1)? 1 : k + sum(k - 1);

        }

    public static int sum(int s, int e) {

        return (s == e)? e : s + sum(s + 1,e);

    }

}
