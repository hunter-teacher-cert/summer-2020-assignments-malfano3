import java.io.*;
import java.util.*;

public class GridImage {

  public static void print2d(int[][] d2) {

    for (int r = 0; r < d2.length; r++) {
      for (int c = 0; c < d2[r].length; c++) {
        System.out.printf("%03d ", d2[r][c]);
      }//end c for
    System.out.println();
    }//end r for
  }//end print2d

  public static void rowPop(int[][] d2, int r, int value) {
    for (int i = 0; i < d2.length; i++) {
      d2[r][i] = value;
    }
    print2d(d2);
    System.out.println();
  }//end rowPop

  public static void colPop(int[][] d2, int c, int value) {
    for (int i = 0; i < d2[0].length; i++) {
      d2[i][c] = value;
    }
    print2d(d2);
    System.out.println();
  }//end colPop

  public static void invert(int[][] d2) {
    for (int i = 0; i < d2.length; i++) {
      for (int j = 0; j < d2[0].length; j++) {
        if (d2[i][j] == 0) {
          d2[i][j] = 255;
        }
        else {
          d2[i][j] = 0;
        }
      }
    }
    print2d(d2);
    System.out.println();
  } //end invert

  /*
     0: up + left
     1: up + right
     2: down + left
     3: down + right
   */
  public static void diagonal(int[][] d2, int r, int c, int direction, int value) {
    if (direction == 0) { // up and left
      while (r >= 0 && c >= 0) {
        d2[r][c] = value;
        r -= 1;
        c -= 1;
      } // end while
    } // end up and left

    else if (direction == 1) { // up and right
      while (r >= 0 && c < d2[0].length) {
        d2[r][c] = value;
        r -= 1;
        c += 1;
      } // end while
    } // end up and right

    else if (direction == 2) { // down and left
      while (r < d2.length && c >= 0) {
        d2[r][c] = value;
        r += 1;
        c -= 1;
      } // end while
    } // end down and left

    else if (direction == 3) { // down and right
      while (r < d2.length && c < d2[0].length) {
        d2[r][c] = value;
        r += 1;
        c += 1;
      } // end while
    } // end down and right

    else {
      System.out.println("Choose a value between 0-3.");
    } // end else

    print2d(d2);
    System.out.println();

  } //end diagonal


  public static void main(String[] args) {

    System.out.println("Hello world!");

    int rows = 20;
    int cols = 20;

    int[][] grid = new int[rows][cols];

    //print2d(grid);
    //System.out.println();

    diagonal(grid, 1, 4, 3, 777);

    //rowPop(grid, 5, 255);
    //colPop(grid, 4, 255);
    //invert(grid);
    //invert(grid);
  } // end public static void main
} // end class GridImage
