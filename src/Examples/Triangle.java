package Examples;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args)
    {
        // Solving for right, isosceles, equilateral
        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println(" What are you solving for \n 1- for right traingle \n" +
                " 2 - for Isosceles \n 3 - for Equilateral \n Choice >>>");
        choice = input.nextInt();

        if (choice == 1)
        {
            rightTriangle();
        }
        else if(choice == 2)
        {
            solveIsosceles();
        }
        else if (choice == 3)
        {
            solveEquilateral();
        }

    }
    public static void rightTriangle()
    {
        Scanner input = new Scanner(System.in);
        String choice = null;
        double side1;
        double side2;


        System.out.println(" Which side do you want to solve for? \n " +
                " A - side\n B - Side\n C - Side\n Choice >>>");
        choice = input.next();
        if(choice.equalsIgnoreCase("A"))
        {
            System.out.println(" Please enter for side B >>> ");
            side1 = input.nextDouble();
            System.out.println(" Please enter for side C >>> ");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1 ,side2, choice);

        }
        else if(choice.equalsIgnoreCase("B"))
        {
            System.out.println(" Please enter for side A >>> ");
            side1 = input.nextDouble();
            System.out.println(" Please enter for side C >>> ");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1 ,side2, choice);
        }
        else {
            System.out.println(" Please enter for side A >>> ");
            side1 = input.nextDouble();
            System.out.println(" Please enter for side B >>> ");
            side2 = input.nextDouble();
            rightTriangleMathC(side1 ,side2, choice);
        }

    }
    public static void rightTriangleMathAB(double side1, double side2, String choice)
    {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println(" The side " + choice + " is " + notC);
    }
    public static void rightTriangleMathC(double side1, double side2, String choice)
    {
        double C;
        C = (side2 * side2) - (side1 * side1);
        System.out.println(" The side " + choice + " is " + C);
    }
    public static void solveIsosceles()
    {
        double A;
        double B;
        double C;
        int choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" 1 - Area \n 2 - Perimeter ");
        choice = keyboard.nextInt();
        if (choice == 1 )
        {
            System.out.println(" Enter the A value for an equilateral triangle. >>>");
            A = keyboard.nextDouble();
            solveEquilateralMathA(A);
        }
        else if(choice == 2)
        {
            System.out.println(" Enter the A value for an equilateral triangle. >>>");
            A = keyboard.nextDouble();
            solveEquilateralMathP(A);
        }

        System.out.println(" Enter the A value for an equilateral triangle. >>>");
        A = keyboard.nextDouble();
        solveEquilateralMathA(A);


    }
    public static void solveEquilateral()
    {
        double A;
        int choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" 1 - Area \n 2 - Perimeter ");
        choice = keyboard.nextInt();
        if (choice == 1 )
        {
            System.out.println(" Enter the A value for an equilateral triangle. >>>");
            A = keyboard.nextDouble();
            solveEquilateralMathA(A);
        }
        else if(choice == 2)
        {
            System.out.println(" Enter the A value for an equilateral triangle. >>>");
            A = keyboard.nextDouble();
            solveEquilateralMathP(A);
        }

        System.out.println(" Enter the A value for an equilateral triangle. >>>");
         A = keyboard.nextDouble();
         solveEquilateralMathA(A);

    }
    public static void solveEquilateralMathA(double A)
    {
        double area;
        double squared = Math.sqrt((3));
        area = (squared/4) * (A*A);
        System.out.print(" The area for the Equilateral triangle is " + area);
    }
    public static void solveEquilateralMathP(double A)
    {
        double perimeter;
        perimeter =  A * 3;
        System.out.println(" The perimeter for the equilateral triangle is " + perimeter);

    }
}
