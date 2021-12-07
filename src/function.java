import java.util.Scanner;

public class function {
     public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            sc.nextInt();

            System.out.println("enter a first number");
            int  num1 =sc.nextInt();

            System.out.println("enter second number ");
            int num2 =sc.nextInt();

            System.out.println("enter third number");
            int num3= sc.nextInt();

            int sum =output(num1,num2,num3);
            System.out.println("sum is"+sum);


        }
        public static int output(int num1,int num2,int num3){
            return num1+num2+num3;
        }
    }


