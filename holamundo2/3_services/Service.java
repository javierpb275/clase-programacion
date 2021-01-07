public class Service {
	private String name;
	private int duration;
	private int price;

	public Service(String name, int duration, int price) {

		this.name = name;
		this.duration = duration;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCost() {
		int result = price * duration;
		if (result >= 100) result -= Config.gift;
		return result;
	}

	@Override
	public Service clone() {
		return new Service(this.name, this.duration, this.price);
	}

	@Override
	public boolean equals(Object o) {
		Service s = (Service) o;
		return this.name.equals(s.name) && 
		this.duration == s.duration && 
		this.price == s.price;
	}

	@Override
	public String toString() {
		return "Name: " + name + "Duration: " + duration + "Price: " + price;
	}

}

