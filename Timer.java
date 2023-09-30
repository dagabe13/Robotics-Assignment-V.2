/** Timer class
 * "Times" how much time has elapsed on the field.
 * Every iteration runs through the */

public class Timer {
    public int timeElapsed;
    public boolean opModeIsActive;
    Timer() {
        timeElapsed = 0;
        opModeIsActive = true;
    }
    void update() {
        timeElapsed++;
        if (timeElapsed < 180) {
            opModeIsActive = true;
            return;
        }
        opModeIsActive = false;
    }
}