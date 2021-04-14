
public class Instance1 {
    int a = 5;
    int b = 10;

    // Main method

    public static void main(String[] args){
        Instance1 obj = new Instance1(); // Object
        obj.ints(); // instance method calling

    }
    // Instance method

    void ints(){
        System.out.println(a); // Instance variable calling
        System.out.println(b); // Instance variable calling

    }

}
