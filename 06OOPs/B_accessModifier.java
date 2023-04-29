class Student{
    int id;
    String name;

    void get_student(int i , String nm)
    {
        id = i;
        name = nm;
    }

   void set_student()
    {
        System.out.println("id = "+ id + "\nname = " + name);
    }
}
public class B_accessModifier {
    public static void main(String[] args) {
        Student S = new Student();
        S.id = 101;
        S.name = "Trupti"; 
        S.get_student(101, "Trupti");
        S.set_student();
    }
}
