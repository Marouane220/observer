package Observer;

import java.util.Observable;
import java.util.Observer;

public class OctaObserver implements Observer{
	Subject subject;
	private int state;
	
     public OctaObserver(Subject obs){
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
	    	System.out.println("La valeur du compteur en octal est " + Integer.toOctalString((int) state)+ "\n");
        }
	}
}

