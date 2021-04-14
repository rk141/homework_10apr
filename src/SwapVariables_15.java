import java.util.Scanner;

// Write a Java program to swap two variables.
public class SwapVariables_15 {

    // main method
    public static void main(String[] args){
        swap(); // call static method in static area

    }
    // Instance method
    static void swap() {

        int first, second, third;  //Local variable
        Scanner num = new Scanner(System.in); //create object

        System.out.print("Enter first number: ");
        first = num.nextInt();
        System.out.print("Enter second number: ");
        second = num.nextInt();

        //Logic for swap number

        third = first;
        first = second;
        second = third;
        System.out.println("After swaping number");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }

    }
