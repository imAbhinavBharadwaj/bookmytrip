package main.BookmyTrip.datahandler;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.LocalDate;

import main.BookmyTrip.datahandler.Customer;

public class Booking {
    public long bookingID;
    public long custID;
    public long mills = System.currentTimeMillis();
    public LocalDate dateofbooking;
    public LocalTime timeofbooking;
    public final long x= 99999;
    public String travelMode;
    public float busFare;
    public float trainFare;
    public float flightFare;
    public float totalFare;
    public float tripDist;
    public String depDest;
    public String arrDest;
    public String depDate;
    public String descision;
    public int hotelChoice;
    public String hotelName;
    public float hotelCharge;
    public int paymentMode;
    public String cardNum;
    public String cardExpiry;
    int ccv;
    int otp;
    String chequeNum;
    boolean bookingStatus;
    
    public Booking() {
    };


}
