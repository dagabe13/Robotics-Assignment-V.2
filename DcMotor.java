/* DcMotor class
* Simulator for FTC's DcMotor class.
* Janky as hell, but gets the job done
*/

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

    double power;
    Direction direction;
    RunMode runMode;


    public DcMotor() {
        this.power = 0;
        this.direction = null;
        this.runMode = null;
    }

    void setPower(double input) {
        if (runMode == RunMode.RUN_USING_ENCODER) {
            if (direction == Direction.FORWARD) {
                power = input;
            } else {
                power = -1 * input;
            }
        }
    }
    double getPower() {
        return power;
    }

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
    RunMode getMode() {
        return runMode;
    }

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
    Direction getDirection() {
        return direction;
    }

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