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
            int numberOfLEDs = Integer.parseInt(scanner.nextLine());
            LED[] array = new LED[numberOfLEDs];
            for (int i = 0; i < array.length; i++) {
                String colourName = scanner.next();
                boolean working = scanner.nextBoolean();
                array[i] = new LED(colourName, working);
            }
            LEDStrip strip = new LEDStrip(array);
            strip.printStripStatus();
            scanner.close();
        }
}
