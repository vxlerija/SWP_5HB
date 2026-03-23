package Probematura;

public class Main {

	public static void main(String[] args) {
		WeatherStation observable = new WeatherStation() ;
		Weather_Observer observer = new App();
		
		observable.addObserver(observer);
		observable.setHumidity(5);
		observable.setTempertureState(7);
		observer.update(25,9);
		System.out.println(observable.getTempertureState() + " = " + observer.getTempertureState());
		System.out.println(observable.getHumidity() + "=" + observer.getHumidity());
		
	}

}
