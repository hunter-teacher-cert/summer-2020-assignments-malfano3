import java.io.*;
import java.util.*;

public class Loops {

  public static double power(double base, int exponent) {
    double answer = base;
    for(int i = 1; i < exponent; i++) {
      answer = answer * base;
    } // end for loop
    return answer;
  } // end power

  public static int factorial(int base) {
    int answer = 1;
    if (base == 0 || base == 1){
      return 1;
    }
    else {
      for(int i = base; i != 1; i--) {
        answer *= i;
      } // end for loop
      return answer;
    } // end else
  } // end factorial

  public static double myExp(double x, int n) {
    double answer = 1;
    for(int i = 1; i < n + 1; i++) {
      answer += power(x, i) / factorial(i);
    } // end for loop
    return answer;
  } // end myExp

  public static void check(double x) {
    System.out.print(x);
    System.out.print("\t");
    System.out.print(myExp(x, 30));
    System.out.print("\t");
    System.out.print(Math.exp(x));
    System.out.println();
  }  // end check


  public static void main(String[] args) {
    System.out.println("Hello!");
    //System.out.println(power(5, 6));
    //System.out.println(factorial(7));
    //System.out.println(myExp(2, 6));

    for (double i = 0.1; i < 101.0; i *= 10) {
      check(i);
    } // end for loop

    for (double j = -0.1; j < -101.0; j *= 10) {
      check(j);
    } // end for loop

  } // end main

} // end class
