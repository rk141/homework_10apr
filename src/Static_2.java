
public class Static_2 {

    static int a = 10;
    static String name = "Rajendra";

    // main method

    public static void main(String[] args){
        var(); // static method calling in main method


    }
    // static method
    static void var(){

        System.out.println(a); // static variable calling
        System.out.println(name); // static variable calling

    }
}
