public class MultiLevelInheritance {
    public static void main(String[] args) {
		Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
	}
}


// Base Class
class Animal{
	String color;

	void eat(){
		System.out.println("Eats");
	}

	void breathe(){
		System.out.println("Breathe");
	}
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breathe;
}