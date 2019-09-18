package Examples;

import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args)
    {
        String day;
        String result;

        Scanner input = new Scanner (System.in);
        System.out.println(" Enter the day of the week >>>");
        day = input.next();

        switch(day)
        {
            case"Monday":
                result = " Reserve room for Friday meeting.";
                break;
            case"Tuesday":
                result = " Prepare Powerpoint slides.";
                break;
            case"Wednesday":
                result = " Send out meeting reminders.";
                break;
            case"Thursday":
                result = " Getting ready for football Friday.";
                break;
            case"Friday":
                result = " Wear spirit wear for game SPACE THEME.";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result);
    }
}
