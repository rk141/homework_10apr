
public class Temp_4 {

    int a = 10; // Instance variable
    int b = 20; // Instance variable
    static char c = 'M'; // static variable
    static String shop = "city"; // static variable

// Main method
    public static void main(String[] args){
        Temp_4 h = new Temp_4(); // object creation
        h.man(); // Instance method calling in  static area
        son();  //static method calling in static area

    }
    // Instance method
    void man(){
        System.out.println(a);// Instance variable to Instance area
        System.out.println(b); // Instance variable to Instance area
        System.out.println(Temp_4.c); // static variable to Instance area
        System.out.println(Temp_4.shop); // static variable to Instance area
    }
    // static method
    static void son(){
        Temp_4 obj = new Temp_4(); // Object creation

        System.out.println(obj.a); // Instance variable to static area
        System.out.println(obj.b); // Instance variable to static area
        System.out.println(c); // static variable to static area
        System.out.println(shop); // static variable to static area
    }
}
