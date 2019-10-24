package s;

public class trim {
    public static void main(String[] args) {
        String string = "   Hello       ";
        System.out.println(string);
        System.out.println(string.trim());

        String s2 = "   Hello  World     ";
        System.out.println(s2.trim());
        String s1 = "one two one three";
        System.out.println(s2.replace("one","four"));

        String s3 = "name;surname;age;grade;class";
        System.out.println(s3.replace(";"," "));
        String s4 = "Jacob Aga";
        System.out.println(s4.replace("Jacob","Yakup"));
        System.out.println(s4.replace("Aga", "cin") );
        String r1 = "     aga     ";
        System.out.println(r1.trim());


    }
}