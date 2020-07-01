// Solving exercises 2, 3, and 8 from chapter 6

/**
*Write a method named isDivisible that takes two integers,
n and m, and that returns true if n is divisible by m,
and false otherwise.
*/

public class Methods {

  public static boolean isDivisible(int n, int m) {
    return n % m == 0;
  } // end isDivisible

  public static boolean isTriangle (int a, int b, int c) {
    return (a + b > c && a + c > b && b + c > a);
  } // end isTriangle

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

  public static void main(String[] args){
    System.out.println(isDivisible(10,5)); //test isDivisible
    System.out.println(isTriangle(3, 4, 5)); // test isTriangle
    System.out.println(ack(3, 4)); // test ack
  } // end main method


} // end class Methods
