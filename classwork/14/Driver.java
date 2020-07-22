import java.io.*;
import java.util.*;


public class Driver {
public static void main(String[] args) {
        BSTree t = new BSTree();

        t.insert(50);
        t.insert(25);
        t.insert(15);
        t.insert(10);
        t.insert(18);
        t.insert(35);
        t.insert(30);
        t.insert(27);
        t.insert(26);
        t.insert(28);
        t.insert(31);
        t.insert(32);
        t.insert(33);
        t.insert(32);
        t.insert(40);
        t.insert(75);
        t.insert(65);
        t.insert(60);
        t.insert(60);
        t.insert(68);
        t.insert(85);
        t.insert(80);
        t.insert(89);
        // t.insert(120);
        // t.insert(100);
        // t.insert(140);



        System.out.println();
        System.out.println("Full Tree");
        t.preorderTraverse();
        // t.postorderTraverse();
        // t.inorderTraverse();

        System.out.println();

        int value = 65;
        System.out.println("Deleting " + value);
        t.delete(value);
        t.preorderTraverse();
        System.out.println();





}
}
