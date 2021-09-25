import java.util.Scanner;
public class GallonsToLitres {
static final double GAL2LT =3.78541;
 public static void main (String[] args)
 {
     Scanner scan = new Scanner(System.in);
     double inputGallons = 0.0;
     double resultLitres =0.0;
     System.out.println("Gallons to Liters Converter");
     System.out.print (" how Many gallons?");
     inputGallons = scan.nextDouble();
     resultLitres =inputGallons*GAL2LT;
     System.out.print("Converted:" +inputGallons+"gal"+"=");
     System.out.println(resultLitres+"litre");
 }


}
