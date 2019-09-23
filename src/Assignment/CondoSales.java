package Assignment;

import java.util.Scanner;

public class CondoSales {

    public static void main(String[] args)
    {
        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println(" 1 - Park View\n 2 - Golf Course View\n 3 - Lake View\n Choice >>> ");
        choice = input.nextInt();

        if (choice == 1)
        {
            System.out.println(" A Park View Condo will be $150,000. \n Would you like to add a garage to this?\n " +
                    "");

        }
        else if (choice == 2)
        {
            System.out.println(" A Golf Course View will be $170,000");

        }
        else if (choice == 3)
        {
            System.out.println(" A Lake View will be $210,000");

        }
        else
        {
            System.out.println(" Invalid number, setting price to 0");

        }
    }
}
