import java.util.Scanner;
//-------------------------------------------------------------------------------
public class KillingKangaroos {
//-------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
//----The road kill probability constant and average road width in Australia
    private static final double ROADKILLCONSTANT = 1.47;
    private static final double AVGERAGEROADWIDTH = 0.01;
//--------------------------------------------------------------------------------
    public static void main(String[] args) {
//----Variable to hold system values
        double sidelength, roadlength, numberofkangaroos;
        double density, surfacearea, numberofkills;

//----Inputs for variables
        System.out.print("Enter side of square in km : ");
        sidelength = keyboard.nextDouble();

        System.out.print("Enter roads length in km : ");
        roadlength = keyboard.nextDouble();

        System.out.print("Enter number of Kangaroos : ");
        numberofkangaroos = keyboard.nextDouble();

//----Kangaroo density is number of kangaroos per square kilometer
        density = numberofkangaroos / (sidelength * sidelength);

//----Road surface area is calculated using average road width of 10 meters
        surfacearea = AVGERAGEROADWIDTH * roadlength;

//----Calculate expected number of kills
        numberofkills = (density * surfacearea) * ROADKILLCONSTANT;

//----Print out the expected number of kills
        System.out.println("Expected number of kills is : " + numberofkills);
    }
}
