import java.util.*;
import java.io.*;

public class RockPaperScissors {

public static String userChoice;
public static String cpu;
public static String yes_no;

public static void welcomeMessage() {
        System.out.println();
        System.out.println("Let's play rock, paper, scissors!");
}

public static String askForInput() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Player 1 chooses: ");
        userChoice = myScanner.nextLine();
        //System.out.println(userChoice);
        return userChoice;
}

public static String randomChoice() {
        String[] arr = {"rock", "paper", "scissors"};
        Random random = new Random();
        cpu = arr[random.nextInt(3)];
        System.out.print("Computer chooses: ");
        System.out.println(cpu);
        return cpu;
}

public static void announceWinner() {

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

public static void playGame() {
        Boolean playAgain = true;

        while(playAgain == true) {
                System.out.print("\033[H\033[2J"); // clear terminal (Mac/Linux only)
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
