
interface A{
    public  void sound();
    public void sleep();
}

class B implements A{
    public void sound()
    {
        System.out.println("Barking");
    }
    public void sleep()
    {
        System.out.println("Zzz");
    }
}

public class Interface{
    public static void main(String[] args) {
        B b = new B();
        b.sound();
        b.sleep();
    }
}