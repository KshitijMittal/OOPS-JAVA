//Write a program to perform basic arithmetic operations.

import java.util.* ;
public class Arithmetic_Operations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a: ");
        float a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        float b = sc.nextInt();
        sc.close();
        
        System.out.println("The addition of a and b is "+ (a+b));
        System.out.println("The subtraction of a and b is "+ (a-b));
        System.out.println("The multiplication of a and b is "+ (a*b));
        System.out.println("The division of a and b is "+ (a/b));
        
    }
}