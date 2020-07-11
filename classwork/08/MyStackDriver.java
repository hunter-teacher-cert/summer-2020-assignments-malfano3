import java.io.*;
import java.util.*;

public class MyStackDriver {

public static void main(String[] args) {

        MyStack s = new MyStack();
        s.push("TEST");
        s.push("ANOTHER");
        s.push("NODE");
        System.out.println(s);
              // push seems to be working
              // Expected output: < NODE ANOTHER TEST >


        s.pop();
        System.out.println(s); // Expected output: < ANOTHER TEST >
        s.pop();
        System.out.println(s); // Expected output: < TEST >
        s.pop();
        System.out.println(s); // Expected output: < >
              // pop seems to be working



} // end main


} // end MyStackDriver
