import java.util.Random;
import java.util.Scanner;

public class Main {
    private static void run(){
        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(100) + 1;
        //System.out.println(randomNumber);
        int count = 0, limit = 7;
        Scanner scan=new Scanner(System.in);
        while (limit != 0) {
            System.out.println("Guess the number between 1-100. You have to guess it in " + limit + " attempts");
            System.out.println("Enter your number: ");
            int num = scan.nextInt();
            count++;
            limit--;
            if (num == randomNumber) {
                System.out.println("Correct!! You guessed it in " + count + " steps");
                break;
            } else if (num > randomNumber)
                System.out.println("Number is high! Guess again!");
            else
                System.out.println("Number is low! Guess again!");
        }
        System.out.println("Do you want to play again?");
        System.out.println("Enter 1 to play \nEnter 2 to exit");
        System.out.println("Your choice: ");
        int choice= scan.nextInt();
        if(choice==1)
            run();
        else if(choice==2)
            exit();
        scan.close();
    }
    private static int exit(){
        System.out.println("Ending!");
        return 0;
    }

    public static void main(String[] args) {
        run();
    }
}
