package JavaPractice.Superthiskeyword;

public class Lab1 {
    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class.
    public static void main(String[] args) {
        Car s = new Car();
        Vehicle v = new Vehicle();
        s.display();
    }


}

class Car extends Vehicle {
    private int maxSpeed = 281;

    Car(){
        super(10); // Constructor Chaining
        System.out.println("DC Car");

    }

    public void display(){
        System.out.println("Car speed is -> "+ this.maxSpeed);
        System.out.println("Vehicle speed is -> "+ super.maxSpeed);
        super.message(10);
        this.message();

    }

    @Override
    void message() {
        System.out.println("Method Override");
    }
}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vehicle");
    }


    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle1");
    }

}
