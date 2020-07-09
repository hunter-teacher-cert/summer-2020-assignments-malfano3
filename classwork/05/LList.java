import java.io.*;
import java.util.*;
//new line of text added after git add but before git commit :)

public class LList {
private Node head;
private int numNodes;

public LList(){
        head = null;
        if() {

        }
        else {
          
        }
}

public void addFront(String value){
        Node newnode = new Node(value);

        // first point the new node to the beginning
        newnode.setNext(head);

        // point head to the new node
        head = newnode;
        numNodes++;

}

public int getLength() {
        return numNodes;
}

public boolean isEmpty() {
        return head == null;
}


public String get(int index) {
        int count = 0;
        Node tmp;
        tmp = this.head;
        while(count != index && tmp.getData() != null) {
                if(tmp.getNext() == null) {
                        return null;
                }
                else{
                        tmp = tmp.getNext();
                        count++;
                }
        }
        if(tmp.getData() == null) {
                String returnValue = null;
                return null;
        }
        else{
                return tmp.getData();
        }
}

public void set(int index, String value) {
        int count = 0;
        Node tmp;
        tmp = this.head;
        while(count != index && tmp.getData() != null) {
                if(tmp.getNext() == null) {
                        break;

                }
                else{
                        tmp = tmp.getNext();
                        count++;
                }
        }
        if(tmp.getNext() == null) {
                // do nothing
        }
        else{
                tmp.setData(value);
        }
}


public void insert(int index, String value) {
        // insert a new Node containing \value\ at \index\
        //         //
        // if \index\ is invalid, do nothing.
        //
        //



        // blank list, inserting at index = 0 (insert value at index = 0)
        //
        if(this.numNodes == 0 && index == 0) {
                this.addFront(value);
        }

        // blank list, inserting anywhere besides index = 0 (do nothing)
        //
        else if(this.numNodes == 0 && index != 0) {
                //do nothing
        }

        // insert in next available space in list
        //
        else if(index == numNodes) {
                int count = 0;
                Node tmp;
                tmp = this.head;

                while(count != index - 1) {
                        tmp = tmp.getNext();
                        count++;
                }
                tmp.getNext().setData(value);
                numNodes++;
        }

        // insert after empty Node (index >= numNodes + 1)
        //
        else if(index >= numNodes + 1) {
                // do nothing
        }

        // insert between two existing items
        //
        else if(index > 0 && index < numNodes - 1) {
                int count = 0;
                Node tmp;
                tmp = this.head;

                while(count != index - 1) {
                        tmp = tmp.getNext();
                        count++;
                }
                tmp.getNext().setData(value);
                numNodes++;
        }

}


public String toString(){
        String s = "< ";

        Node tmp;
        tmp = head;
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



public int length(){
        int l = 0;

        Node tmp;
        tmp = head;
        while (tmp != null) {
                l++;
                // how can we now move tmp to the next node
                // this is the magic linked list idiom!!!!
                // this moves a pointer to the next node!!!
                // It's analagous to i=i+1 for an array (for loop)
                tmp = tmp.getNext();
        }
        return l;

}
}
