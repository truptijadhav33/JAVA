import java.util.*;
public class B_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        int add = a+b;
        System.out.println(add);
    }
}
