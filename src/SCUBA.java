import java.util.Scanner;
//-------------------------------------------------------------------------------
public class SCUBA {
//-------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);

//----The "feet per atmosphere" constant
    private static final double FEETPERATMOSPHERE = 33;

//--------------------------------------------------------------------------------
    public static void main(String[] args) {
//----Variable to hold system values
        int depth, percentoxygen;
        double ambientpressure, maxpressure, contingencypressure, pressuregroup;
//----Inputs for variables
        System.out.print("Enter depth and percentage O2   : ");
        depth = keyboard.nextInt();
        percentoxygen = keyboard.nextInt();
    }
}
