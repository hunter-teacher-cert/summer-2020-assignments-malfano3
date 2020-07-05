import java.io.*;
import java.util.*;

public class Craps {


  public static int roll(int maxValue) {
    Random rand = new Random();
    int rand_int = rand.nextInt(maxValue) + 1;
    System.out.println("Die Value: " + rand_int);
    return rand_int;
  } // end roll method




  public static int shoot(int numDice, int maxValue) {
    int rollTotal = 0;
    for(int i = 0; i < numDice; i++) {
      rollTotal += roll(maxValue/2);
    } // end for loop
    System.out.println("Roll Total: " + rollTotal);
    return rollTotal;
  } // end shoot method




  public static String round() {
    String result = "Initializing";

    System.out.println("Coming out!");

    int currentRoll = shoot(2, 12);
    int point = currentRoll;
    Scanner myScanner = new Scanner(System.in);
    String clickToContinue = "";


    if((currentRoll == 2) || (currentRoll == 3) || (currentRoll == 12)) {
      //System.out.println(currentRoll);
      System.out.println();
      result = "Craps, you lose!";
    } // end if

    else if ((currentRoll == 7) || (currentRoll == 11)) {
      //System.out.println(currentRoll);
      System.out.println();
      result = "Natural, you win!";
    } // end else if
    else {
      //System.out.println(currentRoll);
      System.out.println();
      String message = "The new point is: " + point;
      System.out.println(message);
      System.out.println();
      System.out.println("Click enter to roll again...");
      boolean keepRolling = true;

      while (keepRolling) {
        clickToContinue = myScanner.nextLine();
        if (clickToContinue != "f8qun%8f@nw8*efu8&a$du0@df8a!sudn"){
          currentRoll = shoot(2, 12);
          if(currentRoll == point) {
            result = "You rolled the point, you win!";
            keepRolling = false;
          } // end if
          else if(currentRoll == 7) {
            result = "You rolled a 7 before the point, you lose!";
            keepRolling = false;
          } // end else
          else {
            System.out.println();
            System.out.println("You did not roll the point or a 7, roll again...");
            System.out.println();
          }
        } // end if
        } // end while

      //int currentRoll = shoot(2, 12);


        //if

    } // end else
  System.out.println(result);
  System.out.println();
  return result;

  } // end shoot method


  public static void main(String[] args) {
    //System.out.println("Hello world!");
    //roll(6); // roll a single die between 1-6
    //System.out.printlncurrentRoll); // print roll

    //System.out.println(round());
    //roll(6);
    //shoot(2, 12);
    System.out.println();
    round();




  } // end public static void main


} // end class Craps
