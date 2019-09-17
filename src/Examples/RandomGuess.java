package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] agrs)
    {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice;
        int rand_pick = rand.nextInt(10 + 1);

        System.out.println("Please pick a number between 1 and 10 >>");
        choice = input.nextInt();

        if(choice == rand_pick)
        {
            System.out.println(" Congratulations you are a good guesser.");

        }
        else
            {
                System.out.println("Wrong it was " + rand_pick);

            }
    }
}
