package d0703;

public class Dog extends Pet{
	public Dog(String name) {
		super(name);
	}
	public Dog(String name, int full, int happy) {
		super(name,full,happy);
	}
	@Override
	public String cry() {
		return "汪~";
	}
}
