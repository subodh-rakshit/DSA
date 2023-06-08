public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

interface Herbivore{
    void eatGrass();
}

interface Carnivore{
    void eatMeat();
}

class Bear implements Herbivore, Carnivore{
    public void eatGrass(){
        System.out.println("Bear eats Grass");
    }

    public void eatMeat(){
        System.out.println("Bear eats Meat");
    }
}