/***********************************************************************************************************************
 * @file   TripPlanner.java
 * @brief  Helps people to plan their journey just by inputting their information! Hi Dr.Pauca, please try my program
 * @author Heba Beshai
 * @date   February 1, 2016
 **********************************************************************************************************************/
package Binary2Decimal;
import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        // Define Variables to be Used in this program
             double  galHeld, tanksNec,totPrice, cost4Pass, tankHolds, gCost;
             double numPass, mileTrav, galUsed, milePg, b, c, d;


        // Ask the user to enter the data needed by the program
             System.out.println("Please enter the required information below: ");
             System.out.print("Number of passengers: ");
             numPass = input.nextDouble();
             System.out.print("Length of the trip (in miles): ");
             mileTrav = input.nextDouble();
             System.out.print("Capacity of the car's gas tank (in gallons): ");
             galHeld = input.nextDouble();
             System.out.print("Price of one gallon of gas: ");
             gCost = input.nextDouble();
             System.out.print("Miles per gallon of your car: ");
             milePg = input.nextDouble();


        // Do the needed calculations, use 1 or more variables to store your results
             galUsed = mileTrav / milePg;
             tanksNec = galUsed / galHeld; // Number of tanks of gas needed
             b = Math.ceil(tanksNec);
             totPrice = b * galHeld * gCost; //total price of gas
             cost4Pass = totPrice / numPass; //price per passenger


        // Print the results to the screen
             System.out.println();
             System.out.printf("You'll need %.2f tanks of gas\n", b);
             System.out.printf("The total cost will be %.2f dollars\n ", totPrice);
             System.out.printf("Each passenger should pay %.2f dollars\n  ", cost4Pass);



    }
}
