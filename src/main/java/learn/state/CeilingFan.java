package learn.state;

import lab8.OffSpeed;

public class CeilingFan {
   private State state;
   public CeilingFan() {
      state=new OFFSpeed(this);
   }
   void setState(State state) {
       this.state=state;
   }

   public void pullGreen(){
       state.pullGreen();
   }
    public void pullRed(){
        state.pullRed();
    }
}
