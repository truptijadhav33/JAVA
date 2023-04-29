import java.util.Scanner;

public class G_prime {
    public static void main(String[] args) {
        int flag=0,num;
        int i = 2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        num = sc.nextInt();
        sc.close();
        while(i < num){
            if((num%i)== 0 ){
                flag=1;
                break;
            }
            i++;
        }
        if(flag==1){
            System.out.println("  Number is not prime");
        }
        else{
            System.out.println(" Number is prime");
        }
    }
}
