
abstract class Animal{
    public abstract void sound();
}
class Dog extends Animal{
    
    public void sound() {
        System.out.println("Barking");
    }

}

class sparrow extends Animal{
    public void sound()
    {
        System.out.println("Chirping");
    }
}

public class Abstract_class{
    public static void main(String[] args) {
        sparrow sp = new sparrow();
        sp.sound();
        Dog D = new Dog();
        D.sound();
    }
}