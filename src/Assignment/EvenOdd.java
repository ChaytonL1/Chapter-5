package Assignment;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        String result;

        System.out.println(" Enter a number >>>");
        number = input.nextInt();

        if(number % 2 == 0)
        {
         result = " Even ";

        }
        else
        {
            result = " Odd ";
        }
        System.out.println(result);
    }
}
