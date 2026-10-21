/**2. Code the Rock Paper Scissors program:
 a. Get a move choice from playerA which must be R, P, S or r, p, s
 Loop until you get a valid move
 b. Get a move choice from playerB in the same manner
 c. Display the results using the accepted phrases from the game
 Rock breaks Scissors,
 Paper covers Rock,
 Scissors cuts Paper
 and indicate the winner (Player A wins) or
 Rock vs Rock it's a Tie! Etc...
 d. Prompt the user to play again [Y/N]
 e. Continue or terminate based on the user's choice.
 */

/* i did not fully read and mistakenly wrote the code for assessment 1
  where the player plays against random computer moves
  i thought i'd include the code just for shits
  */


import java.util.Random;
import java.util.Scanner;

public class RPS_CPU {
    void main()
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String playerChoice = "";
        String gameChoice = "";
        String playAgain = "";
        int gameChoiceNum = 0;
        int gameCount = 1;
        int playerWinCount = 0;
        int gameWinCount = 0;
        boolean donePlaying = false;
        boolean goodInput = false;

        do{
            IO.println("Welcome to the Rock Paper Scissors!");
            IO.println("This is match #" + gameCount + ".");
            IO.println("Player wins: " + playerWinCount + "; CPU wins: " + gameWinCount);
            IO.println("___________________________________");

            goodInput = false;
            do{
                IO.print("Please enter your choice: [R/P/S]: ");
                playerChoice = in.nextLine().trim();
                if (playerChoice.equalsIgnoreCase("R") || playerChoice.equalsIgnoreCase("P") || playerChoice.equalsIgnoreCase("S")) {
                    goodInput = true;
                } else{
                    IO.println("You entered: " + playerChoice + ".");
                    IO.println("This is invalid.");
                }
            }while(!goodInput);

            gameChoiceNum = rand.nextInt(1, 4);
            if (gameChoiceNum == 1) {
                gameChoice = "R";
                IO.println("CPU chooses Rock.");
                if (playerChoice.equalsIgnoreCase("R")) {
                    IO.println("Rock vs Rock, it's a tie!");
                }
                 else if (playerChoice.equalsIgnoreCase("P")) {
                    IO.println("Paper covers Rock, player wins!");
                    playerWinCount++;
                }
                 else if (playerChoice.equalsIgnoreCase("S")) {
                    IO.println("Rock breaks Scissors, CPU wins!");
                    gameWinCount++;
                }
            }
             else if (gameChoiceNum == 2) {
                gameChoice = "P";
                IO.println("CPU chooses Paper.");
                if (playerChoice.equalsIgnoreCase("R")) {
                    IO.println("Paper covers Rock, CPU wins!");
                    gameWinCount++;
                }
                 else if (playerChoice.equalsIgnoreCase("P")) {
                    IO.println("Paper vs Paper, it's a tie!");
                }
                 else if (playerChoice.equalsIgnoreCase("S")) {
                    IO.println("Scissors cuts Paper, player wins!");
                    playerWinCount++;
                }
            }
             else if (gameChoiceNum == 3) {
                gameChoice = "S";
                IO.println("CPU chooses Scissors.");
                if (playerChoice.equalsIgnoreCase("R")) {
                    IO.println("Rock breaks Scissors, player wins!");
                    playerWinCount++;
                }
                 else if (playerChoice.equalsIgnoreCase("P")) {
                    IO.println("Scissors cuts Paper, CPU wins!");
                    gameWinCount++;
                }
                 else if (playerChoice.equalsIgnoreCase("S")) {
                    IO.println("Scissors vs Scissors, it's a tie!");
                }
            }
            else{
                IO.println("Something went wrong!");
            }

            gameCount++;

            goodInput = false;
            do {
                IO.print("Want to play again? [Y/N]: ");
                playAgain = in.nextLine().trim();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
                    goodInput = true;
                } 
                else{
                    IO.println("You entered: " + playAgain + ".");
                    IO.println("This is invalid.");
                }
            }while(!goodInput);

            if (playAgain.equalsIgnoreCase("Y")) {
                IO.println("You're on!");
                IO.println("___________________________________");
            }
            else{
                IO.println("You're off!");
                donePlaying = true;
            }
        }while(!donePlaying);
        IO.println("Final score: Player wins: " + playerWinCount + "; CPU wins: " + gameWinCount);
    }
}