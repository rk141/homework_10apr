import java.util.Scanner;

// Write a Java program to add two binary numbers.
public class AddBinary_16 {

    public static void main(String[] args){

        AddBinary_16 ob = new AddBinary_16();
        ob.add(); // Call instance method to static area through object

    }
    // Instance method
    void add(){
        int d1, d2, d;  //Local variable
        Scanner str = new Scanner(System.in);  //create object

        System.out.print("Input first binary number: ");
        String b1 = str.nextLine();
        System.out.print("Input second binary number: ");
        String b2 = str.nextLine();
        d1 = Integer.parseInt(b1, 2);
        d2 = Integer.parseInt(b2, 2);
        d = d1 + d2;
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(d));

    }
}
