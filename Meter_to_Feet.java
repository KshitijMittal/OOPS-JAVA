// 5th Program
import java.util.* ;
public class Meter_to_Feet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value in meters: ");
        float a = sc.nextInt();
        sc.close();
        
        System.out.print("Your value in feet is "+ (a * 3.2808399));
        
    }
}