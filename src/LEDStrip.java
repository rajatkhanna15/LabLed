/*
creating LEDsSrip class
 */

public class LEDStrip {
    private LED[] ledStrip;

/*
Getter and setter methods for the parameter ledStrip[] array
 */

    public LED[] getLedStrip() {
        return ledStrip;
    }

/*
setter method
 */

    public void setLedStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }

/*
Parametrised constructor
 */
    public LEDStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }

/*
Method for returning the length of LEDStrip
 */
    private int lengthOfStrip()    //helper methods are always private
    {
        return ledStrip.length;
    }

    /*
    method to find the number of defective LEDs.
     */

    private int numberOfDefectiveLEDs()
    {
        int counter=0;
        for (LED led : ledStrip)
        {

            if (led.isWorking() == false) {

                counter++;
            }
        }
        return counter;
    }

    /*
    method to find whether the strip is defective or not.
     */

    private boolean isStripDefective()
    {
        return numberOfDefectiveLEDs() > (lengthOfStrip()) / 2;
    }
/*
method to print the status of LED strip.(defective or not.)
 */

    public void printStripStatus()
    {
        System.out.println(isStripDefective() ? "This strip is defective"
                :
                "This strip is not defective");

    }

}
