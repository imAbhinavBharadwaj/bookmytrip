import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;

class Customer {
    String custName = "null";
    LocalDate custDOB;
    int custAge;
    String custGender;
    String custAddress = "null";
    String custPhone;
    String custMail;
    int noofadults;
    String adultName;
    int adultAge;
    int noofchild;
    String childName;
    int childAge;
    ArrayList<String> adultList = new ArrayList<String>(noofadults);
    ArrayList<Integer> adultAgeList = new ArrayList<Integer>(noofadults);
    ArrayList<String> childList = new ArrayList<String>(noofchild);
    ArrayList<Integer> childAgeList = new ArrayList<Integer>(noofchild);

    Scanner detIn = new Scanner(System.in);

    // function to get Adult Info
    void adultInfo() {
        System.out.println("\t  Enter the Name of Adult: "); adultName = detIn.nextLine();
        adultList.add(adultName);
        System.out.println("\t  Enter the Age of the Adult: "); adultAge = detIn.nextInt();
        adultAgeList.add(adultAge);
    }

    // function to get Child Info
    void childInfo() {
        System.out.println("\t  Enter the Name of Child: "); childName = detIn.nextLine();
        adultList.add(childName);
        System.out.println("\t  Enter the Age of the Child: "); childAge = detIn.nextInt();
        adultAgeList.add(childAge);
    }

    // function to get Customer and Passenger List
    void psngrDetails() {
        System.out.println("\n Enter your Name : ");
        custName = detIn.nextLine();
        System.out.println(" Enter D.O.B (dd/mm/yyyy) : ");
        String cinDOB = detIn.nextLine();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        if(null != cinDOB && cinDOB.trim().length() > 0){
            custDOB = LocalDate.parse(cinDOB,f);
        }
        System.out.println(" Enter your Age : "); custAge = detIn.nextInt();
        System.out.println(" Enter your Gender : "); custGender = detIn.nextLine();
        System.out.println(" Enter your Address : "); custAddress = detIn.nextLine();
        System.out.println(" Enter your Phone Number (please enter with country code): "); custPhone = detIn.nextLine();
        System.out.println(" Enter your Mail ID : "); custMail = detIn.nextLine();
        System.out.println(" Enter No. of Adults : "); noofadults = detIn.nextInt();
        System.out.println(" Enter No. of Childs : "); noofchild = detIn.nextInt();

        // Loop to enter Adults Details
        System.out.println("\n\t Enter Adult Details");
        for (int i=0; i<noofadults; i++){
            adultInfo();
        }

        //Loop to enter Children Details
        System.out.println("\n\t Enter Child Details");
        for (int j=0; j<noofchild; j++){
            childInfo();
        }
        detIn.close();
    }
};

class Booking {
    long bookingID;
    long custID;
    long mills = System.currentTimeMillis();
    LocalDate dateofbooking;
    LocalTime timeofbooking;
    final long x= 99999;
    String travelMode;
    float busFare;
    float trainFare;
    float flightFare;
    float fareTotal;
    float tripDist;
    String depDest;
    String arrDest;
    String depDate;
    String descision;
    int hotelChoice;
    String hotelName;
    float hotelCharge;
    int paymentMode;
    String cardNum;
    String cardExpiry;
    int ccv;
    int otp;
    String chequeNum;
    boolean bookingStatus;

    Customer custmr;
    
    Scanner bookIn = new Scanner(System.in);
    
    Booking() {
    }

    float busFareCalc() {
        if(depDest.equalsIgnoreCase("Chennai"))
            {
                if(arrDest.equals("New Delhi"))
                    busFare=custmr.noofadults*5000+custmr.noofchild*2500;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                    busFare=custmr.noofadults*4250+custmr.noofchild*2125;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                    busFare=custmr.noofadults*3000+custmr.noofchild*1500;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                    busFare=custmr.noofadults*2250+custmr.noofchild*1125;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                    busFare=custmr.noofadults*1250+custmr.noofchild*925;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                    busFare=custmr.noofadults*2250+custmr.noofchild*1025;
            }
            else if(depDest.equalsIgnoreCase("New Delhi"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*5000+custmr.noofchild*2500;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*4250+custmr.noofchild*2000;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*3050+custmr.noofchild*1125;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*3250+custmr.noofchild*1525;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*8250+custmr.noofchild*4125;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*3750+custmr.noofchild*2205;	 }
            else if(depDest.equalsIgnoreCase("Mumbai"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*4250+custmr.noofchild*2125;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*2250+custmr.noofchild*1025;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*3550+custmr.noofchild*1775;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*4000+custmr.noofchild*2000;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*4500+custmr.noofchild*2500;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*4550+custmr.noofchild*2500;	 }
            else if(depDest.equalsIgnoreCase("Kolkata"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*5750+custmr.noofchild*2875;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*3250+custmr.noofchild*1625;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*3800+custmr.noofchild*1900;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*5550+custmr.noofchild*2775;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*7250+custmr.noofchild*3625;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*4850+custmr.noofchild*2425;	 }
            else if(depDest.equalsIgnoreCase("Bangalore"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*2500+custmr.noofchild*1250;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*3250+custmr.noofchild*1525;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*4200+custmr.noofchild*2100;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*5550+custmr.noofchild*2775;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*2750+custmr.noofchild*1400;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*2000+custmr.noofchild*1100;	 }
            else if(depDest.equalsIgnoreCase("Trivandrum"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*3250+custmr.noofchild*1625;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*8250+custmr.noofchild*4125;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*4850+custmr.noofchild*2450;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*7250+custmr.noofchild*3625;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*2750+custmr.noofchild*1400;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                busFare=custmr.noofadults*3000+custmr.noofchild*1750;	 }
            else if(depDest.equalsIgnoreCase("Hyderabad"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                busFare=custmr.noofadults*2250+custmr.noofchild*1025;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                busFare=custmr.noofadults*3750+custmr.noofchild*2205;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                busFare=custmr.noofadults*4550+custmr.noofchild*2500;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                busFare=custmr.noofadults*4850+custmr.noofchild*2425;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                busFare=custmr.noofadults*2000+custmr.noofchild*1100;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                busFare=custmr.noofadults*3000+custmr.noofchild*1750;	 }
            return busFare;
    }

    float trainFareCalc(){
        busFareCalc();
        trainFare=busFare*3;
        return trainFare;
    }

    float flightFareCalc(){
        busFareCalc();
        flightFare=busFare*5;
        return flightFare;
    }

    void tFareCalc(){
        boolean flag = false;
        do {
            switch (travelMode) {
                case "Bus":
                    busFareCalc();
                    fareTotal = busFare + hotelCharge;
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

    void distance(){
        if(depDest.equalsIgnoreCase("Chennai"))
            { if(arrDest.equalsIgnoreCase("New Delhi"))
                    tripDist=2157;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                    tripDist=1367;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                    tripDist=1678;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                    tripDist=334;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                    tripDist=790;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                    tripDist=704;}
            else if(depDest.equalsIgnoreCase("New Delhi"))
            { if(depDest.equalsIgnoreCase("Chennai"))
                    tripDist=2157;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                    tripDist=1408;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                    tripDist=1442;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                    tripDist=2019;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                    tripDist=2780;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                    tripDist=1453; }
            else if(depDest.equalsIgnoreCase("Mumbai"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                    tripDist=1367;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                    tripDist=1408;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                    tripDist=2081;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                    tripDist=1033;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                    tripDist=1568;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                    tripDist=739; }
            else if(depDest.equalsIgnoreCase("Kolkata"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                    tripDist=1678;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                    tripDist=1442;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                    tripDist=2081;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                    tripDist=1883;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                    tripDist=2468;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                    tripDist=1516; }
            else if(depDest.equalsIgnoreCase("Bangalore"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                    tripDist=334;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                    tripDist=2019;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                    tripDist=1033;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                    tripDist=1883;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                    tripDist=761;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                    tripDist=566; }
            else if(depDest.equalsIgnoreCase("Trivandrum"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                    tripDist=790;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                    tripDist=2780;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                    tripDist=1568;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                    tripDist=2468;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                    tripDist=761;
                else if(arrDest.equalsIgnoreCase("Hyderabad"))
                    tripDist=1327; }
            else if(depDest.equalsIgnoreCase("Hyderabad"))
            { if(arrDest.equalsIgnoreCase("Chennai"))
                tripDist=704;
                else if(arrDest.equalsIgnoreCase("New Delhi"))
                tripDist=1453;
                else if(arrDest.equalsIgnoreCase("Mumbai"))
                tripDist=739;
                else if(arrDest.equalsIgnoreCase("Kolkata"))
                tripDist=1516;
                else if(arrDest.equalsIgnoreCase("Bangalore"))
                tripDist=566;
                else if(arrDest.equalsIgnoreCase("Trivandrum"))
                tripDist=1327; }
    }

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

    public void main(String[] args) throws Exception {
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
