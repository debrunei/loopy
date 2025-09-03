public class main {
    public static void main(String[] args) {
        // Task 2a: Sum of numbers 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of numbers 1 to 100: " + sum);

        System.out.println(); // Empty line

        // Task 2b: Factorial of 8
        int factorial = 1;
        for (int i = 8; i >= 1; i--)
            factorial = factorial * i;
        System.out.println("Factorial of 8: " + factorial);

        System.out.println(); // Empty line

        // Task 2c: Multiplication table for 7
        System.out.println("Multiplication table for 7:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 7; j <= 7; j++){
                int product = i * j;
                System.out.print("7 x " + i + " = " + product + "\t");

            }
            System.out.println();
        }

        System.out.println(); // Empty line

        // Task 2d: Sum of even numbers 2 to 50
        int evenSum = 0;
        for (int i = 2; i <= 50; i += 2) {
            evenSum = evenSum + i;
        }
        System.out.println("Sum of even numbers 2 to 50: " + evenSum);
    }
}