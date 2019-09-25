package Game_zone;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int choice;
        int gen = rand.nextInt(3 ) + 1;


        System.out.println(" 1 - Rock \n 2 - Paper\n 3 - Scissors \n Choice >>");
        choice = input.nextInt();


    }
    public static void rockPaperScissors(int gen)
    {
        if (gen == 1)
        {

        }
        else if (gen == 2)
        {

        }
        else if (gen == 3)
        {

        }

    }
}
