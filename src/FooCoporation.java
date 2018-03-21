/*
 * created by Mohamed Khalefa
 * MIT Open Courseware
 * Intro to Programming in Java
 *
 * Assignment 2: FooCorporation
 * Calculates pay of employees.
 *
 * Assignments can be found at the following link:
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */


public class FooCoporation {

    // This method will take two doubles, basePay and hoursWorked, as inputs.
    // The method will determine how much to pay an employee based on their hours worked and base pay.
    // The method will throw errors if the employee has worked over 60 hours or if the base pay is below 8.00.
    // For any hours worked over 40 hours, the employee gets payed at 1.5 times base pay.

    public static void gettingPayed(int basePay, double hoursWorked) {
        double totalPay = 0; // variable to hold total pay
// to check if hours worked less tha 40
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
        }
        // to check if employee worked over 40 hours
        else if (hoursWorked > 40) {
            double hoursOver40 = hoursWorked - 40;
            double earnings = 0;
            earnings = 40 * basePay + (hoursOver40 * (basePay * 1.5));
            totalPay = earnings;
        }

        if (basePay < 8.00 || basePay < 0) {
            System.out.println("ERROR: Employee is being payed below base pay($8.00/hr) or the base pay you typed is negative.");
        } else if (hoursWorked > 60 || basePay < 0) {
            System.out.println("ERROR: Employee worked over 60 hours or the hours you typed are negative.");
        } else {
            System.out.println(totalPay);
        }

    }

    public static void main(String[] args) {
        //testing all conditions and print it on screen
        gettingPayed(9, 90);
        gettingPayed(5, 40);
        gettingPayed(9, 40);
        gettingPayed(9, 55);
    }


}

