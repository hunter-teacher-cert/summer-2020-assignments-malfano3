import java.io.*;
import java.util.*;

public class StackApplications {

// Stack<String> myStack = new Stack<String>();

public static String reverse(String s) {
        String result = new String();
        Stack<String> myStack = new Stack<String>();
        //
        for(int i = 0; i < s.length(); i++) {
                myStack.push(Character.toString(s.charAt(i)));
        }

        for(int i = 0; i < s.length(); i++) {
                result += myStack.pop();
        }
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
                myStack.push(Character.toString(s.charAt(i)));
                if(Character.toString(s.charAt(i)).equals("(")) {
                        openParenCount++;
                }
                else if(Character.toString(s.charAt(i)).equals(")")) {
                        closedParenCount++;
                }
        } // end for loop
        if(openParenCount != closedParenCount) {
          return false;
        }

        return openParenCount == closedParenCount;
} // end parenCheck()

public static void main(String[] args) {

        System.out.println("reverse(\"esrever gnitset\"): " + reverse("esrever gnitset")); // testing reverse

        System.out.println("isPalindrome(\"racecar\"): " + isPalindrome("racecar")); // testing isPalindrome("racecar")

        System.out.println("isPalindrome(\"racecars\"): " + isPalindrome("racecars")); // testing isPalindrome("racecars")

        System.out.println("parenCheck(\"(1+2+3) + (4*5)\"): " + parenCheck("(1+2+3) + (4*5)"));
}

} // end class StackApplications
