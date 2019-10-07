package by.epam.javaBases;

public class StringActions {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Java";
        s2 = s1;
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2)); //true
        s2 = new String(s1);
        System.out.println(s2 == s1); //false
        System.out.println(s2.equals(s1)); // true
        s2 = new String("Java");
        System.out.println(s2 == s1); // false
        System.out.println(s2.equals(s1)); // true
        s2 = new String("Ja" + "va");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true
    }



}
