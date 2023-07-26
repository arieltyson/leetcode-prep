public class Leetcode {
    public static void main(String[] args) {

        // Write a program that prints the numbers from 1 to 100, where N is an input integer.
        // For multiples of 3, print "Fizz" instead of the number, and for the multiples of 5, print "Buzz"
        // instead of the number. For numbers that are multiples of both 3 and 5, print "FizzBuzz".

        int rangeLimit = 100;
        int initValue = 1;

        for (; initValue <= rangeLimit; initValue++) {

            if (initValue % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (initValue % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (initValue % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(initValue);
            }
        }
    }
}
