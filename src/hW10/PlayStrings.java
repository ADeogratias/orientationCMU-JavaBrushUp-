package hW10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */

public class PlayStrings
{
    public static void main(String[] args) throws IOException {
        BufferedReader userInput =
                new BufferedReader(new InputStreamReader(System.in));

        String str1;
        String str2;

        System.out.println("******* PlayStrings Program ******* ");
        System.out.print("Enter first string: ");
        str1 = userInput.readLine();

        System.out.print("Enter second string: ");
        str2 = userInput.readLine();

        if (!str1.isEmpty() && !str2.isEmpty()) {

            System.out.println("The first string is: " + str1);
            str1 = str1.replaceAll("\\s", "");
            System.out.println("It is " + str1.length() + " characters long.");
            int iStart = 0, iEnd = 2;
            System.out.println("The Substring of the first two letters is: " + str1.substring(iStart, iEnd));

            System.out.println("\nThe first string is: " + str2);
            str2 = str2.replaceAll("\\s", "");
            int str2Len = str2.length(), last2 = str2Len - 2;
            System.out.println("It is " + str2Len + " characters long.");
            System.out.println("The Substring of the last two letters are: " +
                    str2.substring(last2)); // get the last 2 letters in a string

            String str3 = str1.concat(str2);
            System.out.println("\nThe two strings concatenated are: " + str3);
            System.out.println("It is " + str3.length() + " characters long.");
            System.out.println("The index of the first c in the concatenated string is: " + str3.indexOf("c"));
            System.out.println("The combined string with every e replaced with Q is: " + str3.replaceAll("e", "Q"));

            System.out.println("\nThe two strings concatenated and in all caps is: " + str3.toUpperCase());
            System.out.println("The two strings concatenated and in all lower case is: " + str3.toLowerCase());

        }
        else
            System.out.println("You did not fill both strings");
    }
}
