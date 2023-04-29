
                    // Single Inheritance

class Collage{
    protected static String clgName;
    public static void setClg(String name){
        clgName = name;
    }
}

class Student extends Collage{
    protected int roll_no;
    protected String studName;
    public void setStudent( int r , String n){
        roll_no = r;
        studName = n;
    }
    public void print(){
        System.out.println("Student name : " + studName);
        System.out.println("Roll no. : " + roll_no);
        System.out.println("Collage name : " + clgName);

    }

}

public class C_Single_Inheritance {
    public static void main(String[] args) {
        Collage.setClg("DR . N . J . Paulbudhe Polytechnic");
        Student S = new Student();
        S.setStudent(101, "Trupti");
        S.print();
    }
}
