import java.lang.reflect.Array;
import java.util.*;
public class TrafficLightChecker {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("0)Green 1)Yellow 2)Red");
        System.out.println("Enter a color code");
        int code = sc.nextInt();
        String color = "";
        String [] arr = {"Green", "Yellow", "Red"};
        switch(code) {
            case 0:
            case 1:
            case 2:
            if (code == 0) {
                System.out.println("Next Traffic light will be: " + arr[code + 1]);
            } else if (code == 1) {
                System.out.println("Next Traffic light will be: " + arr[code + 1]);
            } else if (code == 2) {
                System.out.println("Next Traffic light will be: " + arr[code - code]);
            }
            break;
            default:
                System.out.println("Invalid code");
        }
    }
}
