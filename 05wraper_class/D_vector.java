import java.util.*;

public class D_vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        String str = "Trupti";
        System.out.println(v.size());
        v.addElement(str);
        System.out.println(v.size());
        System.out.println(v.elementAt(0));
        v.removeElement(str);
        System.out.println(v.size());
    }
}
