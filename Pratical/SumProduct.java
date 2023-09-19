package Practical;

import java.util.Scanner;

class SumProduct {
        public static void main (String[] args){
        Scanner scan = new Scanner (System.in);


        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int product = num1 * num2;
        int sum = num1 + num2;

        if (sum > product){
            System.out.println("Sum is greater than product");
        } else if (sum == product) {
            System.out.println("Sum is equal to product");
        } else {
            System.out.println("Product is greater than Sum");
        }
    }
}
