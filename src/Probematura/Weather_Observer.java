package Probematura;

public interface Weather_Observer {


	float getTempertureState();
	float getHumidity();
	
	
	void update(float tempertureState, float humidity);
	
	
	
}
