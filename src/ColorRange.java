import java.util.*;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your wavelength: ");
        double wavelength = sc.nextDouble();
        if((wavelength>=380)&&(wavelength<=450)){
            System.out.println("Your color is Violet");
        }
        else if ((wavelength>=450.1)&&(wavelength<=495)){
            System.out.println("Your color is blue");
        }
        else if ((wavelength>=495.01)&&(wavelength<=570)){
            System.out.println("Your color is green");
        }
        else if ((wavelength>=570.1)&&(wavelength<=590)){
            System.out.println("Your color is yellow");
        }
        else if ((wavelength>=590.1)&&(wavelength<=620)){
            System.out.println("Your color is orange");
        }
        else if ((wavelength>=620.1)&&(wavelength<=750)){
            System.out.println("You color is red");
        }
        else{
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
}
