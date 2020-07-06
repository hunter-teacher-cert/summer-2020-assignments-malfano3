import java.io.*;
import java.util.*;


public class SuperArray {
  private int[] data;
  private int numberElements;

  public SuperArray() {
    this.data = new int[10];
    this.numberElements = 0;
  }

  public SuperArray(int arraySize) {
    this.data = new int[arraySize];
    this.numberElements = 0;
  }

  public void add(int value) {
    if(this.numberElements < this.data.length) {
      this.data[numberElements] = value;
      this.numberElements++;
    }
    else{
      this.grow();
    }
  }

  public void add(int index, int value) {
    if(index == this.numberElements-1) { // index filled, shift required
      for(int i = numberElements; i > index; i--) {
        this.data[i] = this.data[i - 1];
      }
      this.data[index] = value;
      this.numberElements++;
    }
    else if(index >= this.numberElements) {
      if(this.numberElements < this.data.length) {
        this.data[index] = value;
        this.numberElements++;
      }
      else{
        this.grow();
        this.data[index] = value;
        this.numberElements++;
      }
    }
  }

  public int get(int index) {
    if(index < this.data.length) {
      return this.data[index];
    }
    else {
      return -1;
    }
  }

  public boolean isEmpty() {
    if(this.numberElements == 0) {
      return true;
    }
    else {
      return false;
    }
  }


  public String toString() {
    String myString = new String();

    for(int i = 0; i < this.data.length; i++) {
      myString += this.data[i] + " ";
    } // end for loop

    return myString;
  }


  public void grow() {
    int[] newArray = new int[this.data.length + 10];
    for(int i = 0; i < this.data.length; i++) {
      newArray[i] = this.data[i];
    }
    this.data = newArray;
  }







  public static void main(String[] args) {
    SuperArray myArray = new SuperArray();

    myArray.add(124);
    myArray.add(2);
    myArray.add(5);
    myArray.add(18);
    myArray.add(732);
    myArray.add(81);
    myArray.add(13);
    myArray.add(57);
    myArray.add(9);
    myArray.add(255);

    System.out.println(Arrays.toString(myArray.data));
    myArray.get(0);
    System.out.println(myArray.get(0));

    myArray.isEmpty();

    System.out.println(myArray.isEmpty());

    System.out.println("Testing toString below this:");
    System.out.println(myArray.toString());
    System.out.println();


    System.out.println("Testing grow below this:");
    myArray.grow();
    System.out.println(myArray.toString());
    System.out.println();
    myArray.grow();


  } // end main method
















} // end class SuperArray
