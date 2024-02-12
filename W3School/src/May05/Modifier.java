package May05;

abstract class Modifier {
    public String fname = "Hasnain";
    public int age = 20;

    public abstract void study();
}

class Student extends Modifier{
        public int graduationYear = 2019;

        public void study(){
            System.out.println("Studying all day long.");
        }
}


class First {
    public static void main(String[] args){
     Student myobj = new Student();

        System.out.println("Name : "+myobj.fname);
        System.out.println("Age : "+myobj.age);
        System.out.println("Graduation Year : "+myobj.graduationYear);
        myobj.study();
    }
}
