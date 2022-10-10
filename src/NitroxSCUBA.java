import java.util.Scanner;
//-------------------------------------------------------------------------------
public class NitroxSCUBA {
    //-------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);

    //----The "feet per atmosphere" constant
    private static final double FEETPERATMOSPHERE = 33;

    //--------------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variable to hold system values
        int depth, percentoxygen;
        double ambientpressure, partialpressure;
        boolean exceedsmax, exceedscontingency;
        char pressuregroupletter;

//----Inputs for variables
        System.out.print("Enter depth and percentage O2   : ");
        depth = keyboard.nextInt();
        percentoxygen = keyboard.nextInt();

//----Calculate ambient pressure and partial pressure
        ambientpressure = (depth/FEETPERATMOSPHERE) + 1;
        partialpressure = ((double) percentoxygen / 100) * ambientpressure;

//----Print statements
        System.out.println("\nAmbient pressure                : " + ambientpressure);
        System.out.println("O2 pressure                     : " + partialpressure);

//----Calculate 02 group
        pressuregroupletter = ((char)((int)(partialpressure * 10) + (int)('A')));
        System.out.println("Pressure group:                 : " + pressuregroupletter);

//----Compute maximal pressure
        exceedsmax = partialpressure > 1.4;
        System.out.println("Exceeds maximal O2 pressure     : " + exceedsmax);

//----Compute contingency pressure
        exceedscontingency = partialpressure > 1.6;
        System.out.println("Exceeds contingency O2 pressure : " + exceedscontingency);

        }
    }
