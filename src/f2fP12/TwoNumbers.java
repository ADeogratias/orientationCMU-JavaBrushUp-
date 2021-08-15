package f2fP12;

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


public class TwoNumbers
{
    int number1;
    int number2;

    public TwoNumbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add () {return this.number1 + this.number2;}
    public double difference () {return this.number1 - this.number2;}
    public double multiply (){return this.number1 * this.number2;}

    public boolean isEven ()
    {
        return ((this.number1 % 2) == 0) &&
            ((this.number2 % 2) == 0);
    }

    public boolean isOdd ()
    {
        return ((this.number1 % 2) != 0) &&
                ((this.number2 % 2) != 0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader userInput =
                new BufferedReader(new InputStreamReader(System.in));

        String  str = "";
        int number1;
        int number2;

        System.out.println("Enter 2 numbers and lets do some math: ");
        System.out.print("Enter first number: ");
        str = userInput.readLine();
        number1 = Integer.parseInt(str);
        System.out.print("Enter second number: ");
        str = userInput.readLine();
        number2 = Integer.parseInt(str);

        System.out.println("\nThe performed arthimetic operations show the following results: ");
        TwoNumbers calculateAns = new TwoNumbers(number1, number2);
        if(calculateAns.isOdd()){
            System.out.println( "\nMultiplication result of Odd Numbers "
                    + number1 + " x " + number2 + " = " + calculateAns.multiply());
        }
        else if (calculateAns.isEven()){
            System.out.println( "\nSum of Even Numbers "
                    + number1 + " + " + number2 + " = " + calculateAns.add());
        }

        else {
            System.out.println( "\nWe performed a Substraction because they neither odd nor even "
                    + number1 + " - " + number2 + " = " + calculateAns.difference());
        }

    }


}
