import java.util.Scanner;
class factorial{
    int fact(int n)
    {
        if(n == 1) {
            return 1;
        }
        else{
            return n*(fact(n-1));
        }
    }
}
public class C_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for find factorial :");
        int n = sc.nextInt();
        sc.close();
        factorial F = new factorial();
        System.out.println("Factorial : " + F.fact(n) );
    }
}
