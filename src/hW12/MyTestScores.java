package hW12;

/**
 * This is a helper class for encapsulating a TestScore. It is not complete.
 *
 * Note: no comments on purpose! See if you can folllow the code.
 *
 *  On my honor, as a Carnegie-Mellon Africa student,
 *  I have neither given nor received unauthorized assistance on this work.
 *
 *  giving credits to
 *  @author Cathy Bishop I used her codes that were posted online.
 *   *  http://public.africa.cmu.edu/cbishop/orientation/java/
 *
 * @author Deogratias Amani
 */


public class MyTestScores
{
    public static void main(String[] args) {

        TestScore   tests[] = new TestScore[5]; // declare and allocate the slots in the array
        int         used = 0;
        int         i = 0;
        String      scoreLabel;



        tests[0] = new TestScore(19, 20);
        tests[1] = new TestScore(20, 20);
        tests[2] = new TestScore(20.001, 25); // should respect the letter grades labels

        used = 3;

        System.out.println("The size of our array is " + tests.length +
                ". We are using " + used + " elements.");


        for (i = 0; i < used; i++)
        {
            scoreLabel = "Score " + (i + 1);
            System.out.println(scoreLabel + " is " + tests[i]);
            System.out.println("    Letter grade: " + tests[i].getLetterGrade());
        }

    }

}