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

public class TripMoneyCounter
{
    int tripDuration, nights;
    double dayTot_foodCost, transportCost, hotelCost;

    public TripMoneyCounter()
    {
        this.tripDuration = 0;
        this.dayTot_foodCost = 0;
        this.transportCost = 0;
        this.hotelCost = 0;
        this.nights = 0;
    }



    public TripMoneyCounter(int tripDuration,
                            double dayTot_foodCost,
                            double transportCost,
                            double hotelCost)
    {
        this.tripDuration = tripDuration;
        this.dayTot_foodCost = dayTot_foodCost;
        this.transportCost = transportCost;
        this.hotelCost = hotelCost;
        this.nights = tripDuration - 1;
    }


    public int getTripDuration () { return tripDuration; }
    public void setTripDuration ( int tripDuration){ this.tripDuration = tripDuration;}

    public double getDayTot_foodCost () { return dayTot_foodCost; }
    public void setDayTot_foodCost ( double dayTot_foodCost){ this.dayTot_foodCost = dayTot_foodCost;}

    public double getTransportCost () { return transportCost;}
    public void setTransportCost ( double transportCost) { this.transportCost = transportCost;}

    public double getHotelCost () { return hotelCost; }
    public void setHotelCost ( double hotelCost){ this.hotelCost = hotelCost; }

    public int getNights () { return getTripDuration() - 1; }

    public double tripTotCost(){ return ((tripDuration * dayTot_foodCost)
            + (hotelCost * nights) + transportCost );}

    public static void main(String[] args) throws IOException
    {
        BufferedReader userInput =
                new BufferedReader(new InputStreamReader(System.in));

        String  str = "";
        int tripDuration;
        double dayTot_foodCost;
        double transportCost;
        double hotelCost;

        System.out.println("******* Vacation Planner ******* ");
        System.out.print("Enter Trip Duration: ");
        str = userInput.readLine();
        tripDuration = Integer.parseInt(str);

        System.out.print("Enter Total cost of food per day: ");
        str = userInput.readLine();
        dayTot_foodCost = Integer.parseInt(str);

        System.out.print("Enter Transport cost: ");
        str = userInput.readLine();
        transportCost = Integer.parseInt(str);

        System.out.print("Enter Hotel cost per night: ");
        str = userInput.readLine();
        hotelCost = Integer.parseInt(str);

        TripMoneyCounter tripTracker =
                new TripMoneyCounter( tripDuration, dayTot_foodCost, transportCost, hotelCost);

        System.out.println("The Trip total cost will is: " + tripTracker.tripTotCost() + " $");
    }
}