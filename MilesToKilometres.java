/*
    This program converts Miles to Kilometers.
     By Group A Members: Behlah
                         Anjali
                         Yassh

*/
import java.util.Scanner;// import Scanner class

public class Milestokilometres{
static final double ML2KM = 1.60935;//conversion factor

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //attach to System.in
        double inputMiles = 0.0; //hold miles value provided by the user
        double resultKilometres = 0.0; //hold calculated kilometer value

        System.out.println("Miles to Kilometres Converter");
        System.out.print("How many miles?");
        inputMiles = scan.nextDouble(); //get gallons from user

        resultKilometres = inputMiles * ML2KM;//conversion formula
        System.out.print ("Converted:" + inputMiles +"miles "+ "=");
        System.out.println(resultKilometres + " kilometres");//display result
        scan.close();
        }
}
