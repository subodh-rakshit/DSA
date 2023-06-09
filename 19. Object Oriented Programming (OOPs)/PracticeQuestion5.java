// What will be output of this code? (both classes in same package)

// public class inheritance{
//     public static void main(String[] args) {
//         Vehicle obj1 = new Car();
//         obj1.print();

//         Vehicle obj2 = new Vehicle();
//         obj2.print();
//     }
// }

// class Vehicle{
//     void print(){
//         System.out.println("Base class (Vehicle)");
//     }
// }

// class Car extends Vehicle{
//     void print(){
//         System.out.println("Derived class (car)");
//     }
// }

public class PracticeQuestion5 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class (Car)");
    }
}

// In obj1.print(); -> this will be a concept of function overriding
// In the car class if we see we have the same function which is in the Vehicle class i.e. print
// so it will override the print function of Vehicle class and hence obj1.print() will print "Derived class(Car)"
// in obj2.print() -> "Base Class(Vehicle)" will be printed

// Correct Answer :
// Derived class (Car)
// Base class (Vehicle)