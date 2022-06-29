package d0701;

public class Employee extends Person{
	double salary;
	
	@Override
	public String toString() {
		return super.toString()+", "+salary;
	}
}
