package mypack;
public class factorial {
    public int fact(int n){
        int f = 1;
        for(int i = 1 ; i <= n ; i++){
             f = f * i;
        }
        return f;
    }
}
