import java.util.Scanner;
public class Calculations {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	   	int inputNum1 = 0;
		int inputNum2 = 0;
		
		System.out.println("Please enter two values:");
		System.out.print("Value A:");		
		inputNum1 = scan.nextInt();
		System.out.print("Value B:");
		inputNum2 = scan.nextInt();
		
		int resADD = 0;
		int resSUB = 0;
		int resMUL = 0;
		int resDIV = 0;
		int resREM = 0;
		
		System.out.println("The calculations for "+inputNum1+" and "+inputNum2 + " are:" );
		
		resADD = inputNum1 + inputNum2;
		resSUB = inputNum1 - inputNum2;
		resMUL = inputNum1 * inputNum2;
		resDIV = inputNum1 / inputNum2;
		resREM = inputNum1 % inputNum2;
		
		System.out.println("\t"+inputNum1 +" + "+inputNum2+" = "+ resADD);
		System.out.println("\t"+inputNum1 +" - "+inputNum2+" = "+ resSUB);
		System.out.println("\t"+inputNum1 +" * "+inputNum2+" = "+ resMUL);
		System.out.println("\t"+inputNum1 +" / "+inputNum2+" = "+ resDIV);
		System.out.println("\t"+inputNum1 +" % "+inputNum2+" = "+ resREM);
		
	}

}
