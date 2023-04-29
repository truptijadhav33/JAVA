
class thread1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<=10){
            System.out.println("Hii thread1");
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<=10){
            System.out.println("Hii thread2");
        }
    }
}


public class B_implements_runnable {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        Thread th1 = new Thread(t1);

        thread2 t2 = new thread2();
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();

    }
}
