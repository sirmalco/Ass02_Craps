import java.util.Scanner;
import java.util.Random;

public class Ass02CrapsGame
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int guess;
        int play = 1;
        int total;

        while(play == 1)
        {
            System.out.println("Enter a number 2-12");
            guess = in.nextInt();

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;

            total = die1 + die2;

            if(guess == total)
            {
                System.out.println("You win! " + die1 + " + " + die2 + " = " + total);
            }
            System.out.println("You lose! The total was " + die1 + " + " + die2 + " = " + total);

            System.out.println("Do you want to play again? (1-yes | 0-no)");
            play = in.nextInt();
        }
        System.out.println("Thanks for playing!");
    }
}
