
// Two number methamatical operation
import java.util.Scanner;  // scanner import

public class Sum_18 {

    // main method
    public static void main(String[] args){
        Sum_18 ob = new Sum_18(); // Object created
        ob.multi(); // Calling instance method to static area
    }
    // Instance method
    void multi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        int Number1 = sc.nextInt();
        System.out.print("Input second number : ");
        int Number2 = sc.nextInt();
        System.out.println(Number1+Number2);
        System.out.println(Number1-Number2);
        System.out.println(Number1*Number2);
        System.out.println(Number1/Number2);
        System.out.println(Number1%Number2);

    }
}
