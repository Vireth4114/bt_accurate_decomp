import javax.microedition.midlet.MIDlet;

public class RMIDlet extends MIDlet {
   protected void startApp() {
      if (o.a_MIDlet == null) {
         o.a_MIDlet = this;
         o.method_h_I_V(1);
      } else {
         o.method_h_I_V(3);
      }
   }

   protected void pauseApp() {
      o.method_h_I_V(2);
      this.notifyPaused();
   }

   protected void destroyApp(boolean var1) {
      o.method_a_V();
   }
}
