public class HierarchialInheritance {
    public static void main(String[] args) {
		
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
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void swim(){
        System.out.println("Fly");
    }
}