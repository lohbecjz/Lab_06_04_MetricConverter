/**
 * @author lohbecjz@mail.uc.edu
 */

import java.util.Scanner;

public class Lab_06_04_MetricConverter
{
    public static void main(String[] args)
    {
        // Declare variables
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        // Prompt and input
        System.out.print("Enter length in meters to view in equivalent units: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine(); // clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number.");
            System.exit(0); // terminate the program
        }

        // Process and output
        miles = meters / 1609.344;
        feet = meters * 3.281;
        inches = meters * 39.37;

        System.out.println(meters + " Meters is equal to " + String.format("%.4f", miles) + " Miles.");
        System.out.println(meters + " Meters is equal to " + String.format("%.4f", feet) + " Feet.");
        System.out.println(meters + " Meters is equal to " + String.format("%.4f", inches) + " Inches.");

    }
}