package F2fExercicise13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */

public class MultiplicationTable
{
    // display multiplication table with your own limit
    public static void displayMultTable(int num, int limit)
    {
        for (int i = 0; i < limit; i++)
            System.out.println(num + " x "+ i +" = "+(num*i));
    }

    // multiply to 12
    public static void displayMultTable(int num)
    {
        for (int i = 0; i < 13; i++)
            System.out.println(num + " x "+ i +" = "+(num*i));
    }


    public static void main(String[] args) throws IOException {
        BufferedReader keyboard =
                new BufferedReader(new InputStreamReader(System.in));

        String str="";
        int num;

        System.out.print("Enter a number and get its multiplication table: ");
        str = keyboard.readLine();
        num = Integer.parseInt(str);

        if (num > 0)
            MultiplicationTable.displayMultTable(num); //get multiplication to 12

    }
}
