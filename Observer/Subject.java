package Observer;
import java.util.Observable;


public class Subject extends Observable {
	

    
    private int state;
    
    public int getState() {
    	return state;
	}
    
	public void setState(int state) {
	    this.state = state;
	    setChanged();
	    notifyObservers(state);
	}
	
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				this.setState((this.getState() + 1) % 60);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			}
	}
}