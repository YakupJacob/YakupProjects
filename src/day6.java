public class day6 {

        public static void main(String[] args) {
            // valueOf() which can be used to convert
            // a number to a String
            // Converting integer to String
            int number = 10;
            String s1 = String.valueOf(number);
            System.out.println(s1 + 10); //"10" + 10 => 1010
            System.out.println("10" + 10); //"10" + 10 => 1010
            System.out.println(number + 10); // 20

            System.out.println("---------------------------------------");
            // Converting String to integer
            String s2 = "30";
            int n2 = Integer.valueOf(s2);
            // 30 + 10 => 40
            System.out.println(s2+10); // "30" + 10 => "3010"
            System.out.println(n2+10); // 30 + 10 => 40

            System.out.println("---------------------------------------");
            //TODO Task 1: write a program that
            //  take strings and give us sum result:
            //  ex: s1="100", s2="300" => 400
            String a1 = "100";
            String a2 = "300";

            int num1 = Integer.valueOf(a1);
            int num2 = Integer.valueOf(a2);
            System.out.println(num1+num2);


            // Task 2: write a program that
            // take this values and
            // and prints the average
            // values = ["5", 50, 2.24, "22", 50000];

        }
    }

