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

        // System.out.println("Front = " + front.getData());
        // System.out.println("Trailer = " + trailer.getData());


        // case 1 -- the node we want to delete is a leaf
        if (front.getLeft() == null && front.getRight() == null) {
                // repoint front's parent to null
                if (front == trailer.getLeft()) { // check to see if front is left of trailer
                        trailer.setLeft(null);
                }
                else if (front == trailer.getRight()) { // check to see if front is right of trailer
                        trailer.setRight(null);
                }
        }

        // case 2 -- the node we want to delete has one child
        else if ( (front.getLeft() == null && front.getRight() != null) || (front.getLeft() != null && front.getRight() == null) ) { // check if front has exactly one child
                // repoint front's parent to front's child
                if(front.getLeft() != null) {
                        trailer.setLeft(front.getLeft());
                }
                else if(front.getRight() != null) {
                        trailer.setRight(front.getRight());
                }

        }

        // case 3 -- the node we want to delete has two children
        else {
                // front has two children
                //
                // Steps -- find the node with the largest value on fronts left
                // subtree and replace front with it.
                //       do the piggyback loop
                //       until we either find the node to delete
                //       or null if the key isn't present

                System.out.println("Front = " + front.getData());
                System.out.println("Trailer = " + trailer.getData());

                TreeNode tempRightFront = front.getLeft();
                TreeNode tempRightMiddleTrailer = front;
                TreeNode tempRightBackTrailer = front;

                // System.out.println(tempRightFront.getData());
                // System.out.println(tempRightMiddleTrailer.getData());
                // System.out.println(tempRightBackTrailer.getData());

                TreeNode frontGetRight = front.getRight(); // temp value
                TreeNode frontGetLeft = front.getLeft(); // temp value

                while(tempRightFront != null) {
                        tempRightBackTrailer = tempRightMiddleTrailer;
                        tempRightMiddleTrailer = tempRightFront;
                        tempRightFront = tempRightFront.getRight();
                }

                // tempRightMiddleTrailer is at value that will replace front

                if(tempRightMiddleTrailer.getLeft() == null) { // value to replace is a leaf (no children)  THIS IS GOOD
                        if (front == trailer.getLeft()) { // front is left of trailer
                                tempRightMiddleTrailer.setRight(front.getRight());
                                if(tempRightMiddleTrailer != front.getLeft()) {
                                        tempRightMiddleTrailer.setLeft(frontGetLeft);
                                }
                                trailer.setLeft(tempRightMiddleTrailer); // set trailer left to front.getLeft()

                                if(tempRightMiddleTrailer == tempRightBackTrailer.getLeft()) {
                                        tempRightBackTrailer.setLeft(null);
                                }
                                else if(tempRightMiddleTrailer == tempRightBackTrailer.getRight()) {
                                        tempRightBackTrailer.setRight(null);
                                }

                        }
                        else if (front == trailer.getRight()) { // front is right of trailer
                                tempRightMiddleTrailer.setRight(front.getRight());
                                if(tempRightMiddleTrailer != front.getLeft()) {
                                        tempRightMiddleTrailer.setLeft(frontGetLeft);
                                }
                                trailer.setRight(tempRightMiddleTrailer); // set trailer right to front.getLeft()

                                if(tempRightMiddleTrailer == tempRightBackTrailer.getLeft()) {
                                        tempRightBackTrailer.setLeft(null);
                                }
                                else if(tempRightMiddleTrailer == tempRightBackTrailer.getRight()) {
                                        tempRightBackTrailer.setRight(null);
                                }
                        }
                } // THIS IS GOOD

                else if(tempRightMiddleTrailer.getLeft() != null) { // value is a parent with children
                        if (trailer.getLeft().getData() == front.getData()) { // front is left of trailer
                                trailer.setLeft(tempRightMiddleTrailer); // set trailer left to front.getLeft()
                        }
                        else if (trailer.getRight().getData() == front.getData()) { // front is right of trailer
                                trailer.setRight(tempRightMiddleTrailer); // set trailer right to front.getLeft()
                        }

                        // tempRightMiddleTrailer.setRight(frontGetRight); // need more here...

                        TreeNode leftFront = tempRightMiddleTrailer;
                        TreeNode leftTrailer = tempRightMiddleTrailer;

                        while(leftFront != null) {
                                leftTrailer = leftFront;
                                leftFront = leftFront.getLeft();
                        }
                        leftTrailer.setLeft(frontGetLeft);

                        TreeNode rightFront = tempRightMiddleTrailer;
                        TreeNode rightTrailer = tempRightMiddleTrailer;

                        while(rightFront != null) {
                                rightTrailer = rightFront;
                                rightFront = rightFront.getRight();
                        }
                        rightTrailer.setRight(frontGetRight);

                        // tempRightBackTrailer.setRight(null); not yet


                }




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

        root.getLeft().setRight(new TreeNode(8));

        t = new TreeNode(15);
        root.getRight().setLeft(t);

        t = new TreeNode(22);
        root.getRight().setRight(t);

}


}
