
// Program to print
public class Print_20 {

    // Main method
    public static void main(String[] args){

        Print_20 ob = new Print_20(); // Object created
        ob.corner(); //Calling instance method to static area
    }
    // Instance method
    void corner(){
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|      CORNER STORE      |");
        System.out.println("|                        |");
        System.out.println("| 2015-03-29 04:38PM     |");
        System.out.println("|                        |");
        System.out.println("| Gallons:       10.870  |");
        System.out.println("| Price/gallon: $ 2.089  |");
        System.out.println("|                        |");
        System.out.println("| Fuel total:  $ 22.71   |");
        System.out.println("|                        |");
        System.out.println("+------------------------+");

    }
}
