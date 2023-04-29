class Overloading{
    void sum(int a , int b){
        System.out.println(a+b);

    }
    void sum(double a , int b){
        System.out.println(a+b);

    }
    void sum(int a , double b , int c){
        System.out.println(a+b+c);

    }
}
public class B_Function_overloading {
    public static void main(String[] args) {
        Overloading O = new Overloading();
        O.sum(12, 34);
        O.sum(34.67, 12);
        O.sum(78, 56.89, 23);
    }

}
