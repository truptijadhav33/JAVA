import java.util.Scanner;

class Student {
    int id;
    String name;

    public void SetData(int i , String n) {
        id = i;
        name = n;
    }
    public void Display(){
        System.out.println("\t\tId = " + id + " Name = " + name);
        System.out.println();
    }
}

public class B_arrayOfObject {
    public static void main(String[] args) {
        int i;
        String n;
        Student s[] = new Student[5];
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 5; j++) {
            s[j] = new Student();
            System.out.println("enter id and name of student");
            i = sc.nextInt();
            n = sc.next();
            s[i].SetData(i,n);
        }
        for (int j = 0; j < 5; j++){
            s[j].Display();
        }
        sc.close();
    }
}
