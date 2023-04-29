import java.util. Scanner;
class Adder{
                            // creating class ...
    int sum(int x , int y)      //creating method ...
    {
        return (x+y);
    }
}
public class A_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Adder A = new Adder();     //Initializing object " A " ...
        System.out.println("Addition = " + A.sum(a, b) );    //function calling...
    }
}
