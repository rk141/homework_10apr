
import java.util.Scanner; // scanner import

public class TriangleArea_8 {


// main method
    public static void main(String[] args){

        TriangleArea_8 ob = new TriangleArea_8(); // Object created
        ob.area(); // Instance method calling in static area
    }
    void area(){

        Scanner sc = new Scanner(System.in); // scanner object

        System.out.print("Input the value for Base : ");
        System.out.println("Input the value for Height : ");

        double b = sc.nextDouble(); // Instance variable
        double h = sc.nextDouble(); // Instance variable
        double Area = (b*h)/2;      // Formula for area of triangle

        System.out.println("Area of Triangle : " + Area);
    }

}
