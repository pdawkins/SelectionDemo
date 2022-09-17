import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Simple IF Statement
        /*
        int age = 23;

        if (age >= 18) {
            System.out.println("You can vote");
        }
        */


        // IF .. ELSE statement
        /*
        int age = 23;

        if (age >= 18) {
            System.out.println("You can vote");
        } else{
            System.out.println("Too young to vote");
        }

         */

        // Nested IF Statement
        /*
        int score = 85;

        if (score >= 90)
            System.out.println("Grade A");
        else if(score >= 80)
            System.out.println("Grade B");
        else if(score >= 70)
            System.out.println("Grade C");
        else if (score >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
        */



        /*
        // logical operators
        // AND    &&
        // OR     ||
        // NOT     !

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your speed: ");
        double speed = input.nextDouble();

        if (speed < 10 || speed > 70)
            System.out.println("Not Acceptable speed ..");
        else
            System.out.println("Acceptable ...");
         */

        // Switch statement
        /*
        System.out.println("Select one ... ");
        System.out.println("P] Play Game");
        System.out.println("V] View top Score");
        System.out.println("T] Tutorial");
        System.out.println("Q] Quit");

        Scanner input = new Scanner(System.in);

        char option = input.next().charAt(0);

        switch (option){
            case 'P':
                System.out.println("Play game");
                break;
            case 'V':
                System.out.println("View top score");
                break;
            case 'T':
                System.out.println("View Tutorials");
                break;
            case 'Q':
                System.out.println("Quit ...");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        */



    }
}