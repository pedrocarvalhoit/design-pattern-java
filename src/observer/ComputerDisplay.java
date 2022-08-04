package observer;

public class ComputerDisplay implements Iobserver {

	private String id;
	private String name;
	private WeatherStation station;

	public ComputerDisplay(String id, String name, WeatherStation station) {
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
		return "ComputerDisplay [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void update() {
		this.station.getTemperature();

	}

}
