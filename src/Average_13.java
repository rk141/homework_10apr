

import java.util.Scanner;

public class Average_13 {
    public static void main(String[] args){
        num();
    }

    static void num(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int Number1 = sc.nextInt();
        System.out.print("Enter second Number : ");
        int Number2 = sc.nextInt();
        System.out.print("Enter third Number : ");
        int Number3 = sc.nextInt();

        System.out.println("Average of three number = "+(Number1+Number2+Number3)/3);
    }

}
