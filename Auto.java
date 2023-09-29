import java.util.Random;

public class Auto {
    int output;
    int debugOutput;
    boolean debugging;

    public Auto(boolean debugging) {
        this.debugging = debugging;
    }

    /* This code actually just sets output to a random number from 1-3
    * too lazy to make actual auto also hard to*/
    static double analyze(){
        Random number = new Random();
        int randomNumber = number.nextInt(4); //0-3
        return randomNumber;
    }

    void setOutput(){

    }


}
