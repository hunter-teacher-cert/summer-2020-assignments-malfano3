import java.io.*;
import java.util.*;

public class StackApplicationsDriver {

public static void main(String[] args) {

        System.out.println();

        System.out.println("StackApplications.reverse(\"esrever gnitset\"): " + StackApplications.reverse("esrever gnitset"));   // desired result: testing reverse
        System.out.println("StackApplications.isPalindrome(\"racecar\"): " + StackApplications.isPalindrome("racecar"));   // desired result: true
        System.out.println("StackApplications.isPalindrome(\"racecars\"): " + StackApplications.isPalindrome("racecars"));   // desired result: false
        System.out.println("StackApplications.parenCheck(\"(2+3+4(7+3) + (8-5))\"): " + StackApplications.parenCheck("(2+3+4(7+3) + (8-5))"));   // desired result: true
        System.out.println("StackApplications.parenCheck(\"(2+3+4(7+3 + (8-5))\"): " + StackApplications.parenCheck("(2+3+4(7+3 + (8-5))"));   // desired result: false
        System.out.println("StackApplications.reverseWords(\"fun is this\"): " + StackApplications.reverseWords("fun is this"));   // desired result: this is fun
        System.out.println("StackApplications.isPalindromeWords(\"one two one\"): " + StackApplications.isPalindromeWords("one two one"));   // desired result: true
        System.out.println("StackApplications.parenCheckMulti(\"4{7+[6(5-3)+8]})\"): " + StackApplications.parenCheckMulti("4{7+[6(5-3)+8]}"));   // desired result: true
        System.out.println("StackApplications.parenCheckMulti(\"4{7+[6(5-3)+8}])\"): " + StackApplications.parenCheckMulti("4{7+[6(5-3)+8}]"));   // desired result: false

        System.out.println();


}

}
