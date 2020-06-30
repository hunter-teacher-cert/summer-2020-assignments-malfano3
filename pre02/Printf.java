import java.io.*;
import java.util.*;

public class Printf {

  public static void main(String[] args) {
    int x = 5;
    double y = 2.14;

    // correct statement
    System.out.printf("My value = %d%n", x );

    // incorrect statement
    // Throws illegal format conversion exception
    System.out.printf("My value = %f%n", x );

    // incorrect statement
    // Throws illegal format conversion exception
    System.out.printf("My value = %d%n", y );

  } // end public static void main
} // end class Printf
