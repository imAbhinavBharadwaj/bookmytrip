package main.BookmyTrip.datahandler;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class Customer {
    
    public String custName = "null";
    public LocalDate custDOB;
    public int custAge;
    public String custGender;
    public String custAddress = "null";
    public String custPhone;
    public String custMail;
    public int noofadults;
    public String adultName;
    public int adultAge;
    public int noofchild;
    public String childName;
    public int childAge;
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

    public Customer() {

    }
};
