package lab8;

public class MediumSpeed  implements State{
    CeilingFan ceilingFan;
    @Override
    public void pullGreen( ) {
        System.out.println("high speed");
        ceilingFan.setState(new HighSpeed(ceilingFan));
    }

    public MediumSpeed(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void pullRed( ) {
        System.out.println("low speed");
        ceilingFan.setState(new LowSpeed(ceilingFan));
    }
}
