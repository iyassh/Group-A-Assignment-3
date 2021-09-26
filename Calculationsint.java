package NameAgeQueryProgram;

import java.util.Scanner;


public class Calculationsint {

    public static void main(String[] args) {
        float num1,num2,sum,difference,product,quotient,remainder;
        System.out.println("Enter the two integers");

        Scanner sc= new Scanner(System.in);
        num1 = sc.nextFloat();
        num2= sc.nextFloat();

        //sum
        sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + sum);

        //difference
        difference = num1- num2;
        System.out.println(num1 + "-" + num2 + "=" + difference);

        //product
        product = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + product);

        //quotient(divide)
        if (num2 == 0){
            System.out.println("division by0 is not possible");
        }
        else {
            quotient = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + quotient);
        }
        //remainder(modulus)
        remainder = num1 % num2;
        System.out.println(num1 + "%" + num2 + "=" + remainder);
    }
}

