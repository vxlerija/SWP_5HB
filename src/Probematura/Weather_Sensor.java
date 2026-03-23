package Probematura;

public abstract class Weather_Sensor {

	public abstract void addObserver (Weather_Observer wo);
	public abstract void removeObserver (Weather_Observer wo);
	public abstract void notifyObserver(float tempertureState, float humidity);
}
