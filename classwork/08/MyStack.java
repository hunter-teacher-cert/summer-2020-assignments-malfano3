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
        this.numItems = this.linked_list.getNumNodes();
}

public String pop(){
        // add code to remove and return the
        // item on the top of the stack
        if(this.numItems > 0) {
                String result = this.linked_list.getHead().getData();
                this.linked_list.setHeadNext();
                this.numItems = this.linked_list.getNumNodes();
                return result;
                //this.linked_list.reduceNumNodes();
        }
        else {
          return "";
        }

}


public String top(){
        // add code to return but not remove the
        // item on the top of the stack

        if(this.numItems == 0) {
                return "Stack empty.";
        }
        else if(this.numItems < 0) {
                throw new IndexOutOfBoundsException();
        }
        else {
                return this.linked_list.getHead().getData();
        }
}


public boolean isEmpty(){
        // return true if the stack has no data, false otherwise
        return this.numItems == 0;
}

public int size(){
        // add code to return the number of items currently on the stack
        return this.numItems;
}

public String toString(){

        if(this.numItems > 0) {

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
        else {
                return "< >";
        }
}

} // class MyStack
