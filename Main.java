public class Main {
    public static void main(String[] args){
        Timer timer = new Timer();
        /* Initialization here */

        // Match length is 3 minutes
        while (timer.timeElapsed <= 180) {
            /* Code here */
            timer.update();
        }
        /** DELETE BELOW BEFORE FINISHING*/
        // RUN ANALYZE FOR AUTO
        DcMotor motor1 = new DcMotor();

        motor1.setDirection(DcMotor.Direction.FORWARD);
        System.out.println(motor1.getDirection());
    }
}
