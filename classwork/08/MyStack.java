import java.io.*;
import java.util.*;

public class MyStack {
// add your internal data structure here
private LList linked_list;
private int numItems;

public MyStack(){
        // add constructor code
        this.linked_list = new LList();
        this.numItems = this.linked_list.getNumNodes();
}

public void push(String data){
        // add code to push data on to the stack
        this.linked_list.addFront(data);
}

public String pop(){
        // add code to remove and return the
        // item on the top of the stack
        String result = this.linked_list.getHead().getData();
        this.linked_list.setHeadNext();
        this.linked_list.reduceNumNodes();
        return result;
}


public String top(){
        // add code to return but not remove the
        // item on the top of the stack

        if(this.linked_list.getHead().getData() == null) {
                return "Stack empty.";
        }
        else {
                return this.linked_list.getHead().getData();
        }
}


public boolean isEmpty(){
        // return true if the stack has no data, false otherwise
        return this.linked_list.getHead().getData() == null;
}

public int size(){
        // add code to return the number of items currently on the stack
        return this.numItems;
}

public String toString(){
        String s = "< ";

        Node tmp;
        tmp = this.linked_list.getHead();
        while (tmp != null) {
                s = s + tmp.getData()+" ";
                // how can we now move tmp to the next node
                // this is the magic linked list idiom!!!!
                // this moves a pointer to the next node!!!
                // It's analagous to i=i+1 for an array (for loop)
                tmp = tmp.getNext();
        }


        s = s + ">";
        return s;
}

} // class MyStack
