import java.util.Scanner;

public class F_Switch_state {
    public static void main(String[] args) {
        int a , b , ch ;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.ADD\n2.sub");
        ch = sc.nextInt();
        System.out.println("Enter two numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        switch(ch)
        {
            
            case 1:
            System.out.println(a+b);
            break;
            
            case 2:
            System.out.println(a-b);
            break;

            default:
            System.out.println("Invalid choice");

        }
    }
}
