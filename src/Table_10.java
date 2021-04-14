
// prints its multiplication table up to 10.
import java.util.Scanner;
// main method
public class Table_10 {
    public static void main(String[] args){
        Table_10 ob = new Table_10();
        ob.num(); // object creation

    }
    // instance method
    void num(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Input Number : ");
        int a,b,result; //Local variable

        a=sc.nextInt(); //assign the value for a at run time
        b=a*1;
        System.out.println(a+" * 1= "+b);
        b=a*2;
        System.out.println(a+" * 2= "+b);
        b=a*3;
        System.out.println(a+" * 3= "+b);
        b=a*4;
        System.out.println(a+" * 4= "+b);
        b=a*5;
        System.out.println(a+" * 5= "+b);
        b=a*6;
        System.out.println(a+" * 6= "+b);
        b=a*7;
        System.out.println(a+" * 7= "+b);
        b=a*8;
        System.out.println(a+" * 8= "+b);
        b=a*9;
        System.out.println(a+" * 9= "+b);
        b=a*10;
        System.out.println(a+" * 10= "+b);
    }
}
