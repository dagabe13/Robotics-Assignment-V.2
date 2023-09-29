public class Main {
    public static void main(String[] args){
        Timer timer = new Timer();
        /* Initialization here */

        // Match length is 3 minutes
        while (timer.timeElapsed <= 180) {
            /* Code here */
            timer.update(); // DO NOT REMOVE THIS LINE
        }//end timer loop

    }//end main
}//end class
