/**o	There is an initial roll of 2 dice resulting in a sum of 2 – 12.

 i.	If the sum is 2, 3 or 12 it is called "craps" or "crapping out" and the game is over with a loss.
 ii.	If the sum is 7 or 11 it is called a ‘natural’ and the game is over with a win.
 iii.	For all other values, the sum becomes ‘the point’ and the user makes subsequent rolls until they either throw a 7 in which case they lose or they make the point sum in which case they win.
 o	After a win or loss, the next player rolls the die for a new game. In our simulation, the program will simply ask the user if they want to continue to play.
 o	For each roll show the value for each die and the sum.
 o	For case i or ii above, indicate that the user either crapped out or won with a natural and then prompt to play again.
 o	For case iii indicate that the sum is now the point.  For each subsequent roll indicate the status of the result:
 	Trying for point
 	Made point and won.  (Prompt user to play again.)
 	Got a seven and lost   (Prompt user to play again.)
*/

import java.util.Scanner;
import java.util.Random;

public class Ass_02{
    void main(){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String playAgain = "";
        int die1 = 0;
        int die2 = 0;
        int roll = 0;
        int point = 0;
        int gameCount = 1;
        int winCount = 0;
        int lossCount = 0;
        boolean done = false;
        boolean donePlaying = false;
        boolean goodInput = false;

        do {
            IO.println("Welcome to Craps!");
            IO.println("This is game #" + gameCount + ".");
            IO.println("Player wins: " + winCount + "; Player losses: " + lossCount);
            IO.println("___________________________________");

            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            roll = die1 + die2;
            IO.println("Die 1: " + die1 + "; Die 2: " + die2 + "; Sum: " + roll);

            if (roll == 2 || roll == 3 || roll == 12) {
                IO.println("Craps! You crapped out and lost!");
                lossCount++;
            }
            else if(roll == 7 || roll == 11) {
                IO.println("Natural! You win!");
                winCount++;
            }
            else {
                point = roll;
                IO.println("Your point is now " + point + ".");
                done = false;

                while(!done) {
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    roll = die1 + die2;
                    IO.println("Die 1: " + die1 + "; Die 2: " + die2 + "; Sum: " + roll);

                    if (roll == point) {
                        IO.println("Made the point! You win!");
                        winCount++;
                        done = true;
                    }
                    else if (roll == 7) {
                        IO.println("Got a seven! You lose!");
                        lossCount++;
                        done = true;
                    }
                    else {
                        IO.println("Trying for point " + point + "...");
                    }
                }
            }

            gameCount++;
            goodInput = false;
            do {
                IO.print("Want to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
                    goodInput = true;
                }
                else
                {
                    IO.println("You entered: " + playAgain + ".");
                    IO.println("This is invalid.");
                }
            }while(!goodInput);

            if(playAgain.equalsIgnoreCase("Y")){
                IO.println("You're on!");
                IO.println("___________________________________");
            }
            else
            {
                IO.println("You're off!");
                donePlaying = true;
            }

        }while(!donePlaying);
        IO.println("Final score: Player wins: " + winCount + "; Player losses: " + lossCount);





    }
}
