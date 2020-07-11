import java.io.*;
import java.util.*;

public class MyStackDriver {

public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("** Initiating MyStackDriver... **");
        System.out.println();
        System.out.println();

        System.out.println("** Test creating and printing new, empty stack **");
        MyStack s = new MyStack();
        System.out.println(s);
        System.out.println();


        System.out.println("** Testing isEmpty() **");
        System.out.println(s.isEmpty());
        System.out.println();


        System.out.println("** Testing push() \"Happy New Year\"...\"One\", \"Two\", ..., \"Countdown starting!\" **");
        s.push("Happy New Year!");
        s.push("ONE");
        s.push("TWO");
        s.push("THREE");
        s.push("FOUR");
        s.push("FIVE");
        s.push("SIX");
        s.push("SEVEN");
        s.push("EIGHT");
        s.push("NINE");
        s.push("TEN");
        s.push("ELEVEN");
        s.push("TWELVE");
        s.push("THIRTEEN");
        s.push("FOURTEEN");
        s.push("FIFTEEN");
        s.push("Countdown starting!");
        System.out.println(s);
        System.out.println();


        System.out.println("** Testing isEmpty() **");
        System.out.println(s.isEmpty());
        System.out.println();


        System.out.println("** Testing top() **");
        System.out.println(s.top());
        System.out.println();


        System.out.println("** Print stack, then pop() each item **");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println();


        System.out.println("** Testing isEmpty() **");
        System.out.println(s.isEmpty());
        System.out.println();


        System.out.println("** Testing top() on empty stack **");
        System.out.println(s.top());
        System.out.println();


        System.out.println("** Testing pop() on empty stack **");
        System.out.println(s.pop());
        System.out.println();


        System.out.println("** Testing push() of two final values **");
        s.push("Hello");
        s.push("MyStackDriver completed successfully!");
        System.out.println(s);
        System.out.println();


        System.out.println("** Testing pop() of final value tt**");
        System.out.println(s.pop());
        System.out.println();


} // end main


} // end MyStackDriver
