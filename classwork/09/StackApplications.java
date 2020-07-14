import java.io.*;
import java.util.*;

public class StackApplications {


public static String reverse(String s) {
        String result = new String();
        Stack<String> myStack = new Stack<String>();
        //
        for(int i = 0; i < s.length(); i++) {
                myStack.push(Character.toString(s.charAt(i)));
        }

        while(!myStack.empty()) {
                result += myStack.pop();
        } // while stack is not empty

        //
        return result;
} // end reverse()

public static String reverseWords(String s) {
        int numWords = 0;
        int spaceCount = 0;
        String result = new String();
        Stack<String> myStack = new Stack<String>();

        // count how many spaces in parameter string
        for(int i = 0; i < s.length(); i++) {
                if(Character.toString(s.charAt(i)).equals(" ")) {
                        spaceCount++;
                }
        }
        numWords = spaceCount + 1;

        String[] arr = new String[numWords];

        arr = s.split(" ");

        for(int i = 0; i != numWords; i++) {
                myStack.push(arr[i]);
        }

        while(!myStack.empty()) {
                result += myStack.pop() + " ";
        } // while stack is not empty

        //
        return result;
} // end reverse()

public static boolean isPalindrome(String s) {
        String result = new String();
        //
        result = reverse(s);
        //
        return s.equals(result);
} // end isPalindrome()

public static boolean parenCheck(String s) {
        int openParenCount = 0;
        int closedParenCount = 0;
        Stack<String> myStack = new Stack<String>();

        // add all characters to myStack
        for(int i = 0; i < s.length(); i++) {
                if(i == 0 && Character.toString(s.charAt(i)).equals("(")) {
                        myStack.push(Character.toString(s.charAt(i)));
                }
                else if(i == 0 && Character.toString(s.charAt(i)).equals(")")) {
                        return false;
                }
                else if(Character.toString(s.charAt(i)).equals("(")) {
                        myStack.push(Character.toString(s.charAt(i)));
                }
                else if(Character.toString(s.charAt(i)).equals(")")) {
                        try {
                                myStack.pop();
                        }
                        catch(EmptyStackException e) {
                                return false;
                        }
                }
                else {
                        continue;
                }
        } // end for loop

        return myStack.empty();


} // end parenCheck()

public static void main(String[] args) {

        System.out.println();

        System.out.println("reverse(\"esrever gnitset\"): " + reverse("esrever gnitset")); // testing reverse
        System.out.println("isPalindrome(\"racecar\"): " + isPalindrome("racecar")); // testing isPalindrome("racecar")
        System.out.println("isPalindrome(\"racecars\"): " + isPalindrome("racecars")); // testing isPalindrome("racecars")
        System.out.println("parenCheck(\"(2+3+4(7+3) + (8-5))\"): " + parenCheck("(2+3+4(7+3) + (8-5))")); // true
        System.out.println("parenCheck(\"(2+3+4(7+3 + (8-5))\"): " + parenCheck("(2+3+4(7+3 + (8-5))")); // false
        System.out.println("reverseWords(\"fun is this\"): " + reverseWords("fun is this"));

        System.out.println();

}

} // end class StackApplications
