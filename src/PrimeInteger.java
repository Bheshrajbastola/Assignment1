//Write a Java program that prompts the user for an integer
// and then prints out all the prime numbers up to that Integer?
import java.util.Scanner;

class PrimeInteger
{
    public static void main(String[] args)
    {
        int i=0,k=0;
        Scanner s=new Scanner(System.in);
        i=s.nextInt();
        System.out.println("Prime numbers till "+i+" is");
        for(int j=2;j<=i;j++)
        {
            int check=0;
            for(k=2;k<=j/2;k++)
            {
                if(j%k==0)
                    check=1;
            }
            if(check==0)
                System.out.println(j);

        }
    }

}