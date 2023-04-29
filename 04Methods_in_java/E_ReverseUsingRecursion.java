import java.util.Scanner;

public class E_ReverseUsingRecursion {
    
    static int rev = 0;
    public static int  reverse(int n){
        if(n == 0){
            return rev;
        }
        if(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            reverse(n/10);
        }
        return rev;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Enter number :");
        num = sc.nextInt();
        sc.close();
        System.out.println(reverse(num));
    }
}