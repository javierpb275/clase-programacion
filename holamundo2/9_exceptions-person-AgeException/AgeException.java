public class AgeException extends Exception{

	private String info;

	public AgeException() {
		info = "";
	}

	public AgeException(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return info;
	}
}
