import java.util.*;
import java.io.*;

public class RockPaperScissors {

public static String userChoice; // store user's choice
public static String cpu; // store computer's random choice

public static void welcomeMessage() { // display welcome message to user
        System.out.println();
        System.out.println("Let's play rock, paper, scissors!");
}

public static String askForInput() { // ask user for their choice

        Boolean keepLooping = true;

        while(keepLooping) { // loop until user input is valid
                Scanner myScanner = new Scanner(System.in);
                System.out.println();
                System.out.print("Player 1 chooses: ");
                userChoice = myScanner.nextLine();

                if(userChoice.equalsIgnoreCase("rock") ||
                   userChoice.equalsIgnoreCase("paper") ||
                   userChoice.equalsIgnoreCase("scissors")) {
                        keepLooping = false;
                }
                else {
                        System.out.println();
                        System.out.println("Invalid input, enter rock, paper, or scissors.");
                }
        }
        //System.out.println(userChoice);
        return userChoice;
}

public static String randomChoice() { // randomly choose for computer
        String[] arr = {"rock", "paper", "scissors"};
        Random random = new Random();
        cpu = arr[random.nextInt(3)];
        System.out.print("Computer chooses: ");
        System.out.println(cpu);
        return cpu;
}

public static void announceWinner() { // announce if user wins or loses game

        System.out.println();

        // tie game conditions

        // rock vs rock
        // paper vs paper
        // scissors vs scissors

        if(userChoice.equalsIgnoreCase("rock") && cpu.equalsIgnoreCase("rock")) {
                System.out.println("Tie game!");
        }
        else if(userChoice.equalsIgnoreCase("paper") && cpu.equalsIgnoreCase("paper")) {
                System.out.println("Tie game!");
        }
        else if(userChoice.equalsIgnoreCase("scissors") && cpu.equalsIgnoreCase("scissors")) {
                System.out.println("Tie game!");
        }

        // user wins conditions

        // rock vs scissors
        // paper vs rock
        // scissors vs paper

        else if(userChoice.equalsIgnoreCase("rock") && cpu.equalsIgnoreCase("scissors")) {
                System.out.println("You win!");
        }
        else if(userChoice.equalsIgnoreCase("paper") && cpu.equalsIgnoreCase("rock")) {
                System.out.println("You win!");
        }
        else if(userChoice.equalsIgnoreCase("scissors") && cpu.equalsIgnoreCase("paper")) {
                System.out.println("You win!");
        }

        // user loses conditions

        // rock vs paper
        // paper vs scissors
        // scissors vs rock

        else if(userChoice.equalsIgnoreCase("rock") && cpu.equalsIgnoreCase("paper")) {
                System.out.println("You lose!");
        }
        else if(userChoice.equalsIgnoreCase("paper") && cpu.equalsIgnoreCase("scissors")) {
                System.out.println("You lose!");
        }
        else if(userChoice.equalsIgnoreCase("scissors") && cpu.equalsIgnoreCase("rock")) {
                System.out.println("You lose!");
        }
        System.out.println();
}

public static void playGame() { // all game methods with loop to continue playing or stop
        Boolean playAgain = true;
        String yes_no;

        while(playAgain) {
                // System.out.print("\033[H\033[2J"); // clear terminal (Mac/Linux only)
                welcomeMessage();
                askForInput();
                randomChoice();
                announceWinner();

                System.out.println();
                System.out.print("Want to play again? (y/n): ");
                Scanner myScanner = new Scanner(System.in);
                yes_no = myScanner.nextLine();

                if(yes_no.equalsIgnoreCase("n") || yes_no.equalsIgnoreCase("no")) {
                        playAgain = false;
                }

        }
        System.out.println();
        System.out.println("Thanks for playing!");
        System.out.println();
}

public static void main(String[] args) {
        playGame();

} // end main methodt

} // end class RockPaperScissors
