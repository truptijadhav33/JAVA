
class first{
    int id;
    String name;
    void getFirst(int i , String n)
    {
        System.out.println("id is = " + i +"\nname is = " + n);
    }
}

public class A_custom_class {
    public static void main(String[] args) {
        first f = new first();
        f.getFirst(101, "Trupti");
    }
}
