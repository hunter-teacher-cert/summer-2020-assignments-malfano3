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

private void preorderTraverse(TreeNode current){
        if (current == null)
                return;

        //process the current node
        System.out.print(current.getData()+", ");

        // recursively print out the left subtree
        preorderTraverse(current.getLeft());

        // recursively print out the right subtree
        preorderTraverse(current.getRight());
}

public void preorderTraverse(){
        preorderTraverse(root);
        System.out.println();
}

private void postorderTraverse(TreeNode current){
        if (current == null)
                return;

        // recursively print out the left subtree
        postorderTraverse(current.getLeft());

        // recursively print out the right subtree
        postorderTraverse(current.getRight());

        //process the current node
        System.out.print(current.getData()+", ");



}

public void postorderTraverse(){
        postorderTraverse(root);
        System.out.println();
}

private void inorderTraverse(TreeNode current){
        if (current == null)
                return;


        // recursively print out the left subtree
        inorderTraverse(current.getLeft());

        //process the current node
        System.out.print(current.getData()+", ");

        // recursively print out the right subtree
        inorderTraverse(current.getRight());
}

public void inorderTraverse(){
        inorderTraverse(root);
        System.out.println();
}

public void delete(int key){

        // if the tree is empty, nothing to delete
        if (root == null) {
                return;
        }


        // find the node that we want to delete
        // and the node above it using piggybacking
        TreeNode front = root;
        TreeNode trailer = root;

        // do the piggyback loop
        // until we either find the node or null
        // if the key isn't present
        while (front != null && front.getData() != key ) {
                if (key > front.getData()) {
                        trailer = front;
                        front = front.getRight();
                } else {
                        trailer = front;
                        front = front.getLeft();
                }
        }

        // if the key wasn't in the tree
        if (front == null) {
                return;
        }

        // if we get here
        // front points to the node we want to delete
        // and trailer points to the one above it

        // case 1 -- the node we want to delete is a leaf
        if (front.getLeft() == null && front.getRight() == null) {
                // repoint front's parent to null
                if (trailer.getLeft().getData() == front.getData()) { // check to see if front is left of trailer
                        trailer.setLeft(null);
                }
                else if (trailer.getRight().getData() == front.getData()) { // check to see if front is right of trailer
                        trailer.setRight(null);
                }
        }

        // case 2 -- the node we want to delete has one child
        else if (front.getLeft() == null || front.getRight() == null) { // check if front has only one child (both can't be null or case 1 would catch it)
                // repoint front's parent to front's child

                if (front.getLeft() == null) { // front only has a right child
                        // determine if front is left or right of trailer
                        if (trailer.getLeft().getData() == front.getData()) { // front is left of trailer
                                trailer.setLeft(front.getRight()); // set trailer left to front.getRight()
                        }
                        else if (trailer.getRight().getData() == front.getData()) { // front is right of trailer
                                trailer.setRight(front.getRight()); // set trailer right to front.getRight()
                        }



                }
                else if (front.getRight() == null) { // front only has left child
                        // determine if front is left or right of trailer
                        if (trailer.getLeft().getData() == front.getData()) { // front is left of trailer
                                trailer.setLeft(front.getLeft()); // set trailer left to front.getLeft()
                        }
                        else if (trailer.getRight().getData() == front.getData()) { // front is right of trailer
                                trailer.setRight(front.getLeft()); // set trailer right to front.getLeft()
                        }

                }
        }

        // case 3 -- the node we want to delete has two children
        else {
                // front has two children
                //
                // find the node with the largest value
                // on fronts left subtree
                // and replace front with it.
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
