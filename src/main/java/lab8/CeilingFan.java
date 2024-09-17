package lab8;

public class CeilingFan {
  private   State state;

    public State getState() {
        return state;
    }

    public CeilingFan() {
        this.state = new OffSpeed(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    void pullRed(){
        this.state.pullRed();
    }
    void pullGreen(){
        this.state.pullGreen();
    }
}
