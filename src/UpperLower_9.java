
// correction required

import java.util.Scanner;

public class UpperLower_9 {

    public static void main(String[] args){
        UpperLower_9 ob = new UpperLower_9();
        ob.ul();

    }

    void ul (){
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.print("Type in Upper case : ");
        text = sc.nextLine();
        switch (text){
            case "A" :
                System.out.println("a");
                break;
        }

    }
}
