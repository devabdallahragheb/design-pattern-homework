package lab8;

public class HighSpeed implements State{
    CeilingFan ceilingFan;
    @Override
    public void pullGreen( ) {
        System.out.println("turning off ");
       ceilingFan.setState(new OffSpeed(ceilingFan));
    }

    public HighSpeed(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void pullRed( ) {
        System.out.println("medium speed");
        ceilingFan.setState(new OffSpeed(ceilingFan));
    }
}
