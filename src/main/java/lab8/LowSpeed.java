package lab8;

public class LowSpeed  implements State{
    CeilingFan ceilingFan;
    @Override
    public void pullGreen( ) {
        System.out.println("medium speed");
        ceilingFan.setState(new MediumSpeed(ceilingFan));
    }

    public LowSpeed(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void pullRed( ) {
        System.out.println("turning off ");
        ceilingFan.setState(new OffSpeed(ceilingFan));
    }
}
