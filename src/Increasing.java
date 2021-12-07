//Write a Java program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
// "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

import java.util.Scanner;

public class Increasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first num : ");
        int num1 = sc.nextInt();

        System.out.println("enter the second number ; ");
        int num2 = sc.nextInt();

        System.out.println("enter the third number ; ");
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing order");
        }

        else if (num1 >num2 && num2 >num3) {


            System.out.println("Decreasing order ");
        }
        else
        {
            System.out.println("Neither increasing nor decreasing");


        }}}