public class Main {
    public static void main(String[] args){
        DcMotor motor1 = new DcMotor();

        motor1.setDirection(DcMotor.Direction.FORWARD);
        System.out.println(motor1.getDirection());
    }
}
