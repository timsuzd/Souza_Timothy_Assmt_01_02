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

import java.util.Scanner;

public class Ass_01 {
    void main() {
        Scanner in = new Scanner(System.in);
        String playerAChoice = "";
        String playerBChoice = "";
        String playAgain = "";
        int gameCount = 1;
        int playerAWinCount = 0;
        int playerBWinCount = 0;
        boolean donePlaying = false;
        boolean goodInput = false;

        do {
            IO.println("Welcome to the Rock Paper Scissors!");
            IO.println("This is match #" + gameCount + ".");
            IO.println("Player A wins: " + playerAWinCount + "; Player B wins: " + playerBWinCount);
            IO.println("___________________________________");

            goodInput = false;
            do {
                IO.print("Player A, please enter your choice: [R/P/S]: ");
                playerAChoice = in.nextLine().trim();
                if (playerAChoice.equalsIgnoreCase("R") || playerAChoice.equalsIgnoreCase("P") || playerAChoice.equalsIgnoreCase("S")) {
                    goodInput = true;
                } else {
                    IO.println("You entered: " + playerAChoice + ".");
                    IO.println("This is invalid.");
                }
            } while (!goodInput);

            goodInput = false;
            do {
                IO.print("Player B, please enter your choice: [R/P/S]: ");
                playerBChoice = in.nextLine().trim();
                if (playerBChoice.equalsIgnoreCase("R") || playerBChoice.equalsIgnoreCase("P") || playerBChoice.equalsIgnoreCase("S")) {
                    goodInput = true;
                } else {
                    IO.println("You entered: " + playerBChoice + ".");
                    IO.println("This is invalid.");
                }
            } while (!goodInput);

            if (playerBChoice.equalsIgnoreCase("R")) {
                IO.println("Player B chooses Rock.");
                if (playerAChoice.equalsIgnoreCase("R")) {
                    IO.println("Rock vs Rock, it's a Tie!");
                } else if (playerAChoice.equalsIgnoreCase("P")) {
                    IO.println("Paper covers Rock, Player A wins!");
                    playerAWinCount++;
                } else if (playerAChoice.equalsIgnoreCase("S")) {
                    IO.println("Rock breaks Scissors, Player B wins!");
                    playerBWinCount++;
                }
            } else if (playerBChoice.equalsIgnoreCase("P")) {
                IO.println("Player B chooses Paper.");
                if (playerAChoice.equalsIgnoreCase("R")) {
                    IO.println("Paper covers Rock, Player B wins!");
                    playerBWinCount++;
                } else if (playerAChoice.equalsIgnoreCase("P")) {
                    IO.println("Paper vs Paper, it's a Tie!");
                } else if (playerAChoice.equalsIgnoreCase("S")) {
                    IO.println("Scissors cuts Paper, Player A wins!");
                    playerAWinCount++;
                }
            } else if (playerBChoice.equalsIgnoreCase("S")) {
                IO.println("Player B chooses Scissors.");
                if (playerAChoice.equalsIgnoreCase("R")) {
                    IO.println("Rock breaks Scissors, Player A wins!");
                    playerAWinCount++;
                } else if (playerAChoice.equalsIgnoreCase("P")) {
                    IO.println("Scissors cuts Paper, Player B wins!");
                    playerBWinCount++;
                } else if (playerAChoice.equalsIgnoreCase("S")) {
                    IO.println("Scissors vs Scissors, it's a Tie!");
                }
            } else {
                IO.println("Something went wrong!");
            }

            gameCount++;

            goodInput = false;
            do {
                IO.print("Want to play again? [Y/N]: ");
                playAgain = in.nextLine().trim();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
                    goodInput = true;
                } else {
                    IO.println("You entered: " + playAgain + ".");
                    IO.println("This is invalid.");
                }
            } while (!goodInput);

            if (playAgain.equalsIgnoreCase("Y")) {
                IO.println("You're on!");
                IO.println("___________________________________");
            } else {
                IO.println("You're off!");
                donePlaying = true;
            }
        }while (!donePlaying);




    }
}