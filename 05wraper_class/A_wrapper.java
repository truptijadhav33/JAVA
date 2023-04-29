public class A_wrapper {
    public static void main(String[] args) {
        
        Integer myInt = 12;
        Character myChar = 'T';
        Double myDouble = 22.56;
        Float myFloat = 2.5f;

        System.out.println("integer = " + myInt);
        System.out.println("character = " + myChar);
        System.out.println("Double = " + myDouble);
        System.out.println("Float = " + myFloat);
        String myString = myInt.toString();
        System.out.println("String = " + myString);
        System.out.println("length of String is:" + myString.length());
    }
}
