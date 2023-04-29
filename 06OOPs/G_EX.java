import java.util.Scanner;

class Circle{
    final double pi = 3.14;
    double radius;
    double area;
    public Circle(Double radius){
        this.radius = radius;
    }
    public void area(){
        area = pi*radius*radius;
    }
    public void display(){
        System.out.println("Area :" + area);
    }
}
public class G_EX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Enter radius of circle :");
        r = sc.nextInt();
        Circle c = new Circle(r);
        c.area();
        c.display();
        sc.close();
    }
}
