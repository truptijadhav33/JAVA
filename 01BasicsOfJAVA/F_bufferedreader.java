import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class F_bufferedreader {
    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your name: ");
       String nm;
       nm = bf.readLine();
       System.out.println("Name : "+nm);
    }
}
