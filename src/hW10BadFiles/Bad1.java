package hW10BadFiles;

import java.io.*;

/**
 *
 * @author Cathy Bishop, Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */

public class Bad1
{
    public static void main (String args[]) throws IOException
    {

        BufferedReader keyboard =
                new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        int num1;
        boolean entered10 = false;

        System.out.print("Enter a number: ");
        str = keyboard.readLine();
        num1 = Integer.parseInt(str);

        if (num1 == 10)
            entered10 = true;

        if (entered10 == true)
            System.out.println("You entered 10");
        else
            System.out.println("You did not enter 10");
    }
}