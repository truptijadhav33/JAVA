import java.util.Scanner;

public class C_Addition {
    public static void main(String[] args) {
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println("Addition = " + (a+b));
    }
}
