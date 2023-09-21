package Practical;

import java.util.Scanner;

class MultiOpe {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);


        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int product = num1 * num2;
        int sum = num1 + num2;
        int diff = num1 - num2;
        int quo = num1 / num2;
        int rem = num1 % num2;

        System.out.println("Product: "+product);
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+diff);
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);



    }
}
