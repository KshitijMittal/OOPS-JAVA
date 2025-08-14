// 4th Program
public class Data_Types_Info {
    public static void main(String[] args) {

        System.out.println("===== PRIMITIVE DATA TYPES =====");
        System.out.println("byte:");
        System.out.println("Size: " + Byte.BYTES + " bytes");
        System.out.println("Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("short:");
        System.out.println("Size: " + Short.BYTES + " bytes");
        System.out.println("Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("int:");
        System.out.println("Size: " + Integer.BYTES + " bytes");
        System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("long:");
        System.out.println("Size: " + Long.BYTES + " bytes");
        System.out.println("Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("float:");
        System.out.println("Size: " + Float.BYTES + " bytes");
        System.out.println("Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("double:");
        System.out.println("Size: " + Double.BYTES + " bytes");
        System.out.println("Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("char:");
        System.out.println("Size: " + Character.BYTES + " bytes");
        System.out.println("Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println();

        System.out.println("boolean:");
        System.out.println("Size: Not precisely defined (typically 1 bit or 1 byte)");
        System.out.println("Range: true or false");
        System.out.println();

        System.out.println("===== NON-PRIMITIVE DATA TYPES =====");
        System.out.println("String: Represents a sequence of characters. Size varies based on content.");
        System.out.println("Array: Container object that holds fixed number of values of a single type.");
        System.out.println("Class: Blueprint for creating objects.");
        System.out.println("Object: Root class of all Java classes.");
    }
}