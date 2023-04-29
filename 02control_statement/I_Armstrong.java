import java.util.Scanner;

public class I_Armstrong{
        public static void main(String[] args) {
        int num , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        num = sc.nextInt();
        sc.close();
        int no = num;
        while(no > 0){
            int rem = no%10;
            sum = sum+rem*rem*rem;
            no = no/10;
        }
        if(sum == num){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not Armstrong");
        }
    }
}
