import java.io.*;
import java.util.*;

public class BSTree {
private TreeNode root;

public BSTree(){
        root = null;
}

public int search(int key){
        TreeNode current = root;

        while (current != null) {
                int currentValue = current.getData();
                if (currentValue == key) {
                        return currentValue;
                }
                else if (key < currentValue) {
                        current = current.getLeft();
                }
                else {
                        current = current.getRight();
                }
        }
        // do we really want to return -1?
        throw new NullPointerException();
}

public void insert(int key){

        TreeNode newNode = new TreeNode(key);

// if the tree is empty
// manually insert the new node as the root
        if (root == null) {
                root = newNode;
                return;
        }

        TreeNode front = root;
        TreeNode trailer = new TreeNode();

        while (front != null) {
                int frontValue = front.getData();
                if (frontValue == key) {
                        // if we're here, it means the key is
                        // already in the tree so we can
                        // update this node in some way
                        // and then return
                        return;
                }
                else if (key > frontValue) {
                        trailer = front;
                        front = front.getRight();
                }
                else {
                        trailer = front;
                        front = front.getLeft();
                }
        }
        if (key > trailer.getData()) {
                // insert on the right
                trailer.setRight(newNode);
        }
        else {
                // insert on left
                trailer.setLeft(newNode);

        }



}

public void seed(){
        TreeNode t;

        t = new TreeNode(10);
        root = t;
        t = new TreeNode(5);
        root.setLeft(t);
        t = new TreeNode(20);
        root.setRight(t);

        root.getLeft().setRight( new TreeNode(8));

        t = new TreeNode(15);
        root.getRight().setLeft(t);

        t = new TreeNode(22);
        root.getRight().setRight(t);

}


}
