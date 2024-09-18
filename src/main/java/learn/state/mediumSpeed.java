package learn.state;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

public class mediumSpeed implements State{
    CeilingFan state;
    @Override
    public void pullGreen() {
        System.out.println("high speed");
        state.setState(new HighSpeed(state));
    }

    public mediumSpeed(CeilingFan state) {
        this.state = state;
    }

    @Override
    public void pullRed() {
        System.out.println("low speed");
        state.setState(new LowSpeed(state));
    }
}
