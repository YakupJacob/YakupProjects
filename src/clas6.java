class StringIndexof {

    // Searching in Strings With indexOf()
    public static void main(String[] args) {
        //01234
        System.out.println("EX 1---------------------------");
        String s1 = "Hello";
        System.out.println(s1.indexOf("ello"));

        System.out.println("EX 2---------------------------");
        String s2 = "Techno Study";
        int indexS2 = s2.indexOf("ech");
        System.out.println(indexS2);

        System.out.println("EX 3---------------------------");
        String s3 = "so something so many";
        int indexS3 = s3.indexOf("so");
        System.out.println(indexS3);

        //Task 1: write code that count length of string and prints sum of length and index of "e"
        //    ex: "techno" => 6+1 => 7
        //    hint: length(), indexOf()
        String s4 = "Techno study";
        int L = s4.length();
        int M = s4.indexOf("e");
        System.out.println(L + M);

        //            01234567
        String str = "techenoe";
        int length = str.length(); // 8
        int index = str.indexOf("e"); // 1

        int sum = length + index; // 8 + 1
        System.out.println(sum);
    }

}
