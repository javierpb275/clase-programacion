public class Tool {

	private String name;
	private int price;

	public Tool() {

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) throws Exception {
		if (price >= 0 && price <= 100)
			this.price = price;
		else
			throw new Exception("Error 125");
	}
}
