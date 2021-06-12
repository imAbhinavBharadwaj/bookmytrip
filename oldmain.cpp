# include <iostream.h>
# include <graphics.h>
# include <process.h>
# include <string.h>
# include <stdlib.h>
# include <stdio.h>
# include <conio.h>
# include <time.h>
# include <dos.h>
const int x=99999;
class customer
{ char adult_name[50];
  char child_name[50];
  int adult_age;
  int child_age;
 public:
  void adult_det()
  { cout<<"\t  Enter the Name of Adult: "; gets(adult_name);
    cout<<"\t  Enter the Age of the Adult: "; cin>>adult_age;  }
  void child_det()
  { cout<<"\t  Enter the Name of Child: "; gets(child_name);
    cout<<"\t  Enter the Age of Child: "; cin>>child_age;     }
  void adult_dis()
  { cout<<"\n\t Name: "<<adult_name<<"\t Age: "<<adult_age; }
  void child_dis()
  { cout<<"\n\t Name: "<<child_name<<"\t Age: "<<child_age; }
}cuss[20];
class booking
{ long booking_no;
  char datebuf[10];
  char timebuf[10];
  int busfare,trainfare,flightfare;
  int total_fare;
  int travel_distance;
  int des1,des2,des3;
  char desc1[5],desc2[5],desc3[5];
  char customer_name[50];
  char customer_dob[10];
  int customer_age;
  char customer_gender[50];
  char customer_address[50];
  char customer_phone[50];
  char customer_mailid[50];
  char depature_date[10];
  char dep_destination[50];
  int dep_dest;
  char arr_destination[50];
  int arr_dest;
  int no_of_adults,no_of_child;
  char hotel_name[50];
  int hotel_no;
  int hotel_charge;
  int payment_mode;
  char travel_mode[10];
  int travel_des;
  char expiry_date[50];
  char card_no[50],cheque_no[15],ccv_no[3];
 public:
  booking();
  int bus_fare();
  int train_fare();
  int flight_fare();
  void fare();
  void distance();
  void destinations();
  void hotel();
  void display();
  void payment();
  void details();
}book;
void booking::booking()
{ booking_no=0;
  strcpy(datebuf,"NULL");
  strcpy(timebuf,"NULL");
  busfare=0;
  trainfare=0;
  flightfare=0;
  total_fare=0;
  travel_distance=0;
  des1=0;
  des2=0;
  des3=0;
  strcpy(desc1,"NULL");
  strcpy(desc2,"NULL");
  strcpy(desc3,"NULL");
  strcpy(customer_name,"NULL");
  strcpy(customer_dob,"NULL");
  customer_age=0;
  strcpy(customer_gender,"NULL");
  strcpy(customer_address,"NULL");
  strcpy(customer_phone,"NULL");
  strcpy(customer_mailid,"NULL");
  strcpy(depature_date,"NULL");
  strcpy(dep_destination,"NULL");
  dep_dest=0;
  strcpy(arr_destination,"NULL");
  arr_dest=0;
  no_of_adults=0;
  no_of_child=0;
  strcpy(hotel_name,"NULL");
  hotel_no=0;
  hotel_charge=0;
  payment_mode=0;
  strcpy(travel_mode,"NULL");
  travel_des=0;
  strcpy(expiry_date,"NULL");
  strcpy(card_no,"NULL");
  strcpy(cheque_no,"NULL");
  strcpy(ccv_no,"NULL");
}
int booking::bus_fare()
{ if(strcmp(dep_destination,"Chennai")==0)
  { if(strcmp(arr_destination,"New Delhi")==0)
       busfare=no_of_adults*5000+no_of_child*2500;
    else if(strcmp(arr_destination,"Mumbai")==0)
       busfare=no_of_adults*4250+no_of_child*2125;
    else if(strcmp(arr_destination,"Kolkata")==0)
       busfare=no_of_adults*3000+no_of_child*1500;
    else if(strcmp(arr_destination,"Bangalore")==0)
       busfare=no_of_adults*2250+no_of_child*1125;
    else if(strcmp(arr_destination,"Trivandrum")==0)
       busfare=no_of_adults*1250+no_of_child*925;
    else if(strcmp(arr_destination,"Hyderabad")==0)
       busfare=no_of_adults*2250+no_of_child*1025;	 }
  else if(strcmp(dep_destination,"New Delhi")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
       busfare=no_of_adults*5000+no_of_child*2500;
    else if(strcmp(arr_destination,"Mumbai")==0)
       busfare=no_of_adults*4250+no_of_child*2000;
    else if(strcmp(arr_destination,"Kolkata")==0)
       busfare=no_of_adults*3050+no_of_child*1125;
    else if(strcmp(arr_destination,"Bangalore")==0)
       busfare=no_of_adults*3250+no_of_child*1525;
    else if(strcmp(arr_destination,"Trivandrum")==0)
       busfare=no_of_adults*8250+no_of_child*4125;
    else if(strcmp(arr_destination,"Hyderabad")==0)
       busfare=no_of_adults*3750+no_of_child*2205;	 }
  else if(strcmp(dep_destination,"Mumbai")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
       busfare=no_of_adults*4250+no_of_child*2125;
    else if(strcmp(arr_destination,"New Delhi")==0)
       busfare=no_of_adults*2250+no_of_child*1025;
    else if(strcmp(arr_destination,"Kolkata")==0)
       busfare=no_of_adults*3550+no_of_child*1775;
    else if(strcmp(arr_destination,"Bangalore")==0)
       busfare=no_of_adults*4000+no_of_child*2000;
    else if(strcmp(arr_destination,"Trivandrum")==0)
       busfare=no_of_adults*4500+no_of_child*2500;
    else if(strcmp(arr_destination,"Hyderabad")==0)
       busfare=no_of_adults*4550+no_of_child*2500;	 }
  else if(strcmp(dep_destination,"Kolkata")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
       busfare=no_of_adults*5750+no_of_child*2875;
    else if(strcmp(arr_destination,"New Delhi")==0)
       busfare=no_of_adults*3250+no_of_child*1625;
    else if(strcmp(arr_destination,"Mumbai")==0)
       busfare=no_of_adults*3800+no_of_child*1900;
    else if(strcmp(arr_destination,"Bangalore")==0)
       busfare=no_of_adults*5550+no_of_child*2775;
    else if(strcmp(arr_destination,"Trivandrum")==0)
       busfare=no_of_adults*7250+no_of_child*3625;
    else if(strcmp(arr_destination,"Hyderabad")==0)
       busfare=no_of_adults*4850+no_of_child*2425;	 }
  else if(strcmp(dep_destination,"Bangalore")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
       busfare=no_of_adults*2500+no_of_child*1250;
    else if(strcmp(arr_destination,"New Delhi")==0)
       busfare=no_of_adults*3250+no_of_child*1525;
    else if(strcmp(arr_destination,"Mumbai")==0)
       busfare=no_of_adults*4200+no_of_child*2100;
    else if(strcmp(arr_destination,"Kolkata")==0)
       busfare=no_of_adults*5550+no_of_child*2775;
    else if(strcmp(arr_destination,"Trivandrum")==0)
       busfare=no_of_adults*2750+no_of_child*1400;
    else if(strcmp(arr_destination,"Hyderabad")==0)
       busfare=no_of_adults*2000+no_of_child*1100;	 }
  else if(strcmp(dep_destination,"Trivandrum")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
       busfare=no_of_adults*3250+no_of_child*1625;
    else if(strcmp(arr_destination,"New Delhi")==0)
       busfare=no_of_adults*8250+no_of_child*4125;
    else if(strcmp(arr_destination,"Mumbai")==0)
       busfare=no_of_adults*4850+no_of_child*2450;
    else if(strcmp(arr_destination,"Kolkata")==0)
       busfare=no_of_adults*7250+no_of_child*3625;
    else if(strcmp(arr_destination,"Bangalore")==0)
       busfare=no_of_adults*2750+no_of_child*1400;
    else if(strcmp(arr_destination,"Hyderabad")==0)
       busfare=no_of_adults*3000+no_of_child*1750;	 }
  else if(strcmp(dep_destination,"Hyderabad")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
       busfare=no_of_adults*2250+no_of_child*1025;
    else if(strcmp(arr_destination,"New Delhi")==0)
       busfare=no_of_adults*3750+no_of_child*2205;
    else if(strcmp(arr_destination,"Mumbai")==0)
       busfare=no_of_adults*4550+no_of_child*2500;
    else if(strcmp(arr_destination,"Kolkata")==0)
       busfare=no_of_adults*4850+no_of_child*2425;
    else if(strcmp(arr_destination,"Bangalore")==0)
       busfare=no_of_adults*2000+no_of_child*1100;
    else if(strcmp(arr_destination,"Trivandrum")==0)
       busfare=no_of_adults*3000+no_of_child*1750;	 }
 return busfare;
}
int booking::train_fare()
{ bus_fare();
  trainfare=busfare*3;
  return trainfare; }
int booking::flight_fare()
{ bus_fare();
  flightfare=busfare*5;
  return flightfare; }
void booking::fare()
{ if(strcmp(travel_mode,"Bus")==0)
  {   bus_fare();
      total_fare=busfare+hotel_charge;  }
  else if(strcmp(travel_mode,"Train")==0)
  {   train_fare();
      total_fare=trainfare+hotel_charge; }
  else if(strcmp(travel_mode,"Flight")==0)
  {   flight_fare();
      total_fare=flightfare+hotel_charge; }
}
void booking::distance()
{ if(strcmp(dep_destination,"Chennai")==0)
  { if(strcmp(arr_destination,"New Delhi")==0)
      travel_distance=2157;
    else if(strcmp(arr_destination,"Mumbai")==0)
      travel_distance=1367;
    else if(strcmp(arr_destination,"Kolkata")==0)
      travel_distance=1678;
    else if(strcmp(arr_destination,"Bangalore")==0)
      travel_distance=334;
    else if(strcmp(arr_destination,"Trivandrum")==0)
      travel_distance=790;
    else if(strcmp(arr_destination,"Hyderabad")==0)
      travel_distance=704; }
  else if(strcmp(dep_destination,"New Delhi")==0)
  { if(strcmp(dep_destination,"Chennai")==0)
      travel_distance=2157;
    else if(strcmp(arr_destination,"Mumbai")==0)
      travel_distance=1408;
    else if(strcmp(arr_destination,"Kolkata")==0)
      travel_distance=1442;
    else if(strcmp(arr_destination,"Bangalore")==0)
      travel_distance=2019;
    else if(strcmp(arr_destination,"Trivandrum")==0)
      travel_distance=2780;
    else if(strcmp(arr_destination,"Hyderabad")==0)
      travel_distance=1453; }
  else if(strcmp(dep_destination,"Mumbai")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
      travel_distance=1367;
    else if(strcmp(arr_destination,"New Delhi")==0)
      travel_distance=1408;
    else if(strcmp(arr_destination,"Kolkata")==0)
      travel_distance=2081;
    else if(strcmp(arr_destination,"Bangalore")==0)
      travel_distance=1033;
    else if(strcmp(arr_destination,"Trivandrum")==0)
      travel_distance=1568;
    else if(strcmp(arr_destination,"Hyderabad")==0)
      travel_distance=739; }
  else if(strcmp(dep_destination,"Kolkata")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
      travel_distance=1678;
    else if(strcmp(arr_destination,"New Delhi")==0)
      travel_distance=1442;
    else if(strcmp(arr_destination,"Mumbai")==0)
      travel_distance=2081;
    else if(strcmp(arr_destination,"Bangalore")==0)
      travel_distance=1883;
    else if(strcmp(arr_destination,"Trivandrum")==0)
      travel_distance=2468;
    else if(strcmp(arr_destination,"Hyderabad")==0)
      travel_distance=1516; }
  else if(strcmp(dep_destination,"Bangalore")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
      travel_distance=334;
    else if(strcmp(arr_destination,"New Delhi")==0)
      travel_distance=2019;
    else if(strcmp(arr_destination,"Mumbai")==0)
      travel_distance=1033;
    else if(strcmp(arr_destination,"Kolkata")==0)
      travel_distance=1883;
    else if(strcmp(arr_destination,"Trivandrum")==0)
      travel_distance=761;
    else if(strcmp(arr_destination,"Hyderabad")==0)
      travel_distance=566; }
  else if(strcmp(dep_destination,"Trivandrum")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
      travel_distance=790;
    else if(strcmp(arr_destination,"New Delhi")==0)
      travel_distance=2780;
    else if(strcmp(arr_destination,"Mumbai")==0)
      travel_distance=1568;
    else if(strcmp(arr_destination,"Kolkata")==0)
      travel_distance=2468;
    else if(strcmp(arr_destination,"Bangalore")==0)
      travel_distance=761;
    else if(strcmp(arr_destination,"Hyderabad")==0)
      travel_distance=1327; }
  else if(strcmp(dep_destination,"Hyderabad")==0)
  { if(strcmp(arr_destination,"Chennai")==0)
      travel_distance=704;
    else if(strcmp(arr_destination,"New Delhi")==0)
      travel_distance=1453;
    else if(strcmp(arr_destination,"Mumbai")==0)
      travel_distance=739;
    else if(strcmp(arr_destination,"Kolkata")==0)
      travel_distance=1516;
    else if(strcmp(arr_destination,"Bangalore")==0)
      travel_distance=566;
    else if(strcmp(arr_destination,"Trivandrum")==0)
      travel_distance=1327; }
}
void booking::destinations()
{ clrscr();
  textcolor(2);
  cout<<"\n The following Destination Packages are available:\n ";
  cout<<"\t\t 1.Chennai.\n ";
  cout<<"\t\t 2.New Delhi.\n ";
  cout<<"\t\t 3.Mumbai.\n ";
  cout<<"\t\t 4.Kolkata.\n ";
  cout<<"\t\t 5.Bangalore.\n ";
  cout<<"\t\t 6.Trivandrum.\n ";
  cout<<"\t\t 7.Hyderabad.\n ";
  cout<<"\n Following Tavel Modes are available:\n ";
  cout<<"\t\t 1.Bus.\n ";
  cout<<"\t\t 2.Train.\n ";
  cout<<"\t\t 3.Flight.\n ";
  cout<<"\n Enter your Depature Destination: "; cin>>dep_dest;
  switch(dep_dest)
  { case 1: strcpy(dep_destination,"Chennai"); break;
    case 2: strcpy(dep_destination,"New Delhi"); break;
    case 3: strcpy(dep_destination,"Mumbai"); break;
    case 4: strcpy(dep_destination,"Kolkata"); break;
    case 5: strcpy(dep_destination,"Bangalore"); break;
    case 6: strcpy(dep_destination,"Trivandrum"); break;
    case 7: strcpy(dep_destination,"Hyderabad"); break;
    default: cout<<"\n Your Option is not available in our package!! "; exit(0);
  }
  cout<<"\n Enter your Depature Date (dd/mm/yyyy): "; gets(depature_date);
  cout<<"\n Enter your Arrival Destination: "; cin>>arr_dest;
  switch(arr_dest)
  { case 1: strcpy(arr_destination,"Chennai"); break;
    case 2: strcpy(arr_destination,"New Delhi"); break;
    case 3: strcpy(arr_destination,"Mumbai"); break;
    case 4: strcpy(arr_destination,"Kolkata"); break;
    case 5: strcpy(arr_destination,"Bangalore"); break;
    case 6: strcpy(arr_destination,"Trivandrum"); break;
    case 7: strcpy(arr_destination,"Hyderabad"); break;
    default: cout<<"\n Your Option is not available in our package!! "; exit(0);
  }
  cout<<"\n Enter your Travel Mode: "; cin>>travel_des;
  switch(travel_des)
  { case 1: strcpy(travel_mode,"Bus"); hotel();
    case 2: strcpy(travel_mode,"Train"); hotel();
    case 3: strcpy(travel_mode,"Flight"); hotel();
    default : cout<<"\n Your exepected travel mode is not available!!";
  }
}
void booking::hotel()
{ cout<<"\n Do you want to book hotel?(1-Yes/2-No): "; cin>>des2;
  switch(des2)
  { case 1: strcpy(desc2,"Yes");
	    { if(customer_age>=18)
		 no_of_adults+=1;
	      else
		 no_of_child+=1;   }
	    clrscr();
	    cout<<"\n\t\t\t\t List of Hotels \n ";
	    cout<<"\n\t|----------------------------------------------------------------|";
	    cout<<"\n\t|  S.No.  |     HOTEL NAME     |  ADULT CHARGE  |  CHILD CHARGE  |";
	    cout<<"\n\t|----------------------------------------------------------------|";
	    cout<<"\n\t|    1    |   Grande de Royal  |    Rs.5000     |    Rs.2850     |";
	    cout<<"\n\t|    2    |  Le Royal Meridein |    Rs.6500     |    Rs.3250     |";
	    cout<<"\n\t|    3    |   Surat Red Fort   |    Rs.7250     |    Rs.3500     |";
	    cout<<"\n\t|    4    |   Taj Coramandel   |    Rs.7000     |    Rs.3750     |";
	    cout<<"\n\t|    5    |     Sapthagirri    |    Rs.8500     |    Rs.4400     |";
	    cout<<"\n\t|_________|____________________|________________|________________|";
	    cout<<"\n\n\t Enter your Hotel choice: "; cin>>hotel_no;
	    switch(hotel_no)
	    { case 1: strcpy(hotel_name,"Grande de Royal");
		      hotel_charge=no_of_adults*5000+no_of_child*2850;
		      break;
	      case 2: strcpy(hotel_name,"Le Royal Meridein");
		      hotel_charge=no_of_adults*6500+no_of_child*3250;
		      break;
	      case 3: strcpy(hotel_name,"Surat Red Fort");
		      hotel_charge=no_of_adults*7250+no_of_child*3500;
		      break;
	      case 4: strcpy(hotel_name,"Taj Coramandel");
		      hotel_charge=no_of_adults*7000+no_of_child*3750;
		      break;
	      case 5: strcpy(hotel_name,"Sapthagirri");
		      hotel_charge=no_of_adults*8500+no_of_child*4400;
		      break;
	      default: cout<<"\n Sorry we don't have contact with the hotel you have entered!!! \n ";
		       break;
	    }
	    display();
	    break;
    case 2: strcpy(desc2,"No");
	    display();
	    break;
    default: display(); break;
  }
}
void booking::payment()
{ textcolor(10);
  cout<<"\n Are you sure to proceed for payment?(1-Yes/2-No): "; cin>>des3;
  switch(des3)
  { case 1:{ clrscr();
	     cout<<"\n Please wait";
	     for(int i=0;i<5;++i)
	     { delay(1000); cout<<". "; }
	     cout<<"\n\n Payment of your fare is inclusive of servicetax & charges!!\n ";
	     cout<<"\n Please choose your Payment Mode:\n  ";
	     cout<<"1.Credit Card\n  ";
	     cout<<"2.Debit Card\n  ";
	     cout<<"3.Cheque\n\n  "; cin>>payment_mode;
	     switch(payment_mode)
	     { case 1: cout<<"\n Enter your Card no.: "; gets(card_no);
		       cout<<"\n Enter your Cards Expiry date(mm/yy): "; gets(expiry_date);
		       cout<<"\n Enter your CCV no. (three digit code seen backside of your card): "; gets(ccv_no);
		       cout<<"\n\n Please wait while we are processing your transaction ";
		       for(int i=0;i<5;++i)
		       { delay(1000); cout<<". "; }
		       cout<<"\n\n Transaction Succesful!!!\n ";
		       break;
	       case 2: cout<<"\n Enter your Card no.: "; gets(card_no);
		       cout<<"\n Enter your Cards Expiry date(mm/yy): "; gets(expiry_date);
		       cout<<"\n Enter your CCV no. (three digit code seen backside of your card): "; gets(ccv_no);
		       cout<<"\n Please wait while we are processing your transaction ";
		       for(int j=0;j<5;++j)
		       { delay(1000); cout<<". "; }
		       cout<<"\n\n Transaction Succesful!!!\n ";
		       break;
	       case 3: cout<<"\n Please debit fare amount to this account no.: 111000000045855 \n ";
		       cout<<"\n Enter your Cheque no: "; gets(cheque_no);
		       cout<<"\n Cheque realisation is subjected to working pattern of Banks!!\n ";
		       break;
	       default: exit(0);
	     }
	     cout<<"\n You will receive a message about your booking details!!\n ";
	     cout<<"\n Thanks for booking at our agency!! Have a Happy Journey!! Book again!!\n ";
	   }
    case 2: exit(0);
  }
}
void booking::display()
{ clrscr();
  textcolor(10);
  cout<<"\n Your Booking Details:\n ";
  cout<<"\n Booking Number: "<<booking_no;
  cout<<"\n Booking Date: "<<datebuf;
  cout<<"\n Booking Time: "<<timebuf;
  cout<<"\n Name: "<<customer_name;
  cout<<"\n D.O.B.: "<<customer_dob;
  cout<<"\n Age: "<<customer_age;
  cout<<"\n Adderss: "<<customer_address;
  cout<<"\n Phone: +91"<<customer_phone;
  cout<<"\n Mail ID: "<<customer_mailid;
  cout<<"\n Depature Destination: "<<dep_destination;
  cout<<"\n Depature Date: "<<depature_date;
  cout<<"\n Arrival Destination: "<<arr_destination;
  cout<<"\n Travel Mode: "<<travel_mode;
  cout<<"\n Travel Distance: "<<travel_distance<<" kms ";
  if(customer_age>=18)
  { cout<<"\n No. of Adults: "<<no_of_adults;
    cout<<"\n\t Name: "<<customer_name<<"\t Age: "<<customer_age;
    for(int i=0;i<no_of_adults-1;++i)
      cuss[i].adult_dis();   }
  else
  { cout<<"\n No. of Adults: "<<no_of_adults;
    for(int i=0;i<no_of_adults;++i)
      cuss[i].adult_dis();  }
  if(customer_age<18)
  { cout<<"\n No.of Childs: "<<no_of_child;
    cout<<"\n\t Name: "<<customer_age<<"\t Age: "<<customer_age;
    for(int j=0;j<no_of_child;++j)
     cuss[j].child_dis(); }
  else
  { cout<<"\n No. of Childs: "<<no_of_child;
    for(int j=0;j<no_of_child;++j)
     cuss[j].child_dis(); }
  if(strcmp(desc2,"Yes")==0||strcmp(desc2,"yes")==0)
  { cout<<"\n Hotel Name: "<<hotel_name;
    cout<<"\n Hotel Charges: "<<hotel_charge;  }
  if(strcmp(travel_mode,"Bus")==0)
   cout<<"\n Total Fare: "<<total_fare<<"\n ";
  else if(strcmp(travel_mode,"Train")==0)
   cout<<"\n Total Fare: "<<total_fare<<"\n ";
  else if(strcmp(travel_mode,"Flight")==0)
   cout<<"\n Total Fare: "<<total_fare<<"\n ";
  payment();
}
void booking::details()
{ textcolor(11);
  cout<<"\n\t Welcome to bookmytrip.com! \t\n ";
  randomize();
  booking_no=random(x+100000);
  _strdate(datebuf);
  _strtime(timebuf);
  cout<<"\n Enter your Travel Details:\n";
  cout<<" Enter your Name: "; gets(customer_name);
  cout<<" Enter you D.O.B. (dd/mm/yy): "; gets(customer_dob);
  cout<<" Enter your Age: "; cin>>customer_age;
  cout<<" Enter your Gender: "; gets(customer_gender);
  cout<<" Enter your Address: "; gets(customer_address);
  cout<<" Enter your Phone no.: +91"; gets(customer_phone);
  cout<<" Enter your Mail ID: "; gets(customer_mailid);
  cout<<" Enter No. of Adults: "; cin>>no_of_adults;
  for(int i=0;i<no_of_adults;++i)
    cuss[i].adult_det();
  cout<<" Enter No. of Childs: "; cin>>no_of_child;
  for(int j=0;j<no_of_child;++j)
    cuss[j].child_det();
  cout<<"\n Sure to proceed to Select Destinations?(1-Yes/2-No): "; cin>>des1;
  switch(des1)
  { case 1: destinations();
	    fare();
	    distance();
    case 2: exit(0);
  }
}
void main()
{ clrscr();
  book.details();
  getch();
}