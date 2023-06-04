public class AbstractKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); // Error
        // System.out.println(h.color);

        Mustang myHorse = new Mustang(); // Here first the animal constructor will be called then horse class then
                                         // mustang class

    }
}

abstract class Animal {
    String color;

    Animal() {
        // color = "Brown";
        System.out.println("Animal Constructor Called");
    }

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse Constructor Called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}