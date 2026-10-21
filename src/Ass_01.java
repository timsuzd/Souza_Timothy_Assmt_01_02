/**2.	Code the Rock Paper Scissors program:
 a.	Get a move choice from playerA which must be R, P, S or r, p, s
 Loop until you get a valid move
 b.	Get a move choice from playerB in the same manner
 c.	Display the results using the accepted phrases from the game
 Rock breaks Scissors,
 Paper covers Rock,
 Scissors cuts Paper
 and indicate the winner (Player A wins) or
 Rock vs Rock it’s a Tie!  Etc…
 d.	Prompt the user to play again [Y/N]
 e.	Continue or terminate based on the user’s choice.
*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    void main()
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String playerChoice = "";
        int gameCount = 0;
        boolean done = false;
        boolean donePlaying = false;
        boolean goodInput = false;

        do {
            IO.println("Welcome to the Rock Paper Scissors!");
            IO.println("This is match #" + gameCount + ".");
            IO.print("Please enter your choice: [R/P/S]: ");
            playerChoice = in.nextLine();
            if (playerChoice.equalsIgnoreCase("R" || playerChoice.equalsIgnoreCase("P") ||  playerChoice.equalsIgnoreCase("P"))
            {
                
            }

        }while(!donePlaying);

    }

    }

}