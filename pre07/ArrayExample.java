import java.io.*;
import java.util.*;

public class ArrayExample {

  public static double[] powArray(double[] a, int p){
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = Math.pow(a[i], p);
    } // end for loop
    return b;
  } // end powArray

  public static int inRange(int[] a, int x) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] == x) {
            count++;
        }
    }
    return count;
  }

  public static int[] histogram(int[] arr) {
    int[] counts = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
      counts[i] = inRange(arr, i);
    } // end for loop
    return counts;
  } // end histogram


  public static int indexOfMax(int[] arr) {
    int largestIndex = 0;
    int largestValue;
    int x = 0;
    int y = 1;
    while(x < arr.length && y < arr.length){
      if (arr[x] > arr[y]) {
        largestValue = arr[x];
        largestIndex = x;
        y++;
      } // end if
      else if (arr[x] <= arr[y]) {
        largestValue = arr[y];
        largestIndex = y;
        x++;
      }
    } // end while
    return largestIndex;
  } // end indexOfMax

  public static boolean[] sieve(int n) {
    boolean[] arr = new boolean[n-1];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = true;
    } // end for loop
    for(int k = 0; k < arr.length; k++) {
      if(arr[k]) {
        int value = k + 2;
        int j = value;
        while(j < arr.length) {
          arr[j] = false;
          j = j + value;
        } //end while
      } //end if
    } //
    return arr;
  } // end sieve

  public static int[] numbers (int n) {
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i+2;
    }
    return arr;
  }




  public static void main(String[] args) {
    System.out.println("Hello world!");
    double[] a = new double[5];
    for (int i = 1; i < a.length + 1; i++) {
      a[i-1] = i;
    }
    powArray(a, 3);
    // System.out.println(Arrays.toString(powArray(a, 3)));

    int[] b = new int[10];
    for (int i = 1; i < b.length + 1; i++) {
      b[i-1] = i;
    }
    // System.out.println(Arrays.toString(histogram(b)));
    b[6] = 25;
    System.out.println(Arrays.toString(b));
    System.out.println(indexOfMax(b));

    System.out.println(Arrays.toString(sieve(10)));
    System.out.println(Arrays.toString(numbers(10)));

  } // end public static void main
} // end class ArrayExample
