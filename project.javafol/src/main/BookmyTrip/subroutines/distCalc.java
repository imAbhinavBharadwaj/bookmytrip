package main.BookmyTrip.subroutines;

import main.BookmyTrip.datahandler.*;

public class distCalc {
    
    void distance(Booking booking) {

        if(booking.depDest.equalsIgnoreCase("Chennai")) {
            if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                booking.tripDist=2157;
            else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                booking.tripDist=1367;
            else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                booking.tripDist=1678;
            else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                booking.tripDist=334;
            else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                booking.tripDist=790;
            else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                booking.tripDist=704;
        }
        else if(booking.depDest.equalsIgnoreCase("New Delhi")) {
            if(booking.depDest.equalsIgnoreCase("Chennai"))
                booking.tripDist=2157;
            else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                booking.tripDist=1408;
            else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                booking.tripDist=1442;
            else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                booking.tripDist=2019;
            else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                booking.tripDist=2780;
            else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                booking.tripDist=1453;
        }
        else if(booking.depDest.equalsIgnoreCase("Mumbai")) {
            if(booking.arrDest.equalsIgnoreCase("Chennai"))
                booking.tripDist=1367;
            else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                booking.tripDist=1408;
            else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                booking.tripDist=2081;
            else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                booking.tripDist=1033;
            else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                booking.tripDist=1568;
            else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                booking.tripDist=739;
        }
        else if(booking.depDest.equalsIgnoreCase("Kolkata")) {
            if(booking.arrDest.equalsIgnoreCase("Chennai"))
                booking.tripDist=1678;
            else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                booking.tripDist=1442;
            else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                booking.tripDist=2081;
            else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                booking.tripDist=1883;
            else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                booking.tripDist=2468;
            else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                booking.tripDist=1516;
        }
        else if(booking.depDest.equalsIgnoreCase("Bangalore")) {
            if(booking.arrDest.equalsIgnoreCase("Chennai"))
                booking.tripDist=334;
            else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                booking.tripDist=2019;
            else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                booking.tripDist=1033;
            else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                booking.tripDist=1883;
            else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                booking.tripDist=761;
            else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                booking.tripDist=566;
        }
        else if(booking.depDest.equalsIgnoreCase("Trivandrum")) {
            if(booking.arrDest.equalsIgnoreCase("Chennai"))
                booking.tripDist=790;
            else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                booking.tripDist=2780;
            else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                booking.tripDist=1568;
            else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                booking.tripDist=2468;
            else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                booking.tripDist=761;
            else if(booking.arrDest.equalsIgnoreCase("Hyderabad"))
                booking.tripDist=1327;
        }
        else if(booking.depDest.equalsIgnoreCase("Hyderabad")) {
            if(booking.arrDest.equalsIgnoreCase("Chennai"))
                booking.tripDist=704;
            else if(booking.arrDest.equalsIgnoreCase("New Delhi"))
                booking.tripDist=1453;
            else if(booking.arrDest.equalsIgnoreCase("Mumbai"))
                booking.tripDist=739;
            else if(booking.arrDest.equalsIgnoreCase("Kolkata"))
                booking.tripDist=1516;
            else if(booking.arrDest.equalsIgnoreCase("Bangalore"))
                booking.tripDist=566;
            else if(booking.arrDest.equalsIgnoreCase("Trivandrum"))
                booking.tripDist=1327;
        }
    
    }
}
