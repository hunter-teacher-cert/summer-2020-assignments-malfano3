import java.io.*;
import java.util.*;

public class Recursion {

  public static int factorial(int n) {
    int answer = 0;

    if (n == 1 || n == 0) {
      return 1;
    }
    else if (n < 0){
      System.out.println("Error, enter a positive integer!");
      return 1;
    }
    else {
      answer = n * factorial(n-1);
      return answer;
    }
  } // end factorial

  public static int fib(int f) {
    int answer = 0;

    if (f == 2 || f == 1 || f == 0) {
      return 1;
    }
    else if (f <= 0) {
      System.out.println("Error, enter a positive integer greater than 0!");
      return 0;
    }
    else {
      answer = fib(f-2) + fib(f-1);
      return answer;
    }

  } // end fib

  public static int ack (int m, int n) {
    if (m == 0) {
      return n + 1;
    } // end if
    else if (m > 0 && n == 0) {
      return ack(m-1, 1);
    } // end else if
    else if (m > 0 && n > 0) {
      return ack(m-1, ack(m, n-1));
    } // end else if
    else {
      System.out.println("Invalid input");
      return 0;
    } // end else
  } // end ack

  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(factorial(6)); // answer 720
    System.out.println(fib(7)); // answer 13
    System.out.println(ack(3, 4)); // answer 125
  } // end public static void main
} // end class Recursion
