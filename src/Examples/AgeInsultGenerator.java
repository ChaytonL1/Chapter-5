package Examples;

import java.util.Scanner;

public class AgeInsultGenerator {


    public static void main(String[] args)
    {
        //User enters their age and it spits back an insult.
        int age;

        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your age >> ");
        age = input.nextInt();

        if(age < 12)
        {
            System.out.println(" You are just a kid, go away. ");
        }
        else if(age >= 12 && age < 19)
        {
            System.out.println("You are old enough to know better, hopefully");
        }
        else if(age >= 19 && age < 25)
        {
            System.out.println("Get a job you bum.");
        }
        else if( age >= 25 && age < 30 )
        {
            System.out.println("Some insult between 25 and 30");
        }
        else if( age >= 30 && age < 40 )
        {
            System.out.println("Some insult between 30 and 40");
        }
        else if( age >= 40 && age < 50 )
        {
            System.out.println("Some insult between 40 and 50");
        }
        else if( age >= 50 )
        {
            System.out.println("Some insult over 50 years old");
        }
    }
}
