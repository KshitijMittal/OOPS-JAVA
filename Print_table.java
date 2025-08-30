// Write a program to print the multiplication table of a given number, where n is the positive number entered by the user.

import java.util.* ;
public class Print_table {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println();

        System.out.println("Multiplication table of " + n + " is: ");

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
