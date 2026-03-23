package Probematura;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Weather_Sensor {

	private List<Weather_Observer> observerList;
	private float tempertureState;
	private float humidity;
	
	
	
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getTempertureState() {
		return tempertureState;
	}
	public void setTempertureState(float tempertureState) {
		this.tempertureState = tempertureState;
	}
	
	
	public WeatherStation() {
		super();
		this.observerList = new ArrayList<Weather_Observer>();
	}
	
	
	@Override
	public void addObserver(Weather_Observer wo) {
		this.observerList.add(wo);
	}
	@Override
	public void removeObserver(Weather_Observer wo) {
		this.observerList.remove(wo);
	}
	@Override
	public void notifyObserver(float tempertureState, float humidity) {
		this.tempertureState = tempertureState;
		this.humidity = humidity;
		for (Weather_Observer wo : observerList) {
			wo.update(tempertureState, humidity);
		}
	}
	
}
