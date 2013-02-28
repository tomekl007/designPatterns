package headfirst.observer.weather;

import java.util.*;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
//	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		
	}
	
//	public void registerObserver(Observer o) {
//		observers.add(o);
//	}
	
///	public void removeObserver(Observer o) {
//		int i = observers.indexOf(o);
///		if (i >= 0) {
//			observers.remove(i);
//		}
//	}
	
	//public void notifyObservers() {
	//	for (int i = 0; i < observers.size(); i++) {
	//		Observer observer = (Observer)observers.get(i);
	//		observer.update(temperature, humidity, pressure);
	//	}
	//}
	
	public void measurementsChanged() {
                setChanged();//Marks this Observable object as having been changed; the hasChanged method will now return true.
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
 
