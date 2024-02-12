package May05;

public class Attribute {
    final int x = 5;
    int y = 3;

    public static void main(String[] args){
//        Attribute myObj = new Attribute();
//        myObj.y = 99;
//        System.out.println(myObj.x);
//        System.out.println(myObj.y);

        Main info = new Main();

        System.out.println("Name : "+ info.fname + " "+info.lname);
        System.out.println("Age : "+info.age);
        info.myMethod();

//        myStaticMethod();
    }
}
