package hW10BadFiles;

import java.io.*;

/**
 *
 * @author Cathy Bishop, Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */


public class Bad5
{
public static void main (String args[]) throws IOException
{

    BufferedReader keyboard =
         new BufferedReader(new InputStreamReader(System.in));

    String   firstName = null;
    String   lastName = "";


    System.out.print("Enter your first name: ");
    firstName = keyboard.readLine();

    if (firstName == null)
        System.out.println("firstName is null");

    System.out.print("Enter your last name: ");
    lastName = keyboard.readLine();

    if (lastName.isEmpty())
        System.out.println("last Name is empty");

    if (firstName == " ") {
        System.out.println("first Name not entered");
    }

    if (lastName == " ") {
        System.out.println("Last Name not entered");
    }

    if (firstName.equals(lastName))
        System.out.println("Your first name matches your last name; how unusual!");

    if (firstName.equalsIgnoreCase("cathy"))
        System.out.println("You entered Cathy!");

    if ("Bishop".equalsIgnoreCase(lastName))
        System.out.println("My last name is Bishop too!");
}
}
