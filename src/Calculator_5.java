public class Calculator_5 {

    int a =20; // Instance variable
    int b = 10; // Instance variable

    // Main method
    public static void main(String[] args){
        Calculator_5 nokia = new Calculator_5(); // Object creation
        nokia.sum(); // Instance method calling in static area
        nokia.substract(); // Instance method calling in static area
        multiplication(); // static method calling in static area
        division(); // static method calling in static area
    }
    // Instance method
    void sum(){
        System.out.print("a+b = ");
        System.out.println(a+b);// Instance variable in Instance area
    }
    // Instance method
    void substract(){
        System.out.print("a-b = ");
        System.out.println(a-b); // Instance variable in Instance area
    }
    // static method
    static void multiplication(){
        Calculator_5 casio = new Calculator_5(); // Object creation
        System.out.print("a*b = ");
        System.out.println(casio.a*casio.b); // Instance variable in static area

    }
    // static method
    static void division(){
        Calculator_5 apple = new Calculator_5(); // Object creation
        System.out.print("a/b = ");
        System.out.println(apple.a/ apple.b); // Instance variable in static area

    }
}
