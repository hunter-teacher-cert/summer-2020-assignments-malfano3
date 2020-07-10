import java.io.*;
import java.util.*;

public class MyStack {
// add your internal data structure here
private LList linked_list;
private int numItems;

public MyStack(){
        // add constructor code
        this.linked_list = new LList();
        this.numItems = this.linked_list.numNodes();
}

public void push(String data){
        // add code to push data on to the stack

}
/*
   public String pop(){
        // add code to remove and return the
        // item on the top of the stack
   }

   public String top(){
        // add code to return but not remove the
        // item on the top of the stack
   }

   public boolean isEmpty(){
        // return true if the stack has no data, false otherwise
   }

   public int size(){
        // add code to return the number of items currently on the stack
   }
 */
} // class MyStack
