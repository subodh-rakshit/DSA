// What will be output of this code? (both classes in same package)

// public class inheritance{
//     public static void main(String[] args) {
//         Vehicle obj1 = new Car();
//         obj1.print1();

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
//     void print1(){
//         System.out.println("Derived class (car)");
//     }
// }

public class PracticeQuestion6 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print1();  // This will throw an error

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
    void print1() {
        System.out.println("Derived class (Car)");
    }
}

// This will create a compile time error as the functions are different in both the classes
// but when we are creating a reference of Vehicle then we can only access the functions which are present in the vehicle class
// print1() is in the Car class which cannot be accessed and hence it will create a compile time error in our program
