public class clas3 {
    public static void main(String[] arg){
        // String Length
        String s1 = "ABCDE";
        System.out.println(s1.length());
        int length = s1.length();
        System.out.println(length);
        String username = "techo.study";

        if(username.length() < 10){
            System.out.println("you can login");
        }
        if(username.length() >= 10){
            System.out.println("you cannot login");
        }
        String s2 = "ABC";
        String s3 = "S";
        int s4 = s2.length() + s3.length();
        System.out.println("Length is:"+ s4);

        String c1 = "LONGSTRINGHERE", c2 = "SHORTONE";
         int subrtraction = c1.length() - c2.length();
        if ( subrtraction < 0) {

            System.out.println("we can do it");
        } else {
            System.out.println("cannot proceed");
        }

    }

}
