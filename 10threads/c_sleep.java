
class thread1 extends Thread{
    public void run(){
        for(int i = 1 ; i<=50 ; i++){
            System.out.print(i);
            try{
                sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class thread2 extends Thread{
    public void run(){
        for(int i = 50 ; i>=1 ; i--){
            System.out.print("\t"+ i + "\n");
            try{
                sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class c_sleep {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}


/* output :
                1       50
                2       49
                3       48
                4       47
                5       46
                6       45
                7       44
                8       43
                9       42
                10      41
                11      40
                12      39
                13      38
                14      37
                15      36
                16      35
                17      34
                18      33
                19      32
                20      31
                21      30
                22      29
                23      28
                24      27
                25      26
                26      25
                27      24
                28      23
                29      22
                30      21
                31      20
                32      19
                33      18
                34      17
                35      16
                36      15
                37      14
                38      13
                39      12
                40      11
                41      10
                42      9
                43      8
                44      7
                45      6
                46      5
                47      4
                49      2
                50      1
*/
