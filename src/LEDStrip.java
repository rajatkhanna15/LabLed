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


    public void setLedStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }

    public LEDStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }
    private int lengthOfStrip()    //helper methods are always private
    {
        return ledStrip.length;
    }
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
    private boolean isStripDefective()
    {
        return numberOfDefectiveLEDs() > (lengthOfStrip()) / 2;
    }
    public void printStripStatus()
    {
        System.out.println(isStripDefective() ? "This strip is defective"
                :
                "This strip is not defective");

    }

}
