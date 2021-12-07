import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a Java program for sorting a given list of names in ascending order?
public class SortAscending {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<String> list_of_names = new ArrayList<String>();


        System.out.print("How many name you want to enter? : ");


        int choice = sc.nextInt();

        do {

            System.out.print("Enter a name: ");
            String name = sc.next();
            list_of_names.add(name);
            choice--;

        } while (choice > 0);

        Collections.sort(list_of_names);


        System.out.println(list_of_names);
    }
}



