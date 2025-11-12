import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess = 0;
        int randomNum = random.nextInt(1, 101);
        System.out.println(randomNum);
        int turn = 7;
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 - 100");
        for(int i = 7; i > 0; i--){
            System.out.printf("You have %d turns left!\n", i);
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            if(guess > randomNum && i != 1)
            {
                System.out.println("TOO HIGH! TRY AGAIN");
            }
            else if(guess < randomNum && i != 1){
                System.out.println("TOO LOW! TRY AGAIN");
            }
            else{
                break;
            }
        }
        if(guess == randomNum){
            System.out.println("YOU WON!");
            System.out.printf("The correct answer is %d", randomNum);
        }
        else {
            System.out.println("YOU LOSE!");
            System.out.printf("The correct answer is %d", randomNum);
        }
        scanner.close();
    }
}