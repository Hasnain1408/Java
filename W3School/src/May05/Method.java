package May05;

public class Method {

    static void myStaticMethod(){
        System.out.println("Static Method can be called without creating  object !!");
    }

    public void myPublicMethod(){
        System.out.println("Public Method must be called by ctreating object !!");
    }

    public static void main(String[ ] args){
//        myStaticMethod();
//        Method myObj = new Method();
//        myObj.myPublicMethod();
//
//        System.out.println();
//
//       Car myCar = new Car();
//       myCar.fullThrottle();
//       myCar.speed(100);

       Car myCar2 = new Car(1969,"Mustang");
        System.out.println(myCar2.Year +"\t"+ myCar2.modelName);
//        myCar2.main("Hello");
    }
}
