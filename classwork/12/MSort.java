import java.io.*;
import java.util.*;

public class MSort {


//return ArrayList of randList1m ints on range [lo,lo+hi)
public static ArrayList<Integer> prestoArrayListo(int numItems, int lo, int hi) {
        ArrayList<Integer> retArr = new ArrayList<Integer>();

        for(int i=0; i<numItems; i++) {
                retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
        }
        return retArr;
}  //end prestoArrayListo()

// find and return the index of the smallest value in the
// ArrayList al from index lo to index hi inclusive
public static int findSmallest(ArrayList<Integer> al, int lo, int hi) {
        int maxIndexSoFar = lo;
        for (int i = lo; i <=hi; i++) {
                if (al.get(i) < al.get(maxIndexSoFar)) {
                        maxIndexSoFar = i;
                }
        }
        return maxIndexSoFar;
}

public static void selectionSort(ArrayList<Integer> al) {

        int lo = 0;
        int temp;

        for (int i=0; i < al.size() - 1; i++) {
                lo = findSmallest(al, i, al.size()-1);
                temp = al.get(i);
                al.set(i, al.get(lo));
                al.set(lo, temp);
        }

}  //selectionSort

//returns a sublist of al containing the elements at indices in the range [lo, hi)
public static ArrayList<Integer> slice(ArrayList<Integer> al, int lo, int hi) {

        ArrayList<Integer> sub = new ArrayList<Integer>();
        for (; lo < hi; lo++) {
                sub.add( al.get(lo) );
        }//copy
        return sub;
}  //slice


//Input: 2 SORTED ArrayLists
//returns 1 new SORTED ArrayList containing all the elements from lists a and b
public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        //setup variables
        //   make a new ArrayList
        //   indices for each input
        int a_index = 0;
        int b_index = 0;
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int mergedListIndex = 0;

        //while both indices are less than their respective lengths
        //compare current index elements of each input list
        //add the smaller value to the new list
        //update index we took the value from
        //copy the values from the reamining list over  *** added to while loop ***
        //loop ends: one index is past the end of the list
        while(a_index != a.size() || b_index != b.size()) {

                if(a_index == a.size()) { // if list a is "empty"
                        while(b_index != b.size()) { // move all elements of list b into mergedList
                                mergedList.add(mergedListIndex, b.get(b_index));
                                mergedListIndex++;
                                b_index++;
                        }
                }
                else if(b_index == b.size()) { // if list b is "empty"
                        while(a_index != a.size()) { // move all elements of list a into mergedList
                                mergedList.add(mergedListIndex, a.get(a_index));
                                mergedListIndex++;
                                a_index++;
                        }
                }
                else if(a.get(a_index) <= b.get(b_index)) {
                        mergedList.add(mergedListIndex, a.get(a_index));
                        mergedListIndex++;
                        a_index++;
                }
                else if(b.get(b_index) < a.get(a_index)) {
                        mergedList.add(mergedListIndex, b.get(b_index));
                        mergedListIndex++;
                        b_index++;
                }

        } // end while

        //return the new list
        return mergedList;

}  // end merge()


public static void main(String[] args) {

        int numItems = 10;

        ArrayList<Integer> randList1 = prestoArrayListo(numItems, 0, 100);
        ArrayList<Integer> randList2 = prestoArrayListo(numItems, 0, 100);

        selectionSort(randList1);
        selectionSort(randList2);

        System.out.printf("randList1: %s\n", randList1);
        System.out.printf("randList2: %s\n", randList2);

        ArrayList<Integer> mergedList = merge(randList1, randList2);
        System.out.printf("mergedList: %s\n", mergedList);

}  //end main

}//end class
