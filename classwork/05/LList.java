import java.io.*;
import java.util.*;


public class LList {
private Node head;

public LList(){
        head = null;
}

public void addFront(String value){
        Node newnode = new Node(value);

        // first point the new node to the beginning
        newnode.setNext(head);

        // point head to the new node
        head = newnode;

}

public boolean isEmpty() {
        if (head == null) {
                return true;
        }
        else {
                return false;
        }
}


public String get(int index) {
        int count = 0;
        Node tmp = new Node();
        tmp = this.head;
              while(count != index) {
                      tmp = tmp.getNext();
                      count++;
        }

        return tmp.getData();
}


public String toString(){
        String s = "";

        Node tmp;
        tmp = head;
        while (tmp != null) {
                s = s + tmp.getData()+"-->";
                // how can we now move tmp to the next node
                // this is the magic linked list idiom!!!!
                // this moves a pointer to the next node!!!
                // It's analagous to i=i+1 for an array (for loop)
                tmp = tmp.getNext();
        }


        s = s + "null";
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
