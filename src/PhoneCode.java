import java.util.Scanner;

public class PhoneCode {

    private static final Scanner keyboard = new Scanner(System.in);

    private static final int NUM_MIN = 999999;
    private static final int NUM_MAX = 9999999;

    public static void main(String[] args) {

        int phoneNumber = 0;
        String randomEncoding;

        do {
            System.out.print("Please enter your 305 phone number: ");
            phoneNumber = keyboard.nextInt();
        } while ((phoneNumber < NUM_MIN) || (phoneNumber > NUM_MAX));

        randomEncoding = computeRandomEncoding(phoneNumber);
        String encode305 = computeRandomEncoding(305);
        String finalResult = encode305 + randomEncoding;

        System.out.print("The phone number 305" + phoneNumber + " can be encoded as " + finalResult);

    } // end of the main method

    private static String computeRandomEncoding ( int phoneNumber){

        String result = "";

        char[] characterArray = {'0', '1', 'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W'};
        int[] integerArray = {0, 1, 3, 3, 3, 3, 3, 4, 3, 4};

        while (phoneNumber > 0) {

            int digit = phoneNumber % 10;
            int numberperDigit = (int)Math.floor((int)Math.random() * integerArray[digit]);
            char characterCode = (char)((int) characterArray[digit] + numberperDigit);
            result = characterCode + result;
            phoneNumber = phoneNumber / 10;
        }

        return result;

    }


} // end of the class


