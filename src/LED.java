/*
this is the package for creating the object of scanner class.
 */
import java.util.Scanner;
/*
This is the LED class for getting the values of parameters through console.
 */
public class LED {
/*
 These are the two parameters.
 */
    private String colourName; // this is the parameter for entering the colour of a single LED.
    private boolean working;   //this is the parameter for telling whether a particular LED is working or not.





    /*
    This is the method for reading the colour name of a particular LED.
     */

    public String getColourName() {
        return colourName;
    }

    /*
    This is the method for updating the value of the colour name of a particular LED.
     */

    public void setColourName(String colourName) {
        this.colourName = colourName;
    }

    /*
    if the value of working parameter entered is true, then this method will return true
    otherwise false.
     */


    public boolean isWorking() {
        return working;
    }


/*
This is the method for updating the value of working paramter=r.
 */

    public void setWorking(boolean working) {
        this.working = working;
    }

/*
paramterised constructor to initialise the default values to the parameters.
 */

    public LED(String colourName, boolean working) {
        this.colourName = colourName;
        this.working = working;
    }



}

