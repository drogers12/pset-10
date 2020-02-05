/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.text.NumberFormat;
import java.lang.Math;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        final double length = 11;
        final double width = 8.5;
        final double inchToMm = 25.4;
        double area = length*width*inchToMm*inchToMm;


        System.out.printf("\n%,.2f%s\n", area, " square millimeters.");



        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double inchToCm = 2.54;
         double perimeter = (length+length+width+width)*inchToCm;

         System.out.printf("\n%,.2f%s\n", perimeter, " centimeters.");


        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */


         double hypotenuse = Math.hypot(length, width);
         System.out.printf("\n%,.2f%s\n", hypotenuse, " inches.");



        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */


         final double weightHW = .15;
         final double weightQuiz = .35;
         final double weightTest = .5;

         int homework1 = 88;
         int homework2 = 91;
         int homework3 = 0;
         int quiz1 = 84;
         int quiz2 = 89;
         int quiz3 = 93;
         int test1 = 74;
         int test2 = 87;
         int test3 = 82;

         double totalHW = homework1+homework2+homework3;
         double totalQuiz = quiz1+quiz2+quiz3;
         double totalTest = test1+test2+test3;

         double finalHW = (totalHW)/3*weightHW;
         double finalQuiz = (totalQuiz)/3*weightQuiz;
         double finalTest = (totalTest)/3*weightTest;

         double finalGrade = finalHW+finalQuiz+finalTest;

         System.out.printf("\n%,.2f%s\n", finalGrade, "%.");

         //FIXROUNDINGERRORS


        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         final double hourlyWage = 12.50;

         final double hoursMonday = 7.5;
         final double hoursTuesday = 8;
         final double hoursWednesday = 10.5;
         final double hoursThursday = 9.5;
         final double hoursFriday = 6;
         final double hoursSaturday = 11.5;
         final double hoursSunday = 0;

         final double finalPay = hourlyWage*(hoursMonday+hoursTuesday+hoursWednesday+hoursThursday+hoursFriday+hoursSaturday+hoursSunday);

         System.out.printf("\n%,.2f%s\n", finalPay, ".");

         //FIX ROUNDING ERRORS

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

         final double salary = 117000;
         final double payPeriod = 24;

         final double fedTax = .24;
         final double stateTax = .0637;
         final double saving401k = .07;

         final double payPost401k = salary*(1-saving401k);
         final double payPostStateTax = payPost401k*(1-fedTax);
         final double takeHomePay = payPostStateTax*((1-(stateTax))/payPeriod);

         System.out.println("\n" + currencyFormat.format(takeHomePay) + ".");



        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         final int studentCount = 273;
         final int teacherCount = 28;
         final int busCapacity = 54;

         final int totalPeople = studentCount+teacherCount;

         int busesNeeded = (totalPeople/busCapacity)+1;
         int peopleLastBus = totalPeople%busCapacity;

         System.out.printf("\n" + busesNeeded + " buses are needed, with " + peopleLastBus + " passengers on the last bus.\n");




        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

         final double boardLength = 48;
         final double boardWidth = 24;
         final double holeDiameter = 6;

         final double surfaceArea = (boardLength*boardWidth)-(((holeDiameter/2)*(holeDiameter/2))*Math.PI);

         System.out.printf("\n%,.2f%s\n", surfaceArea, " square inches.");


        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

         int currentYear = 2020;
         boolean leapYear = (currentYear%4)<(currentYear%100) || (currentYear%400==0);
         System.out.println("\n" + currentYear + " is a leap year..." + leapYear + ".");

         currentYear = 2100;
         leapYear = (currentYear%4)<(currentYear%100) || (currentYear%400==0);
         System.out.println(currentYear + " is a leap year..." + leapYear + ".");

         currentYear = 2400;
         leapYear = (currentYear%4)<(currentYear%100) || (currentYear%400==0);
         System.out.println(currentYear + " is a leap year..." + leapYear + ".");





        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

         final double temp = 38;
         final double windSpeed = 14;
         final double windChill = 35.74 + (.6215 * temp) + ((.4275 * temp - 35.75) * (Math.pow(windSpeed, .16)));

         System.out.printf("\n%,.1f%s\n", windChill, " degrees.");


    }
}
