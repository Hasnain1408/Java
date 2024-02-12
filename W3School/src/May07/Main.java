package May07;

public class Main {
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//        System.out.println(myOuter.x + myInner.y);
        System.out.println(myInner.myInnerMethod());
    }
}
