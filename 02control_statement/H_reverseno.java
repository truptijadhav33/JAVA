import java.util.Scanner;

public class H_reverseno {
    public static void main(String[] args) {
        int no , rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        no = sc.nextInt();
        sc.close();
        while(no > 0){
            int rem = no%10;
            rev = rev*10+rem;
            no = no/10;
        }
        System.out.print(rev);
    }
}
