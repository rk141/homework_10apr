public class InsSta_3 {
    int a =10; // Instance variable
    static String house = "Banglo";  // static variable

    // main method

    public static void main(String[] args){
        InsSta_3 t = new InsSta_3(); // Object creation
        t.m(); // Instance to static area method calling
        n(); // static to static area method calling

    }
    // instance method
    void m(){

        System.out.println(a);
        System.out.println(house);
    }
    // static method
    static void n(){
        InsSta_3 s = new InsSta_3(); // Object creation
        System.out.println(s.a);
        System.out.println(house);


    }
}
