/*
   This program converts Pounds to Kilograms.
     By Group A Members: Behlah
                         Anjali
                         Yassh

*/
import java.util.Scanner;

public class PoundsToKilograms {
    static final double PND2KG = 0.453592;// import Scanner class

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//attach to System.in

        double inputPounds = 0.0; //hold pounds value provided by the user
        double resultKilogram= 0.0; //hold calculated kilogram value

        System.out.println("Pounds to Kilograms Converter");
        System.out.println(" How many pounds?");
        inputPounds = scan.nextDouble();//get gallons from user
        resultKilogram=inputPounds * PND2KG;//conversion formula

        System.out.println("Converted: " + inputPounds + " pounds" + " = " +resultKilogram+ " kilograms");//display result
    }
}
