public class Passenger {
	private String name;
	private Country country;

	public Passenger(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}