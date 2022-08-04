package observer;

public class PhoneDiplay implements Iobserver {

	private String id;
	private String name;
	private WeatherStation station;

	public PhoneDiplay(String id, String name, WeatherStation station) {
		this.id = id;
		this.name = name;
		this.station = station;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ID: " + id + " Name: " + name + " Temperature: " + station.getTemperature();
	}

	@Override
	public void update() {
		this.station.getTemperature();

	}

}
