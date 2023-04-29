import java.util.Scanner;

                  // Multilevel Inheritance

class Student {
    protected String name;
    protected int Roll_no;
    public static String clgName;

    public static void setClg(String clg) {
        clgName = clg;
    }

    public void setStudent(String name, int Roll_no) {
        this.name = name;
        this.Roll_no = Roll_no;
    }

    public void Display() {
        System.out.println("Collage Name : " + clgName);
        System.out.println("Name : " + name);
        System.out.println("Roll no. : " + Roll_no);
    }
}

class Marks extends Student {
    public int totalMarks;

    public void setMarks(int mark) {
        totalMarks = mark;
    }
}

class Result extends Marks {
    public void remark() {
        if (totalMarks > 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

public class D_Multilevel_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collage.setClg("Dr.N.J.PIT");
        Result R = new Result();
        System.out.println("Enter name , roll no , total marks of student :");
        String n = sc.nextLine();
        int r = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        R.setStudent(n,r);
        R.setMarks(m);
        R.Display();
        R.remark();
    }
}
