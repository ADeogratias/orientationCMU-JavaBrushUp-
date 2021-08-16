//package hW11LoopsAndTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle
{
    public static void printStarLine(int numStars)
    {
        if (numStars < 0)
        {
            System.out.println("*** That is not a valid entry. ***");
            System.exit(1);
        }

        for (int i = 0; i < numStars; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void printTriangle(int numStars)
    {
        for (int i = 1; i <= numStars; i++)
            printStarLine(i);

        for (int m = --numStars; m > 0; m--)
            printStarLine(m);

        //implementation before
//      for (int i = 1; i <= numStars; i++)
//      {
//            for (int j = 0; j < i; j++)
//                System.out.print("*");
//            System.out.println();
//       }

//        for (int m = --numStars; m > 0; m--)
//        {
//            for (int n = 1; n < m; n++)
//                System.out.print("*");
//            System.out.println();
//        }
    }

    public static void printStarLine(String str, int numStr)
    {
        for (int i = 0; i < numStr; i++)
            System.out.print(str);
        System.out.println();
    }
    public static void printTriangle(String str, int numStr)
    {
        for (int i = 1; i <= numStr; i++)
            printStarLine(str, i);

        for (int m = --numStr; m > 0; m--)
            printStarLine(str, m);

    }

    public static void isValidNumber(int num)
    {
        if (num < 0)
        {
            System.out.println("*** That is not a valid entry. ***");
            System.exit(1);
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader keyboard =
                new BufferedReader(new InputStreamReader(System.in));

        String str="";
        int num;

        System.out.print("Please enter a positive number: ");
        str = keyboard.readLine();
        num = Integer.parseInt(str);

        isValidNumber(num); // end program if not valid input

        if (args.length > 0)
            printTriangle(args[0], num);

        else
            printTriangle(num); // now print triangle

        // print stars by default if argument is not given.
//        printStarLine(num); //print star line
//        printTriangle(num); // now print triangle

    }
}
