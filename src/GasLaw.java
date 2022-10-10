import java.util.Scanner;
    //-----------------------------------------------------------------------------
public class GasLaw {
    //-----------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //----The gas constant in Joules/mole/K
    private static final double GASCONSTANT = 8.3143;

    //-----------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold system values
        double Volume,Moles,Temp,pressure;

//----Inputs for variables
        System.out.print("Enter Volume, Moles, Temperature : ");
        Volume = keyboard.nextDouble();
        Moles = keyboard.nextDouble();
        Temp = keyboard.nextDouble();

//----Calculating the gas law
        pressure = Moles * GASCONSTANT * Temp / Volume;

//----Printing out the answer that was computed above
        System.out.println("Pressure is " + pressure);
    }
//-----------------------------------------------------------------------------
//=============================================================================
}