
// Java program to print the area and perimeter of a rectangle.
public class Area_14 {

    float width=5.6f;  //Instance variable
    static float height=8.5f;  //static variable

// main method
    public static void main(String[] args){
        Area_14 ob = new Area_14();
        ob.area(); // CALL INSTANCE METHOD TO STATIC AREA THROUGH OBJECT

    }
    // Instance method
    void area(){

        float area,perimeter;  //Loacal variable

        area=width*Area_14.height; //call instance variable direct and static variable via classname
        perimeter=2*(width+Area_14.height);

        System.out.println("Area of rectangle= "+area);
        System.out.println("Perimeter of rectangle= "+perimeter);

    }
}
