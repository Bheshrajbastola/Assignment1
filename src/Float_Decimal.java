import java.util.Scanner;

public class Float_Decimal {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter the floating point number : ");
        float num1= sc.nextFloat();

        System.out.println("enter the floating number : ");
        float num2 = sc.nextFloat();

        if (Math.abs(num1-num2)<0.01) {
            System.out.println("The number are same ");
        }
        else {
            System.out.println("the number are different ");

        }
    }
}
