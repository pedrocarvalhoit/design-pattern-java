package observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements Iobservable{
	
	private double temperature;
	private List<Iobserver> observers = new LinkedList<>();
	
	
	
	public WeatherStation(double temperature, List<Iobserver> observers) {
		this.temperature = temperature;
		this.observers = observers;
	}

	public WeatherStation() {
	}
		
	public List getObservers() {
		return observers;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public void add(Iobserver observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void remove(Iobserver observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notiFy() {
		for (Iobserver o : this.observers) {
			o.update();
		}
	}

	
	
	
	

}
