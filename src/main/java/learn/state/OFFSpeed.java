package learn.state;

public class OFFSpeed implements State{
    CeilingFan state;

    public OFFSpeed(CeilingFan state) {
        this.state = state;
    }

    @Override
    public void pullGreen() {
        System.out.println("low speed");

        state.setState(new LowSpeed(state));

    }

    @Override
    public void pullRed() {
        System.out.println("high speed");
        state.setState(new HighSpeed(state));
    }
}
