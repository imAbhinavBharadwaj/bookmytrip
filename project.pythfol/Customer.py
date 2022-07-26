import csv
import time
from datetime import date

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
    childList = []

    def adultInfo() :
        adultList = []
        adultAgeList = []
        adultName = str(input("\n Enter Name of the Adult : "))
        adultList.append(adultName)
        adultAge = int(input("\n Enter Age of the Adult : "))
        adultAgeList.append(adultAge)
    
    def childInfo() :
        childList = []
        childAgeList = []
        childName = str(input("\n Enter Name of the Child : "))
        childList.append(childName)
        childAge = int(input("\n Enter Age of the Child : "))
        childAgeList.append(childAge)