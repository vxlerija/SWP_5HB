package Probematura;

public class App implements Weather_Observer {

	private float tempertureState;
	private float humidity;

	public void update(float tempertureState, float humidity) {
		this.setTempertureState(tempertureState);
		this.setHumidity(humidity);
	}

	public float getTempertureState() {
		return tempertureState;
	}

	public void setTempertureState(float tempertureState) {
		this.tempertureState = tempertureState;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
}
