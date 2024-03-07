package Factory_Method;

public interface ICarro {
	public default String info() {
		return "Popular";
	}
}
