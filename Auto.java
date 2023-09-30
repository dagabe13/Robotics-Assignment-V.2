import java.util.Random;

/** Auto class
 * "Analyzes" the "field" and changes output depending on "analysis".
 * If debugging is needed, use debugOutput and its methods. */

public class Auto {
    private int output;
    private int debugOutput;

    public Auto() {}

    /* This code actually just sets output to a random number from 1-3
     * too lazy to make actual auto also hard to do it */
    static int randomNumber(int min, int max){
        Random number = new Random();
        int randomNumber = number.nextInt(min, max+1); //1-3
        return randomNumber;
    }

    /* output */
    void analyze() { output = randomNumber(1, 3); }
    int getOutput() { return output; }

    /* debugOutput */
    void setDebugOutput(int debugOutput) { this.debugOutput = debugOutput; }
    int getDebugOutput() { return debugOutput; }
}

