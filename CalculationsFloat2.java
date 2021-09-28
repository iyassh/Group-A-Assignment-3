/*
    This program performs calculations on the two numbers given by the user.
     By Group A Members: Behlah
                         Anjali
                         Yassh

*/
    import java.util.Scanner; // import Scanner class
    public class CalculationsFloat {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            float inputNum1 ;// variable declaration
            float inputNum2 ;// variable declaration

            System.out.println("Please enter two values:");
            System.out.print("Value A:");
            inputNum1 = scan.nextInt();// taking user`s 1st number
            System.out.print("Value B:");
            inputNum2 = scan.nextInt();// taking user`s 1st number

            float resADD ;// variable declaration
            float resSUB ;// variable declaration
            float resMUL ;// variable declaration
            float resDIV ;// variable declaration
            float resREM ;// variable declaration

            System.out.println("The calculations for "+inputNum1+" and "+inputNum2 + " are:" );

            resADD = inputNum1 + inputNum2;// performing calculations
            resSUB = inputNum1 - inputNum2;// performing calculations
            resMUL = inputNum1 * inputNum2;// performing calculations
            resDIV = inputNum1 / inputNum2;// performing calculations
            resREM = inputNum1 % inputNum2;// performing calculations

            System.out.println("\t"+inputNum1 +" + "+inputNum2+" = "+ resADD);//output statement
            System.out.println("\t"+inputNum1 +" - "+inputNum2+" = "+ resSUB);//output statement
            System.out.println("\t"+inputNum1 +" * "+inputNum2+" = "+ resMUL);//output statement
            System.out.println("\t"+inputNum1 +" / "+inputNum2+" = "+ resDIV);//output statement
            System.out.println("\t"+inputNum1 +" % "+inputNum2+" = "+ resREM);//output statement

        }

    }
