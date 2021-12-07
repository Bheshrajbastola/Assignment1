import java.util.Scanner;

public class BMI_Mass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float bmi;

        System.out.print("enter weight in kg : ");
        float kg= sc.nextFloat();

        System.out.println("enter height : ");
        float height= sc.nextFloat();

        bmi= kg/(height*height);

        System.out.println("body mass index is : " +bmi);


    }
}
