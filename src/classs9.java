public class classs9{

    //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
    public static void main(String[] args) {
        int min = 0;
        int max = 3;
        int range = max - min;

        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

        if (randomInRange == 0) {
            System.out.println("zero");
        }

        if (randomInRange == 1) {
            System.out.println("One");
        }
        if (randomInRange == 2) {
            System.out.println("two");
        }
        if (randomInRange == 3) {
            System.out.println("three");

        }
        int min1 = -200;
        int max1 = 200;
        int range1 = max1 - min1;
        int randomInRange1 = min1 + (int) (Math.random() * (range + 1));

        // Task 2:
        // check if random number is positive or negative
        // where number is -200<=N<=200
        // ex: -123 => negative
        // ex: 10 => positive
        if (randomInRange < 0) {
            System.out.println("Negative");
        }
        if (randomInRange > 0) {
            System.out.println("Positive");
        }
        if (randomInRange == 0) {
            System.out.println("its ZERO");
        }

// Task 3:
// Check if random number is odd or even


                int min2 = 10;
                int max2 = 20;
                int range2 = max2 - min2;
                int randomInRange2 = min + (int) (Math.random() * (range + 1));

                int x = randomInRange;
                System.out.println(x);
                if ((x % 2) == 0) {
                    // even
                    System.out.println("even");
                } else {
                    // odd
                    System.out.println("odd");
                }
                int a = 10;
                int b = 20;
                int a1 = (int) (Math.random() * 10);
                int b1 = (int) (Math.random() * 20);
                System.out.println(a);
                System.out.println(b);
                System.out.println(a + b);
            }


    }
