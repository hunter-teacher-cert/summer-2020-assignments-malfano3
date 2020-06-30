import java.io.*;
import java.util.*;

public class Time {

  public static void main(String[] args) {
    int hour = 14;
    int minute = 22;
    int second = 30;

    int secSinceMn;
    int secRemaining;

    secSinceMn = hour * 3600 + minute * 60 + second;
    secRemaining = 24 * 60 * 60 - secSinceMn;

    System.out.println("Seconds since midnight = " + secSinceMn);
    System.out.println("Seconds until midnight = " + secRemaining);

  } // end public static void main
} // end class Time
