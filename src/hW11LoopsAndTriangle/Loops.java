package hW11LoopsAndTriangle;

public class Loops {
    public static void main(String[] args) {
        // print out how many times the loops executes
        // print format should be as the following:
        // Loop 1 executes N times.
        // If it is an infinite loop it should print out
        // Loop 7 (n) is an infinite loops

        // variables for all the questions
        int q1=0, q2=0, q3=0, q4=0, q6=0, q7=0;

        for (int i = 1; i <= 10; i++) q1 = i;               // Question 1.
        for (int i = 0; i < 10; i++) q2 += 1;               // Question 2.
        for (int i = 10; i > 0; i--) q3 += 1;               // Question 3.
        for (int i = -10; i <= 10; i++) q4 += 1;            // Question 4.

        //for (int i = 10; i >= 0; i++)                     // Question 5. infinite loop

        for (int i = -10; i <= 10; i = i + 2) q6 += 1;      // Question 6.
        for (int i = -10; i <= 10; i = i + 3) q7 += 1;      // Question 2.

        System.out.println("Loop 1 excutes "+ q1 +" times");
        System.out.println("Loop 1 excutes "+ q2 +" times");
        System.out.println("Loop 1 excutes "+ q3 +" times");
        System.out.println("Loop 1 excutes "+ q4 +" times");
        System.out.println("Loop 5 is an infinite loops");
        System.out.println("Loop 1 excutes "+ q6 +" times");
        System.out.println("Loop 1 excutes "+ q7 +" times");

    }
}
