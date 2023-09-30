/** DcMotor class
 * Simulator for FTC's DcMotor class.
 * Janky as hell, but gets the job done
 * */

public class DcMotor {

    enum RunMode {
        RUN_TO_POSITION,
        RUN_USING_ENCODER,
        RUN_WITHOUT_ENCODER,
        STOP_AND_RESET_ENCODER
    }

    enum Direction {
        FORWARD,
        REVERSE
    }

    private double power;
    private Direction direction;
    private RunMode runMode;


    public DcMotor() {
        this.power = 0;
        this.direction = null;
        this.runMode = null;
    }

    /* Sets the power level of the motor, expressed as a fraction of the maximum possible power / speed supported according to the run mode in which the motor is operating. */
    void setPower(double input) {
        if (runMode == RunMode.RUN_USING_ENCODER) {
            if (direction == Direction.FORWARD) {
                power = input;
            } else {
                power = -1 * input;
            }
        }
    }
    /* Returns the current configured power level of the motor. */
    double getPower() { return power; }

    /* Sets the current run mode for this motor */
    void setMode(RunMode input){
        switch (input) {
            case RUN_TO_POSITION:
                runMode = RunMode.RUN_TO_POSITION;
                break;
            case RUN_USING_ENCODER:
                runMode = RunMode.RUN_USING_ENCODER;
                break;
            case RUN_WITHOUT_ENCODER:
                runMode = RunMode.RUN_WITHOUT_ENCODER;
                break;
            case STOP_AND_RESET_ENCODER:
                runMode = RunMode.STOP_AND_RESET_ENCODER;
                break;
        }
    }
    /* Returns the current run mode for this motor */
    RunMode getMode() { return runMode; }

    /* Sets the logical direction in which this motor operates. */
    void setDirection(Direction input){
        switch (input) {
            case FORWARD:
                direction = Direction.FORWARD;
                break;
            case REVERSE:
                direction = Direction.REVERSE;
                break;
        }
    }
    /* Returns the current logical direction in which this motor is set as operating. */
    Direction getDirection() { return direction; }

    public static void main(String[] args){
        // Init enums
        final RunMode RUN_TO_POSITION = RunMode.RUN_TO_POSITION;
        final RunMode RUN_USING_ENCODER = RunMode.RUN_USING_ENCODER;
        final RunMode RUN_WITHOUT_ENCODER = RunMode.RUN_WITHOUT_ENCODER;
        final RunMode STOP_AND_RESET_ENCODER = RunMode.STOP_AND_RESET_ENCODER;
        final Direction FORWARD = Direction.FORWARD;
        final Direction REVERSE = Direction.REVERSE;
    }
}