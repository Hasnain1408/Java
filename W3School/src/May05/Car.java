package May05;

public class Car {
    int Year;
    String modelName;
    String Th = "The car is going as fast as it can !";

    public Car(){

    }

    public Car(int Year,String name){
       this. Year = Year;
       modelName = name;
    }

    public void fullThrottle(){
        System.out.println(Th);
    }
    public void speed( int maxSpeed){
        System.out.println("Max speed is : "+maxSpeed);
    }

    public static void main(String[] args){
        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.speed(80);
    }
}
