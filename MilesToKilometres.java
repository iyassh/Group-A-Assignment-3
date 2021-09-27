import java.util.Scanner;

public classMilestokilometres{
    static final double ML2KM = 1.60935;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inputMiles = 0.0;
        double resultKilometres = 0.0;

        System.out.println("Miles to Kilometres Converter");
        System.out.print("How many miles?");
        inputMiles = scan.nextDouble();

        resultKilometres = inputMiles * ML2KM;
        System.out.print ("Converted:" + inputMiles +"miles "+ "=");
        System.out.println(resultKilometres + " kilometres");
        scan.close();
    }
}
