package learn.state;



public class LowSpeed implements State{
    CeilingFan state;
    @Override
    public void pullGreen() {
        System.out.println("medium Speed");
    state.setState(new mediumSpeed(state) );
    }

    @Override
    public void pullRed() {
        System.out.println("off");
        state.setState(new OFFSpeed(state) );
    }

    public LowSpeed(CeilingFan state) {
        this.state = state;
    }
}
