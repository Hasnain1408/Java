package May05;

public class Constructor {
    int x;
    public Constructor(){
        x = 5;
    }

    public Constructor(int y){
        x = y;
    }

    public static void main(String[] args){
        Constructor myObj = new Constructor(21);
        System.out.println(myObj.x);
    }
}
