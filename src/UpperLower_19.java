import java.util.Scanner; // SCANNER IMPORT

public class UpperLower_19 {

    // MAIN METHOD
    public static void main(String[] args){
        UpperLower_19 ob = new UpperLower_19();  // OBJECT CREATED
        ob.lower(); // Calling instance method to static area
    }
    // Instance method
    void lower(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);

    }
}
