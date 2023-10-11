public class Main {
    public static Timer timer = new Timer();
    public static DcMotor motorLeft = new DcMotor();
    public static DcMotor motorRight = new DcMotor();
    public static void telemetry() {
        System.out.println(timer.timeElapsed + " seconds passed")
        System.out.println("motorLeft: Power=" + motorLeft.getPower() + ", Mode=" + motorLeft.getMode() + ", Direction=" + motorLeft.getDirection());
        System.out.println("motorRight: Power=" + motorRight.getPower() + ", Mode=" + motorRight.getMode() + ", Direction=" + motorRight.getDirection());
        if (motorLeft.getPower() == 0.3 && motorRight.getPower() == 0.3) {
            System.out.println("Prop can be launched at " + timer.timeElapsed + " seconds");
        }
    }

    public static void main(String[] args){
        motorLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRight.setDirection(DcMotor.Direction.REVERSE);
        // Match length is 3 minutes
        while (timer.opModeIsActive) {
            telemetry();
            Auto auto = new Auto();
            sleep(2000);
            auto.analyze();
            sleep(12000);
            int output = auto.getOutput();

            // Output actions
            if (output == 1) {
                motorLeft.setPower(1);
                motorRight.setPower(1);
                sleep(2000);
                motorLeft.setPower(-1);
                motorRight.setPower(1);
                sleep(1000);
                motorLeft.setPower(0.5);
                motorRight.setPower(0.5);
                sleep(2000);
            } else if (output == 2) {
                motorLeft.setPower(0.5);
                motorRight.setPower(0.5);
                sleep(5000);
            } else if (output == 3) {
                motorLeft.setPower(1);
                motorRight.setPower(1);
                sleep(2000);
                motorLeft.setPower(1);
                motorRight.setPower(-1);
                sleep(1000);
                motorLeft.setPower(0.5);
                motorRight.setPower(0.5);
                sleep(2000);
            }

            // Driver-controlled period
            if (timer.timeElapsed >= 30 && timer.timeElapsed < 180) {
                motorRight.setDirection(DcMotor.Direction.FORWARD);
                double power = ((int) timer.timeElapsed % 10) / 10.0;
                motorLeft.setPower(power);
                motorRight.setPower(power);
            }

            // Endgame
            if (timer.timeElapsed >= 30 && timer.timeElapsed < 180) {
                motorLeft.setDirection(DcMotor.Direction.REVERSE);
                double power = ((int) timer.timeElapsed % 10) / 10.0;
                motorLeft.setPower(power);
                motorRight.setPower(power);
            }
            timer.update(); // DO NOT REMOVE THIS LINE
        }//end timer loop
    }//end main

}//end class
