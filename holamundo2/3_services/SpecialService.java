public class SpecialService extends Service{

public SpecialService(String name, int duration, int price) {
	super(name, duration, price);
	
	}

	@Override
	public int getCost() {
		return super.getCost() * 2;
	}
}
