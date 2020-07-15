/**
   classwork -- Day 10 | 0b1010 | 0x10
   class: Boogle
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

public class Boogle {

//return index of first occurence of target, or -1 if not found
public static int linSearch(ArrayList al, int target)
{
        for(int pos = 0; pos < al.size(); pos++) {
                if (al.get(pos).equals(target))
                        return pos;
        }
        return -1;
}  //end linSearch()


//return index of target, or -1 if not found
public static int binSearch(ArrayList arr, int target) {

        int arrLength = arr.size();
        int startIndex = 0;
        int midIndex;
        int endIndex = arrLength - 1;

        while(startIndex <= endIndex) {

                midIndex = (startIndex + endIndex) / 2;

                if((int)arr.get(midIndex) == target) {
                        return midIndex;
                }
                else if(target < (int)arr.get(midIndex)) {
                        endIndex = midIndex - 1;
                }
                else if(target > (int)arr.get(midIndex)) {
                        startIndex = midIndex + 1;
                }
        }

        return -1;
}  //end binSearch()



// subgoal: recognize target found (and take what action?)
// subgoal: recognize search space exhausted (and take what action?)
// subgoal: recognize target in lowestIndexOfUnsortedValueser portion of range (and do what?)
// subgoal: recognize target in upper portion of range (and do what?)

//nota bene: A helper method could be very useful.
// Q: Why?
// Q: What would the parameters be for such a method?



//return ArrayList of random ints on range [lo,lo+hi)
public static ArrayList prestoArrayListo(int numItems, int lo, int hi) {
        ArrayList retArr = new ArrayList();

        for(int i=0; i<numItems; i++) {
                //System.out.println(i);  //diagnostic under-the-hood view
                //retArr.add( Math.random() ); // [0,1)
                //retArr.add( (int)Math.random() ); // 0
                //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
                retArr.add(lo + (int)(hi * Math.random())); // [lo,lo+hi)
        }
        return retArr;
}  //end prestoArrayListo()


//return ArrayList of random ints, sorted in ascending order
public static ArrayList prestoSortedArrayListo(int numItems, int lo, int hi) {
        ArrayList retArr = new ArrayList();

        //if requested, return empty ArrayList
        if (numItems<1) {
                return retArr;
        }
        //populate index 0
        retArr.add((int)(lo * Math.random()));

        //populate rest of indices, each one greater than last
        for(int i=1; i<numItems; i++) {
                //System.out.println(i);  //diagnostic under-the-hood view
                //retArr.add( Math.random() ); // [0,1)
                //retArr.add( (int)Math.random() ); // 0
                //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
                //retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
                //System.out.println(retArr.get(i-1));
                retArr.add((int)retArr.get(i-1)
                           + lo + (int)(hi * Math.random()));  // ["left neighbour",hi)
        }

        return retArr;
}  //end prestoSortedArrayListo()




// find and return the index of the smallest value in the
// ArrayList al from index lo to index hi inclusive
public static int findSmallest(ArrayList<Integer> al, int lo, int hi){
        // assume the first item is the smallest - call it our smallest so far

        // loop over all the items
        //   if the current item is smaller than the smalleest so far,
        //      then the current item becomes the new smallest so far

        // change this to return the correct answer


        if(lo > hi) {
                return -1;
        }
        if(lo > al.size()-1 || lo < 0) {
                return -1;
        }
        if(hi > al.size()-1 || hi < 0) {
                return -1;
        }

        int smallestIndex = lo;
        int smallestValue = al.get(lo);

        for(int i = lo + 1; i <= hi; i++) {
                if(al.get(i) < smallestValue) {
                        smallestIndex = i;
                        smallestValue = al.get(i);
                }
        }

        return smallestIndex;
}


public static void sort(ArrayList<Integer> arr) {

        int largerValue;
        int smallestValue;
        int high = arr.size() - 1;
        int indexOfSmallestValue;

        for(int lowestIndexOfUnsortedValues = 0; lowestIndexOfUnsortedValues < high; lowestIndexOfUnsortedValues++) {
                indexOfSmallestValue = findSmallest(arr, lowestIndexOfUnsortedValues, high);

                largerValue = arr.get(lowestIndexOfUnsortedValues);
                smallestValue = arr.get(indexOfSmallestValue);

                arr.set(lowestIndexOfUnsortedValues, smallestValue);
                arr.set(indexOfSmallestValue, largerValue);
        }

}



public static void main(String[] args) {
        /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
           System.out.println("\n"+"al000"+":");
           ArrayList al000 = prestoArrayListo(0,0,0);
           System.out.println(al000);
           System.out.println(linSearch(al000,3));
           System.out.println("\n"+"al01"+":");
           ArrayList al01 = prestoArrayListo(5,0,100);
           System.out.println(al01);
           System.out.println(linSearch(al01,3));
           System.out.println("\n"+"al02"+":");
           ArrayList al02 = prestoArrayListo(5,3,10);
           System.out.println(al02);
           System.out.println(linSearch(al02,3));
           System.out.println("\n"+"al05"+":");
           ArrayList al05 = prestoArrayListo(20,1,5);
           System.out.println(al05);
           System.out.println(linSearch(al05,3));
           ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


        // test battery using sorted ArrayLists as search space

        /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~

           System.out.println("\n"+"sal000"+":");
           ArrayList sal000 = prestoSortedArrayListo(0,0,0);
           System.out.println(sal000);
           System.out.println(linSearch(sal000,3));
           System.out.println(binSearch(sal000,3));

           System.out.println("\n"+"sal00"+":");
           ArrayList sal00 = prestoSortedArrayListo(5,0,100);
           System.out.println(sal00);
           System.out.println(linSearch(sal00,3));
           System.out.println(binSearch(sal00,3));

           System.out.println("\n"+"sal01"+":");
           ArrayList sal01 = prestoSortedArrayListo(5,0,100);
           System.out.println(sal01);
           System.out.println(linSearch(sal01,3));
           System.out.println(binSearch(sal01,3));

           System.out.println("\n"+"sal02"+":");
           ArrayList sal02 = prestoSortedArrayListo(5,3,100);
           System.out.println(sal02);
           System.out.println(linSearch(sal02,3));
           System.out.println(binSearch(sal02,3));

           System.out.println("\n"+"sal03"+":");
           ArrayList sal03 = prestoSortedArrayListo(5,0,100);
           System.out.println(sal03);
           System.out.println(linSearch(sal03,3));
           System.out.println(binSearch(sal03,3));

           System.out.println("\n"+"sal04"+":");
           ArrayList sal04 = prestoSortedArrayListo(20,0,3);
           System.out.println(sal04);
           System.out.println(linSearch(sal04,3));
           System.out.println(binSearch(sal04,3));

           System.out.println("\n"+"sal05"+":");
           ArrayList sal05 = prestoSortedArrayListo(20,1,5);
           System.out.println(sal05);
           System.out.println(linSearch(sal05,3));
           System.out.println(binSearch(sal05,3));


           Systmem.out.println("")


           int smallIndex;
           System.out.println("Testing findSmallest");
           ArrayList<Integer>  slist = prestoArrayListo(20,0,200);
           smallIndex = findSmallest(slist,0,slist.size()-1);
           System.out.println(slist);
           System.out.printf("Smallest is at slist[%d] and is %d\n",smallIndex,slist.get(smallIndex));



           ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/

        //batch of commands for easier test case generation:
        /*
           System.out.println("\n"+"al"+":");
           ArrayList al = prestoArrayListo(,,);
           System.out.println(al);
           System.out.println(linSearch(al, ));
           System.out.println(binSearch(al, ));
         */



         /**
               ~~~ The RSPB Special Trace-athon ~~~
               YOUR MISSION:
               Form a Dynamic Duo of Destiny or a Trio of Triump. Conjure team name portending greatness (TNPG).
               Copypasta this into main method of your java sourcecode file containing methods linSearch and binSearch
                 (Boogle.java for almost all of you)
               Verify it works.
                  (If any test calls do not yield expected outputs, there is some tuning to be done...
                   Probably best to just grab a working version for now.)
               On KtS, with at least 1 tracing buddy, trace out each binSearch() call.
               NOTA BENE: The second batch of test calls are identical to the first,
                          except that the search space has grown by 1 element...
             **/


/*
            ArrayList salamander = new ArrayList();

            //explicitly fill arraylist with intent to search for
            // present and nonpresent values...
            // generate an arraylist with an odd num of elems...
            salamander.add(4);
            salamander.add(8);
            salamander.add(15);
            salamander.add(16);
            salamander.add(23);
            System.out.println(salamander);

            //search for target in the list
            System.out.println(binSearch(salamander, 8));  // 1
            System.out.println(binSearch(salamander, 15)); // 2
            System.out.println(binSearch(salamander, 16)); // 3

            //search for target not in the list
            System.out.println(binSearch(salamander, 3)); // -1
            System.out.println(binSearch(salamander, 9)); // -1

            //add another element, for an even num of elems
            salamander.add(42);
            System.out.println(salamander);
            //search for target in the list
            System.out.println(binSearch(salamander, 8));  // 1
            System.out.println(binSearch(salamander, 15)); // 2
            System.out.println(binSearch(salamander, 16)); // 3

            //search for target not in the list
            System.out.println(binSearch(salamander, 3)); // -1
            System.out.println(binSearch(salamander, 9)); // -1


            System.out.println("\n"+"sal05"+":");
            ArrayList sal05 = prestoArrayListo(20,1,100);
            System.out.println(sal05);

            System.out.println();

            System.out.println("Sorted Array");
            sort(sal05);
            System.out.println(sal05);

*/

}  //end main

}//end class
