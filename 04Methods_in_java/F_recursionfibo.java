public class F_recursionfibo {
    static int a=0 , b=1 , c=0;
    static void fibo(int n){
        if(n>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c);
            fibo(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5 , a=0 , b=1;
        System.out.print(a);
        System.out.print(b);
        fibo(n-2);
    }


    }
