import java.util.*;
import mypack.*;
public class import_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , fact;
        System.out.println("Enter number for finding factorial of number :");
        num = sc.nextInt();
        sc.close();
        factorial f = new factorial();
        fact = f.fact(num);
        System.out.println("Factorial is : " +fact);
    }
}
