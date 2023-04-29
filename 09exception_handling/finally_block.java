import java.util.Scanner;

public class finally_block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers for division :");
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        try {
            int c = a/b;
            System.out.println("Division is :" +c);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero following error is occurred try again:\n\n" + e);
        } finally{
            System.out.println("\nFinally block executed,thank you for visiting..!!\n");
        }
    }
}
