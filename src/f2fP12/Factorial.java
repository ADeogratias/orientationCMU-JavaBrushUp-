package f2fP12;

/**
 *
 * @author Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */

public class Factorial {
    public static void main(String[] args) {  // Set an initial breakpoint at this statement
        int n = 20;
        double factorial = 1;

        // n! = 1*2*3...*n
        for (int i = 1; i <= n; i++) {  // i = 1, 2, 3, ..., n
            factorial = factorial * i;   //*
        }
        System.out.println("The f2fP12.Factorial of " + n + " is " + factorial);
    }
}
