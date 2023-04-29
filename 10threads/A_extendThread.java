
class thread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<=10){
            System.out.println("hiii");
            i++;
        }
    }
}

class thread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<=10){
            System.out.println("Hello");
            i++;
        }
    }
}
public class A_extendThread {
    public static void main(String[] args) {
    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    t1.start();
    t2.start();
    }
}
