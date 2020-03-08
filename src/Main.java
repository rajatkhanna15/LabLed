import java.util.Scanner;
/*
This is the main class for entering the no. of LEDs and other paramters.
 */
public class Main {

        public static void main(String[] args) {
            /*
            Creating object of scanner class.
             */

            final Scanner scanner = new Scanner(System.in);
            /*
            Entering the number of LEDs.(the length of LED strip.)
             */
            int numberOfLEDs = Integer.parseInt(scanner.nextLine());
            /*
            Creating an array of LED type with the length equal to no. of LEDs.
             */
            LED[] array = new LED[numberOfLEDs];
            /*
            traversing the array and entering the required values.
             */
            for (int i = 0; i < array.length; i++) {
                String colourName = scanner.next();
                boolean working = scanner.nextBoolean();
                array[i] = new LED(colourName, working);
            }
            /*
            creating object of LEDstrip class.
             */

            LEDStrip strip = new LEDStrip(array);

            strip.printStripStatus();
            scanner.close();
        }

}
