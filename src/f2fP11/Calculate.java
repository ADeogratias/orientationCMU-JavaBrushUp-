import java.util.*;
import java.io.*;
/**
 *
 * @author Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */

public class Calculate
{
    double number1;
    double number2;

    public Calculate(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add () {return (this.number1 + this.number2);}
    public double substract () {return this.number1 - this.number2;}
    public double divide (){return this.number1 / this.number2;}
    public double multiply (){return this.number1 * this.number2;}

    public static void main(String[] args) throws IOException {

        BufferedReader userInput =
                new BufferedReader(new InputStreamReader(System.in));

        String  str = "";
        int number1;
        int number2;

        System.out.println("Enter 2 numbers and lets perform arthimetic operations: ");
        System.out.print("Enter first number: ");
        str = userInput.readLine();
        number1 = Integer.parseInt(str);
        System.out.print("Enter second number: ");
        str = userInput.readLine();
        number2 = Integer.parseInt(str);

        System.out.println("\nThe performed arthimetic operations show the following results: ");
        Calculate calculateAns = new Calculate(number1, number2);
        System.out.println( "\nAddition result "
                + number1 + " + " + number2 + " = " + calculateAns.add());

        System.out.println( "Substraction result "
                + number1 + " - " + number2 + " = " + calculateAns.substract());

        System.out.println( "Multiplication result "
                + number1 + " x " + number2 + " = " + calculateAns.multiply());

        System.out.println( "Division result "
                + number1 + " / " + number2 + " = " + calculateAns.divide());

    }


}
