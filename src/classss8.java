public class classss8 {

        public static void main(String[] args) {
            //Random numbers in java use math.random
             double random = Math.random();
            System.out.println(Math.random());

            int min = 1;
            int max = 10;

            int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
            System.out.println(randomInRange);

            String v6 = "160.95";
            double price = Double.valueOf(v6);
            double quantity = randomInRange;

            boolean checkingPrice = price * quantity == 321.9;

            int min2 = 0;
            int max2 = 100;
            double ra1 = random * max2;
            int i2 = (int) ra1;
            System.out.println(ra1);
            System.out.println(i2);

            int min3 = 25;
            int max3 =  125;
            double random3 = random * max3;
            double r3 = random * min3;
            System.out.println(random3);
            System.out.println(r3);




        }


}
