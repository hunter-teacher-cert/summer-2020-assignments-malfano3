import java.util.*;
import java.io.*;

public class RockPaperScissors {

public static String askForInput() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Choose rock, paper, or scissors: ");
        String userChoice = myScanner.nextLine();
        //System.out.println(userChoice);
        return userChoice;
}

public static String randomChoice() {
        String[] arr = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        System.out.println(arr[random.nextInt(3)]);
        return arr[random.nextInt(3)];
}

public static void main(String[] args) {
        askForInput();
        randomChoice();

} // end main methodt

} // end class RockPaperScissors
