   class StringIndexOf {


       //Substrings
       public static void main(String[] args) {
                           //0123456789
           String string1 = "Hello World";
           System.out.println(string1.substring(6)); // World

           System.out.println(string1.substring(0,1)); // H
           System.out.println(string1.substring(6,7)); // W

           System.out.println(string1.substring(11,11));
           String string2 = "Michale Jackson";
           System.out.println(string2.substring(0,1) + string2.substring(8,9));
           System.out.println(string2.substring(0,1) + "." + string2.substring(8,9));


           //Task 3: Write a Java program to get a substring
           //        of a given string between two specified positions
           //given string: "The quick brown fox jumps over the lazy dog."
           //print only this:   "brown fox jumps"

           String s1 = "The quick brown fox jumps over the lazy dog.";
           System.out.println(s1.substring(10, 25));
           String s2 = "Jacob Aga";
           System.out.println(s2.substring(5,9));

           String name2 = "Michale";
           String subname = "Jackson";
           if(name2.equals("Michale"));
           {
               System.out.println("Jackson");
           }

       }
   }

