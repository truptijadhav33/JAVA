
class Student{
    public int Roll_no;
    public Student(int r){
        Roll_no = r;
    }
    public boolean equals(Object ob){
        Student S = (Student)ob;
        if( this.Roll_no == S.Roll_no){
            return true;
        } else{
            return false;
        }
    }
}

public class D_EqualsMethod {
    public static void main(String[] args) {
        Student S1 = new Student(12);
        Student S2 = new Student(2);
        if(S1.equals(S2)){
            System.out.println("Equal");
        } else{
            System.out.println("Not equal");
        }
    }
}
