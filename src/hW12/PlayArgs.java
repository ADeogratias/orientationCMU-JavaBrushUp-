package hW12;

/**
 *  On my honor, as a Carnegie-Mellon Africa student,
 *  I have neither given nor received unauthorized assistance on this work.
 *
 *  giving credits to
 *  @author Cathy Bishop I used her codes that were posted online.
 *  http://public.africa.cmu.edu/cbishop/orientation/java/
 *
 *  And me
 *  Deogratias Amani
 */


/** How the program runs in my environment IntelliJ basicallly
 *
 * added the codes in a PlayArgsclass under the main function
 *
 * Go to navigation bar at the top and click:
 * Run > Edit configuratihons > Build and run > add program arguments
 * ( you can use alt + R for a shortcut and then type your argument)
 *
 */

public class PlayArgs {
    public static void main(String[] args) {
        System.out.println("PlayArgs got passed in "
                + args.length
                + " command-lin arguments.");

        System.out.println();

        // Loop through the args and print each one
        // Question: why does it print i + 1??
        // so at first i is equal to zero and we want to show 1 not 0
        // so given that the number that people who are not programers can refer to.
        // which is i + 1

        // had to add a data type to i since it
        // was not having one and throwing an error
        for (int i = 0; i < args.length; i++)
            System.out.println("Arg " + (i + 1) + " is: " + args[i]);
    }
}
