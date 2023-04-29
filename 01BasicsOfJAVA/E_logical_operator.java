public class E_logical_operator {
    public static void main(String[] args) {
        int x = -50 ;
        
        if(x >= 10 && x <= 50){
            System.out.println("X is between 10 and 50..");
        }
        if(x > 0 || x == 50){
            System.out.println("X is integer");
        }
        else{
            System.out.println("Is not integer");
        }
    }
}
