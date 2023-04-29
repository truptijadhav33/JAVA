import java.util.Vector;

import javax.print.attribute.IntegerSyntax;

public class E_ex_vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(5);
        v.add(15);
        v.add(25);
        v.add(35);
        v.add(45);
        System.out.println("Vector elements are :" + v);
        v.add(2,60);
        System.out.println("After inserting Vector elements are :" + v);
        v.remove(1);
        v.remove(4);
        System.out.println("After removing Vector elements are :" + v);
    }
}
