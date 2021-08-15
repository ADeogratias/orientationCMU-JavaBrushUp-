package F2fExercicise13;

/**
 *
 * @author Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 * Great Question. I had fun thinking and solving it. Thank you Cathy and Team!!!
 * Have a wonderful Weekend
 * I some codes commented below show my progress to make more readable codes.
 *
 */

public class EvenDigits
{
    public static Boolean isEven(int digit){ return digit%2 == 0;}

    public static void main(String[] args)
    {
        // print numbers with all even digits
        for (int i = 0; i < 500; i++ )
        {
            int middleD = i / 10, firstD = i / 100;
            System.out.print((
                    EvenDigits.isEven(i) &&
                            EvenDigits.isEven(middleD) &&
                            EvenDigits.isEven(firstD)) ? +i + "\n" : "");
        }
    }
}
