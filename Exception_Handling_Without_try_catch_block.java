// Java program to demonstrate exception handling without try-catch block

import java.util.*;
public class Exception_Handling_Without_try_catch_block {
    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);
        int a, b, c;

        System.out.print ("Enter first number: ");
        a = sc.nextInt();
        System.out.print ("Enter second number: ");
        b = sc.nextInt();

        c = a / b;

        System.out.println ("Result: " + c);
        System.out.print("Sorry other work.");
        sc.close();
    }
}
