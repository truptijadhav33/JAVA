import java.util.Scanner;

// Hierarchical Inheritance

class Student {
    public static String clgName;
    protected int roll_no;
    protected String StudName;

    public void setStudent(int r, String n) {
        roll_no = r;
        StudName = n;
    }

    public static void setClg(String clg) {
        clgName = clg;
    }

    public void Display_Student() {
        System.out.println("Collage Name :" + clgName + "\nRoll no. :" + roll_no + "\nStudent name :" + StudName);
    }
}

class Result extends Student{
    int marks;

    public void setMarks(int m) {
        marks = m;
    }
    public void Display_Result(){
        System.out.println("Marks :" + marks);
    }
}

class Year extends Student{
    public String yr;
    public void setYear(String y){
        yr=y;
    }
    public void Display_Year(){
        System.out.println("year : " + yr);
    }
}
public class E_Hierarchical_Inheritance{
    public static void main(String[] args) {
        Student.setClg("Dr.n.j.paulbudhe polytechnic");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of student :");
        String n = sc.nextLine();
        System.out.println("Enter Roll no. of Student");
        int r = sc.nextInt();
        System.out.println("Enter marks of student :");
        int m = sc.nextInt();
        System.out.println("Enter year of Student :");
        String y = sc.next();
        sc.close();
        Result R = new Result();
        Year yer = new Year();
        R.setMarks(m);
        yer.setYear(y);
        R.setStudent(r, n);
        R.Display_Student();
        R.Display_Result();
        yer.Display_Year();
    }
}
