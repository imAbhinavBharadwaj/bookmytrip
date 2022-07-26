import csv
import time
from datetime import date

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