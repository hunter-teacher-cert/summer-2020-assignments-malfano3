import java.io.*;
import java.util.*;

public class MyStackDriver {

public static void main(String[] args) {
        System.out.println("Creating new stack.");
        MyStack s = new MyStack();
        System.out.println("Testing isEmpty()");
        System.out.println(s.isEmpty());
        System.out.println("Push TEST, ANOTHER, and NODE");
        s.push("TEST");
        s.push("ANOTHER");
        s.push("NODE");
        System.out.println(s);
        // push seems to be working
        // Expected output: < NODE ANOTHER TEST >

        System.out.println("Pop");
        // System.out.println(s.size());
        s.pop();
        System.out.println(s); // Expected output: < ANOTHER TEST >

        System.out.println("Testing isEmpty()");
        System.out.println(s.isEmpty());

        // System.out.println(s.size());
        s.pop();
        System.out.println(s); // Expected output: < TEST >

        // System.out.println(s.size());
        s.pop();
        System.out.println(s); // Expected output: < >

        // System.out.println(s.size());
        s.pop();
        System.out.println(s); // Expected output: "Stack empty, nothing to POP."

        // pop seems to be working

        System.out.println("Testing isEmpty()");
        System.out.println(s.isEmpty());



} // end main


} // end MyStackDriver
