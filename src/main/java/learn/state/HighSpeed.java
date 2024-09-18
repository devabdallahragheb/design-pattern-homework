package learn.state;

import lab8.MediumSpeed;

public class HighSpeed implements State{
    CeilingFan state;

    public HighSpeed( CeilingFan state) {
      this.state = state;
    }

    @Override
    public void pullGreen() {
        System.out.println("off");
       state.setState(new OFFSpeed(state));
    }

    @Override
    public void pullRed() {
        System.out.println("medium speed");
        state.setState(new mediumSpeed(state));
    }
}
