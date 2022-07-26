package main.BookmyTrip.subroutines;

import java.util.*;

import main.BookmyTrip.datahandler.*;

public class faceCalc {
    
    float busFareCalc(String depDest, String arrDest) {
        if(booking.depDest.equalsIgnoreCase("Chennai"))
            {
                if(booking.arrDest.equals("New Delhi"))
                    busFare=custmr.noofadults*5000+custmr.noofchild*2500;
                else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                    busFare=custmr.noofadults*4250+custmr.noofchild*2125;
                else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                    busFare=custmr.noofadults*3000+custmr.noofchild*1500;
                else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                    busFare=custmr.noofadults*2250+custmr.noofchild*1125;
                else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                    busFare=custmr.noofadults*1250+custmr.noofchild*925;
                else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                    busFare=custmr.noofadults*2250+custmr.noofchild*1025;
            }
            else if(booking.depDest.equalsIgnoreCase("New Delhi"))
            { if(booking.arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*5000+custmr.noofchild*2500;
                else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*4250+custmr.noofchild*2000;
                else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*3050+custmr.noofchild*1125;
                else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*3250+custmr.noofchild*1525;
                else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*8250+custmr.noofchild*4125;
                else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*3750+custmr.noofchild*2205;	 }
            else if(booking.depDest.equalsIgnoreCase("Mumbai"))
            { if(booking.arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*4250+custmr.noofchild*2125;
                else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*2250+custmr.noofchild*1025;
                else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*3550+custmr.noofchild*1775;
                else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*4000+custmr.noofchild*2000;
                else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*4500+custmr.noofchild*2500;
                else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*4550+custmr.noofchild*2500;	 }
            else if(booking.depDest.equalsIgnoreCase("Kolkata"))
            { if(booking.arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*5750+custmr.noofchild*2875;
                else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*3250+custmr.noofchild*1625;
                else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*3800+custmr.noofchild*1900;
                else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*5550+custmr.noofchild*2775;
                else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*7250+custmr.noofchild*3625;
                else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*4850+custmr.noofchild*2425;	 }
            else if(booking.depDest.equalsIgnoreCase("Bangalore"))
            { if(booking.arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*2500+custmr.noofchild*1250;
                else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*3250+custmr.noofchild*1525;
                else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*4200+custmr.noofchild*2100;
                else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*5550+custmr.noofchild*2775;
                else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*2750+custmr.noofchild*1400;
                else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*2000+custmr.noofchild*1100;	 }
            else if(booking.depDest.equalsIgnoreCase("Trivandrum"))
            { if(booking.arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*3250+custmr.noofchild*1625;
                else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*8250+custmr.noofchild*4125;
                else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*4850+custmr.noofchild*2450;
                else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*7250+custmr.noofchild*3625;
                else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*2750+custmr.noofchild*1400;
                else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*3000+custmr.noofchild*1750;	 }
            else if(booking.depDest.equalsIgnoreCase("Hyderabad"))
            { if(booking.arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*2250+custmr.noofchild*1025;
                else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*3750+custmr.noofchild*2205;
                else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*4550+custmr.noofchild*2500;
                else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*4850+custmr.noofchild*2425;
                else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*2000+custmr.noofchild*1100;
                else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*3000+custmr.noofchild*1750;	 }
        return busFare;
    }

    float trainFareCalc(float inputFare){
        trainFare = inputFare * 3;
        return trainFare;
    }

    float flightFareCalc(){
        flightFare = baseFare.busFareCalc() * 5;
        return flightFare;
    }

    void tFareCalc(Booking booking){
        boolean flag = false;
        do {
            switch (booking.travelMode) {
                case "Bus":
                    busFareCalc(booking.depDest, booking.arrDest);
                    booking.totalFare = busFare + hotelCharge;
                    break;
                case "Train":
                    trainFareCalc();
                    fareTotal = trainFare + hotelCharge;
                    break;
                case "Flight":
                    flightFareCalc();
                    fareTotal = flightFare + hotelCharge;
                default:
                    System.out.println("\n Your exepected travel mode is not available!! Please select from the available!!");
                    if(travelMode.isBlank())
                        flag = true;
                    break;
            }
        } while(flag!=false);
    }
}
