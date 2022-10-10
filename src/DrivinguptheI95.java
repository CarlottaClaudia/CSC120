import java.util.Scanner;
//----
public class DrivinguptheI95 {
//----
    private static final Scanner keyboard = new Scanner(System.in);

//----
    public static void main(String[] args) {

        double travel;
        double distance, time, speed;

        printWelcomeMessage();
        System.out.print("\nEnter distance to travel : ");
        distance = keyboard.nextDouble();
        System.out.print("Enter time available     : ");
        time = keyboard.nextDouble();
        speed = computetravelSpeed(distance, time);
        printSpeed(speed);
    }
//----Welcome Method
    private static void printWelcomeMessage(){

        System.out.println("Welcome to the I95 Speed Machine");
        System.out.println("\nYou will have to supply:");
        System.out.println("+ The distance you want to travel, in miles");
        System.out.println("+ The time you have available, in hours");
    }
//----Compute the actual time computed with number of stops
    private static double computetravelSpeed(double distance, double time) {

        double timeTravel, actualTime;

        timeTravel = (Math.ceil(distance/100) * (5.0/60));
        actualTime = time - timeTravel;

        return (distance / actualTime);
    }
//----Display the travel speed and over the speed limit
    private static void printSpeed(double speed) {

        boolean overSpeedLimit;

        System.out.println("\nYou will have to travel at " + speed + "mph");

        overSpeedLimit = speed > 65;
        System.out.println("Over the speed limit     : " + overSpeedLimit);
    }
}


