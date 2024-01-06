public class Leetcode {

    public static void main(String[] args) {

        // FizzBuzz problem
        // Write a program that prints the numbers from 1 to 100, where N is an input integer.
        // For multiples of 3, print "Fizz" instead of the number, and for the multiples of 5, print "Buzz"
        // instead of the number. For numbers that are multiples of both 3 and 5, print "FizzBuzz".

        int rangeLimit = 100;
        fizzBuzz(rangeLimit);
        System.out.println();

        // Rectangle Overlap problem
        // Given two rectangles, rect1 and rect2, each represented by the coordinates of its bottom-left and top-right corners,
        // determine if the two rectangles overlap.
        //
        // Each rectangle is represented as an array of four integers [x1, y1, x2, y2], where (x1, y1) is the bottom-left corner,
        // and (x2, y2) is the top-right corner. The coordinates are integer values.
        //
        // Two rectangles overlap if there is at least one point that is common to both rectangles (i.e., they share some area).

        int[] rect1 = {0, 0, 2, 2};
        int[] rect2 = {1, 1, 3, 3};

        boolean rectOverlap = isRectangleOverlap(rect1, rect2);
        System.out.println();
        System.out.println("Rectangles overlap: " + rectOverlap);
    }

    // FizzBuzz Implementation
    public static void fizzBuzz(int rangeLimit) {
        int initValue = 1;

        for (; initValue <= rangeLimit; initValue++) {

            if (initValue % 15 == 0) {
                System.out.print("FizzBuzz" + ",");
            } else if (initValue % 3 == 0) {
                System.out.print("Fizz" + ",");
            } else if (initValue % 5 == 0) {
                System.out.print("Buzz" + ",");
            } else {
                System.out.print(initValue + ",");
            }
        }
    }

    // Rectangle Overlap Implementation

    public static boolean isRectangleOverlap(int[] rect1, int[] rect2) {

        // Check if one of the rectangles is situated left of the other
        if (rect1[2] <= rect2[0] || rect2[2] <= rect1[0]) {
            return false;
        }

        // Check if one of the rectangles is situated above the other
        if (rect1[3] <= rect2[1] || rect2[3] <= rect1[1]) {
            return false;
        }

        // Calculate the coordinates of the intersection rectangle
        int left = Math.max(rect1[0], rect2[0]);
        int right = Math.min(rect1[2], rect2[2]);
        int top = Math.min(rect1[3], rect2[3]);
        int bottom = Math.max(rect1[1], rect2[1]);

        // Check if the intersection rectangle has a positive area
        return (right > left) && (top > bottom);
    }
}
