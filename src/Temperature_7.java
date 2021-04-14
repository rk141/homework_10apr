// Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
import java.util.Scanner; // Scanner imported

public class Temperature_7 {

    // main method
    public static void main(String[] args){
        celcius(); // call static to static area direct


    }
    // static method

    static void celcius(){

        Scanner sc = new Scanner(System.in); // Object created

        System.out.print("Input a degree in fahrenheit : ");
        double f = sc.nextDouble();

        double  celsius =(( 5 *(f - 32.0)) / 9.0);
        System.out.println(f + " degree Fahrenheit is equal to " + celsius + " degree0 Celsius");


    }
}
