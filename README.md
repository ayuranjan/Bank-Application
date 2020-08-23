# Bank-Application
Created a banking application in Java to manage customer inventories along with various financial instruments such as interests and savings.

We Read a csv file of name , social security number (ssn) , account type and initial deposit and store them . There are 2 types of account - saving and checking which share some common features and some specific  feautures . Both account will use an interface that determines the interest rate.



* Read a csv file of name , social security number (ssn) , account type and initial deposit .
* Use a proper data structure to hold all these account .
* Both saving and checking share following property : -  1. deposit() 2.withdraw()  3. show_info()
* 11 Digit Account Number - Starting with 1 /2 depending on saving/ checking , last 2 digit of SSN , unique 5 digit , random 3 digit no .
* Saving Account Holder are given a safety deposit Box , identified by 3 digit number & acccesed by 4digit code .
* Coding Account Holder are assigned Debit Card with 12 digit no & 4 digit PIN. 
* Saving Account will use 0.25 points less than base rate .
* Checking Account will use 15% of the base rate 
* Show_info should reveal account information as well as information specific to specific account type .
