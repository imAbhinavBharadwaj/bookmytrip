import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import main.BookmyTrip.*;

class Booking {

    void destinations(){
        System.out.println("\n The following Destination Packages are available:\n ");
        System.out.println("\t\t 1.Chennai.\n ");
        System.out.println("\t\t 2.New Delhi.\n ");
        System.out.println("\t\t 3.Mumbai.\n ");
        System.out.println("\t\t 4.Kolkata.\n ");
        System.out.println("\t\t 5.Bangalore.\n ");
        System.out.println("\t\t 6.Trivandrum.\n ");
        System.out.println("\t\t 7.Hyderabad.\n ");
        while (depDest.isBlank() || depDest.equalsIgnoreCase("null")) {
            System.out.println("\n Enter your Departure Destination : ");
            depDest = bookIn.nextLine();
        }
        while (depDate.isBlank() || depDate.equalsIgnoreCase("null")){
            System.out.println("\n Enter your Date of Departure : ");
            depDate = bookIn.nextLine();
        }
        while (arrDest.isBlank() || arrDest.equalsIgnoreCase("null")) {       
            System.out.println("\n Enter your Arrival Destination : ");
            arrDest =  bookIn.nextLine();
        }
        while (travelMode.isBlank() || travelMode.equalsIgnoreCase("null")) {
            System.out.println("\n Following Travel Modes are available:\n ");
            System.out.println("\t\t 1.Bus.\n ");
            System.out.println("\t\t 2.Train.\n ");
            System.out.println("\t\t 3.Flight.\n ");
            travelMode = bookIn.nextLine();
        }
        tFareCalc();
    }

    void hotel(){
        String hotelDesc;
        System.out.println("\n Do you want to book hotel? (Yes/No)");
        hotelDesc = bookIn.nextLine();
        switch(hotelDesc) {
            case "Yes" :
                {
                    if(custmr.custAge>=18)
                        custmr.noofadults += 1;
                    else
                        custmr.noofchild += 1;
                }
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("\n\t\t List of Hotels");
                System.out.println("\n\t|----------------------------------------------------------------|");
                System.out.println("\n\t|  S.No.  |     HOTEL NAME     |  ADULT CHARGE  |  CHILD CHARGE  |");
                System.out.println("\n\t|----------------------------------------------------------------|");
                System.out.println("\n\t|    1    |   Grande de Royal  |    Rs.5000     |    Rs.2850     |");
                System.out.println("\n\t|    2    |  Le Royal Meridein |    Rs.6500     |    Rs.3250     |");
                System.out.println("\n\t|    3    |   Surat Red Fort   |    Rs.7250     |    Rs.3500     |");
                System.out.println("\n\t|    4    |   Taj Coramandel   |    Rs.7000     |    Rs.3750     |");
                System.out.println("\n\t|    5    |     Sapthagirri    |    Rs.8500     |    Rs.4400     |");
                System.out.println("\n\t|_________|____________________|________________|________________|");
                System.out.println("\n\n Enter Hotel of your Choice: ");
                hotelChoice = bookIn.nextInt();
                switch(hotelChoice){
                    case 1 :
                        hotelName = "Grande de Royal";
                        hotelCharge = custmr.noofadults*5000 + custmr.noofchild*2850;
                    break;
                    case 2 :
                        hotelName = "Le Royal Meridein";
                        hotelCharge = custmr.noofadults*6500 + custmr.noofchild*3250;
                    break;
                    case 3 :
                        hotelName = "Surat Red Fort";
                        hotelCharge = custmr.noofadults*5250 + custmr.noofchild*2250;
                    break;
                    case 4 :
                        hotelName = "Taj Coramandel";
                        hotelCharge = custmr.noofadults*7000 + custmr.noofchild*3750;
                    break;
                    case 5 :
                        hotelName = "Sapthagirri";
                        hotelCharge = custmr.noofadults*4500 + custmr.noofchild*1250;
                    break;
                    default :
                        System.out.println("\n Sorry we don't have contact with the hotel you have Requested for!! \n ");
                    break;
                }
                display();
                break;
            case "No" :
                display();
                break;
        }
    }

    public int otpValidate(int var){
        if (var < 100000) {
            if (var < 100) {
                if (var < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (var < 1000) {
                    return 3;
                } else {
                    if (var < 10000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        } else {
            if (var < 10000000) {
                if (var < 1000000) {
                    return 6;
                } else {
                    return 7;
                }
            } else {
                if (var < 100000000) {
                    return 8;
                } else {
                    if (var < 1000000000) {
                        return 9;
                    } else {
                        return 10;
                    }
                }
            }
        }
    }

    void payment() throws InterruptedException{
        String payDesc = "Yes";
        boolean flag = false;
        System.out.println("\n Are you sure to proceed for payment? (Yes/No): ");
        payDesc = bookIn.nextLine();
        switch(payDesc){
            case "Yes" : {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("\n Please Wait");
                for (int i =0; i<5; i++){
                    Thread.sleep(1000);
                    System.out.println(". ");
                }
                do {
                    System.out.println("\n\n Payment of your fare is inclusive of servicetax & charges!!\n ");
                    System.out.println("\n Please choose your Payment Mode (Enter a Number):\n  ");
                    System.out.println("1. Credit Card\n ");
                    System.out.println("2. Debit Card\n ");
                    System.out.println("3. Cheque\n ");
                    paymentMode = bookIn.nextInt();
                    switch(paymentMode){
                        case 1 :
                            System.out.println("\n Enter your Card Number : ");
                            cardNum = bookIn.nextLine();
                            System.out.println("\n Enter Expiry date (mm/yy): ");
                            cardExpiry = bookIn.nextLine();
                            System.out.println("\n Enter your CCV Number (three digit code shall be seen backside of your card) :");
                            ccv = bookIn.nextInt();
                            System.out.println("\n Please Enter the 6-digit OTP received on your Mobile: ");
                            otp = bookIn.nextInt();
                            int validOTP = otpValidate(otp);
                            if (validOTP == 6) {
                                System.out.println("\n Please Wait, while your Transaction is being processed! Please do not press back or refresh button!");
                                for (int i =0; i<5; i++){
                                    Thread.sleep(1000);
                                    System.out.println(". ");
                                }
                                System.out.println("\n\n Transaction Succesful!!!\n ");
                            } else {
                                System.out.println("\n OTP verification failed! Please restart the Transaction!!");
                                flag = true;
                            }
                        break;
                        case 2 :
                            System.out.println("\n Enter your Card Number : ");
                            cardNum = bookIn.nextLine();
                            System.out.println("\n Enter Expiry date (mm/yy): ");
                            cardExpiry = bookIn.nextLine();
                            System.out.println("\n Enter your CCV Number (three digit code shall be seen backside of your card) :");
                            ccv = bookIn.nextInt();
                            System.out.println("\n Please Enter the 6-digit OTP received on your Mobile: ");
                            otp = bookIn.nextInt();
                            validOTP = otpValidate(otp);
                            if (validOTP == 6) {
                                System.out.println("\n Please Wait, while your Transaction is being processed! Please do not press back or refresh button!");
                                for (int i =0; i<5; i++){
                                    Thread.sleep(1000);
                                    System.out.println(". ");
                                }
                                System.out.println("\n\n Transaction Succesful!!!\n ");
                                bookingStatus = true;
                            } else {
                            System.out.println("\n OTP verification failed! Please restart the Transaction!!");
                            flag = true;
                            bookingStatus = false;
                            }
                        break;
                        case 3 :
                            System.out.println("\n Please Credit the Payment Total towards Accoutn number : 111000000045855");
                            System.out.println("\n Cheque realisation is subjected to working pattern of Banks!!\n ");
                            System.out.println("\n Enter your Cheque number: ");
                            chequeNum = bookIn.nextLine();
                            while (chequeNum.isBlank() || chequeNum.length()<6) {
                                flag = true;
                                System.out.println("\n Enter a Valid Cheque number: ");
                                chequeNum = bookIn.nextLine();
                            }
                            bookingStatus = true;
                        break;
                        default : System.out.println("\n Payment Mode not Available. Please select from the List!! ");
                            flag = true;
                        break;
                    }         

                }while (flag!=true);
            }
            break;
            case "No" :
                System.out.println("\n Sorry! Booking Transaction cancelled!");
                bookingStatus = false;
                System.exit(1);
        }
    }

    void cancel(){

    }

    void display(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("\n\t Your Booking Details \n\n");
        System.out.println("\n Booking Number : "+bookingID);
        System.out.println("\n Booking Date : "+dateofbooking);
        System.out.println("\n Booking Time : "+timeofbooking);
        System.out.println("\n Name : "+custmr.custName);
        System.out.println("\n Customer ID : "+custID);
        System.out.println("\n Date of Birth : "+custmr.custDOB);
        System.out.println("\n Age : "+custmr.custAge);
        System.out.println("\n Address : "+custmr.custAddress);
        System.out.println("\n Phone : "+custmr.custPhone);
        System.out.println("\n Mail ID : "+custmr.custMail);
        System.out.println("\n Departure Destination : "+depDest);
        System.out.println("\n Departure Date : "+depDate);
    }

    void details() throws IOException {
        System.out.println("\n\t Welcome to bookmytrip.com! \t\n ");
        System.out.println("\n Proceed futher by selecting to Options Below \n\n");
        System.out.println("1. New Booking\n ");
        System.out.println("2. Cancel Booking\n ");
        System.out.println("3. Booking Status\n ");
        String prcd ="\n";
        Random randID = new Random();
        bookingID = x + randID.nextLong();
        custID = x + randID.nextLong();
        dateofbooking = LocalDate.now();
        timeofbooking = LocalTime.now();
        custmr.psngrDetails();
        System.out.println("\n Press Enter when ready to Select Destinations!");
        prcd = bookIn.nextLine();
        while (prcd == "\n") {
            destinations();
            tFareCalc();
            distance();
        }
    }
}

public class BookmyTrip implements Serializable {

    public static void main(String[] args) throws Exception {
        Booking newBooking =  new Booking();
        newBooking.details();
        final String filepath="D:\\abr.repo\\bookmytrip\\project.javafol\\CustomerDetails.txt";
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(newBooking);
            objectOut.close();
        } catch (Exception ioex) {
            System.out.println("\n An error occured while Writing to file!!");
            ioex.printStackTrace();
        }
    }
}
