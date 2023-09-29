/** Timer class
 * "Times" how much time has elapsed on the field.
 * Every iteration runs through the */

public class Timer {
    int timeElapsed;
    Timer() {
        timeElapsed = 0;
    }
    void update() {
        timeElapsed++;
    }
}