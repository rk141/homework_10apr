import java.util.Scanner;

// Convert decimal number to binary number
public class DecimalBinary_17 {
   // Main method
    public static void main(String[] args) {
        DecimalBinary_17 ob = new DecimalBinary_17();
        ob.binary(); // CALL INSTANCE METHOD TO STATIC AREA THROUGH OBJECT


    }
    // Instance method
    void binary(){

        Scanner sc = new Scanner(System.in); // Scanner for inputs
        System.out.print("Enter decimal number: ");
        int a = sc.nextInt();

        System.out.println( "Binary number = " + (Integer.toBinaryString(a)));
        // Integer.toBinaryString command converts your entered numbers into binary numbers.


    }

}
