package Observer;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject observable = new Subject();
		BinaryObserver bin_observer = new BinaryObserver(observable);
		HexaObserver hexa_observer = new HexaObserver(observable);
		OctaObserver octa_observer = new OctaObserver(observable);
		
		observable.addObserver(bin_observer);
		observable.addObserver(hexa_observer);
		observable.addObserver(octa_observer);
		observable.run();
	}
}
