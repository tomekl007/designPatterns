package headfirst.observer.weather;

import java.util.Observable;
import java.util.Observer;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
        Observable observable;
	private float temperature;
	private float humidity;
	//private Subject weatherData;
	
        
        //the constructor is passed the weatherData object(Subject)
        //and we use it to register the display as an observer
        
        //edit: Constructor now takes the Observable,and we use this to add current condition obj. as Observer
	public CurrentConditionsDisplay(Observable o) {
		this.observable = o;
                observable.addObserver(this);
	//	weatherData.registerObserver(this);
	}
	
        
        
       	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
            
            
        
        
	//public void update(float temperature, float humidity, float pressure) {
	//	this.temperature = temperature;
	//	this.humidity = humidity;
	//	display();
	//}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
