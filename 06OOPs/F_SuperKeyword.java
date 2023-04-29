

class Base{
    protected int i;
    protected Base(int i){
        this.i=i;
    }
    protected void print_Base(){
        System.out.println("i= " + i);
    }
}
class Derived extends Base{
    protected int j;
    protected Derived(int i , int j){
        super(i);
        this.j=j;
    }
    protected void print_Derived(){
        super.print_Base();
        System.out.println("j= " + j);
    }
}

public class F_SuperKeyword {
    public static void main(String[] args) {
        Derived D = new Derived(20 , 30);
        D.print_Derived();
    }
}
