/**
   classwork -- Day 10 | 0b1010 | 0x10
   class: Foogle
   A tester class for code analysis and search exploration.
   USAGE:
   Read through at least once.
   Compile, run.
   Comment/uncomment lines, recompile, run to explore functionality.
   "Lather, rinse, repeat" until comprehension achieved.
   Rename methods to indicate purpose.
   Insert comment preceding each method to summarize functionality.
   T. Mykolyk, F. Dragon
   June 2020
 **/

import java.io.*;
import java.util.*;

public class Foogle
{

//  searches through an ArrayList for "target" and returns its index
public static int indexOf( ArrayList al, int target )
{
        for( int pos=0; pos<al.size(); pos++) {
                if (al.get(pos).equals(target))
                        return pos;
        }
        return -1;
}   // end indexOf()

//  creates an array of "numItems" items between lo and hi
public static ArrayList randBetween(int numItems, int lo, int hi)
{
        ArrayList retArr = new ArrayList();

        for(int i=0; i<numItems; i++) {
                //System.out.println(i);  //diagnostic under-the-hood view
                //retArr.add( Math.random() ); // [0,1)
                //retArr.add( (int)Math.random() ); //0
                //retArr.add( (int)(hi * Math.random()) ); // [0, hi)
                retArr.add( lo + (int)(hi * Math.random()) ); // [lo , lo + hi)
        }
        return retArr;
}  //end randBetween()


//  Adds a random number from [lo, hi) to previous element
public static ArrayList addRandToPrev(int numItems, int lo, int hi)
{
        ArrayList retArr = new ArrayList();

        // do nothing
        if ( numItems<1 )
                return retArr;

        // begin array with number from [0 to lo)
        retArr.add( (int)(lo * Math.random()) ); // [0, lo)

        // make new element = previous element + [lo, lo + hi)
        for(int i=1; i<numItems; i++) {
                //System.out.println(i);  //diagnostic under-the-hood view
                //retArr.add( Math.random() ); // [0,1)
                //retArr.add( (int)Math.random() ); //0
                //retArr.add( (int)(hi * Math.random()) ); // [0, hi)
                //retArr.add( lo + (int)(hi * Math.random()) ); // [lo, hi)
                //System.out.println(retArr.get(i-1));  //diag.
                retArr.add( (int)retArr.get(i-1)
                            + lo + (int)(hi * Math.random()) ); // previous element + [lo, lo + hi)
        }

        return retArr;
}  //end addRandToPrev()


public static void main( String[] args )
{
        // test battery for randBetween()
        /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~

           System.out.println("\n"+"al000"+":");
           ArrayList al000 = randBetween(0,0,0);
           System.out.println(al000);

           System.out.println(indexOf(al000,3));
           System.out.println("\n"+"al01"+":");


           ArrayList al01 = randBetween(5,0,100);
           System.out.println(al01);
           System.out.println(indexOf(al01,3));

           System.out.println("\n"+"al02"+":");
           ArrayList al02 = randBetween(5,3,10);
           System.out.println(al02);
           System.out.println(indexOf(al02,3));

           System.out.println("\n"+"al05"+":");
           ArrayList al05 = randBetween(20,1,5);
           System.out.println(al05);
           System.out.println(indexOf(al05,3));

           ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


        // test battery for addRandToPrev()
        /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~

           System.out.println("\n"+"sal000"+":");
           ArrayList sal000 = addRandToPrev(0,0,0);
           System.out.println(sal000);
           System.out.println(indexOf(sal000,3));

           System.out.println("\n"+"sal00"+":");
           ArrayList sal00 = addRandToPrev(5,0,100);
           System.out.println(sal00);
           System.out.println(indexOf(sal00,3));

           System.out.println("\n"+"sal01"+":");
           ArrayList sal01 = addRandToPrev(5,0,100);
           System.out.println(sal01);
           System.out.println(indexOf(sal01,3));

           System.out.println("\n"+"sal02"+":");
           ArrayList sal02 = addRandToPrev(5,3,100);
           System.out.println(sal02);
           System.out.println(indexOf(sal02,3));

           System.out.println("\n"+"sal03"+":");
           ArrayList sal03 = addRandToPrev(5,0,100);
           System.out.println(sal03);
           System.out.println(indexOf(sal03,3));

           System.out.println("\n"+"sal04"+":");
           ArrayList sal04 = addRandToPrev(20,0,3);
           System.out.println(sal04);
           System.out.println(indexOf(sal04,3));

           System.out.println("\n"+"sal05"+":");
           ArrayList sal05 = addRandToPrev(20,1,5);
           System.out.println(sal05);
           System.out.println(indexOf(sal05,3));

           ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


           System.out.println("\n"+"al"+":");
           ArrayList al = randBetween(5,0,100);
           System.out.println(al);

}  //end main

}//end class
