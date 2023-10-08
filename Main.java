public class Main {
    public static Timer timer = new Timer();
    /* Initialization here */

    public static void main(String[] args){
        // Match length is 3 minutes
        while (timer.opModeIsActive) {
            /* Code here */
            timer.update(); // DO NOT REMOVE THIS LINE
        }//end timer loop
    }//end main

}//end class
