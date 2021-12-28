import math
import csv
from datetime import date
import time

class Customer :
    custID = 0
    custName = "null"
    custAge = 0
    custAddress = "null"
    custPhone = "null"
    custMail = "null"
    custDoB = "null"
    custGender = "null"
    custPhone = "null"
    noofadults = 0
    adultName = "null"
    adultAge = 0
    noofchild = 0
    childName = "null"
    childAge = "null"
    adultList = []
    childList = []

class Booking :
    bookingID = 0
    dateofbooking = date.today()
    timeofbooking = time.localtime()
    x = 999999
    travelMode = "null"
    busFare = 0.0
    trainFare = 0.0
    flightFare = 0.0
    fareTotal = 0.0
    tripDist = 0.0
    depDest = "null"
    arrDest = "null"
    depDate = date