package Observer;

import java.util.Observable;
import java.util.Observer;

public class HexaObserver implements Observer{
	Subject subject;
	private int state;
	
     public HexaObserver(Subject obs){
	      this.subject = obs;
	      subject.addObserver(this);
	 }
     
     public int getState() {
         return state;
     }

     public void setstate(int state) {
         this.state = state;
     }
     
	@Override
	public void update(Observable obs, Object state) {
		// TODO Auto-generated method stub
	    if (obs instanceof Subject) {
	    	System.out.println("La valeur du compteur en hexadecimal est " + Integer.toHexString((int) state)+ "\n");
        }
	}
}
