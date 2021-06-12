import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

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
    String childName;
    int childAge;
    ArrayList<String> adultList = new ArrayList<String>(noofadults);
    ArrayList<Integer> adultAgeList = new ArrayList<Integer>(noofadults);
    int noofchild;
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
        System.out.println(" Enter D.O.B (dd/mm/yyyy): ");
        String cinDOB = detIn.nextLine();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        if(null != cinDOB && cinDOB.trim().length() > 0){
            custDOB = LocalDate.parse(cinDOB,f);
        }
        System.out.println(" Enter your Age: "); custAge = detIn.nextInt();
        System.out.println(" Enter your Gender: "); custGender = detIn.nextLine();
        System.out.println(" Enter your Address: "); custAddress = detIn.nextLine();
        System.out.println(" Enter your Phone no.: +91"); custPhone = detIn.nextLine();
        System.out.println(" Enter your Mail ID: "); custMail = detIn.nextLine();
        System.out.println(" Enter No. of Adults: "); noofadults = detIn.nextInt();
        System.out.println(" Enter No. of Childs: "); noofchild = detIn.nextInt();

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
    long mills = System.currentTimeMillis();
    LocalDate dateofbooking;
    LocalTime timeofbooking;
    final long x= 99999;
    String travelMode = "null";
    float busFare;
    float trainFare;
    float flightFare;
    float fareTotal;
    float tripDist;
    String depDest = "null";
    String arrDest = "null";
    String descision = "null";
    String hotelName = "null";
    float hotelCharge;
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
            System.out.println("\n Following Travel Modes are available:\n ");
            System.out.println("\t\t 1.Bus.\n ");
            System.out.println("\t\t 2.Train.\n ");
            System.out.println("\t\t 3.Flight.\n ");
            travelMode = bookIn.nextLine();
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
                    System.out.println("\n Not among the Listed!! Please select from above!!");
                    flag = true;
                    break;
            }
        }while(flag!=false);
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
        Scanner destInput = new Scanner(System.in);
        Scanner modeInput = new Scanner(System.in);
        System.out.println("\n The following Destination Packages are available:\n ");
        System.out.println("\t\t 1.Chennai.\n ");
        System.out.println("\t\t 2.New Delhi.\n ");
        System.out.println("\t\t 3.Mumbai.\n ");
        System.out.println("\t\t 4.Kolkata.\n ");
        System.out.println("\t\t 5.Bangalore.\n ");
        System.out.println("\t\t 6.Trivandrum.\n ");
        System.out.println("\t\t 7.Hyderabad.\n ");
        System.out.println("\n Enter your Depature Destination: ");
        depDest = destInput.nextLine();
        destInput.close();
        modeInput.close();
    }
    void hotel(){
        

    }
    void display(){

    }
    void payment(){

    }
    void details(){
        System.out.println("\n\t Welcome to bookmytrip.com! \t\n ");
        Random randID = new Random();
        bookingID = x + randID.nextLong();
        dateofbooking = LocalDate.now();
        timeofbooking = LocalTime.now();
        custmr.psngrDetails();
    }
    void cancel(){

    }
}

public class BookmyTrip {
    public static void main(String[] args) throws Exception {

    }
}
