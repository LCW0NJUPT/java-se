package d0701;

public class Student extends Person{
	String school;
	
	public Student() {
		//super();//默认的隐含调用
	}
	public Student(String name,
			       String gender,
			       int age,
			       String school) {
		//super();//默认的隐含调用父类的无参构造
		super(name,gender,age);
		this.school = school;
	}
	
	@Override
	public String toString() {
		/*
		 * super.toString()
		 * 目的是减少代码重复，
		 * 一般在方法重写时，
		 * 调用父类同一个方法的代码
		 */
		return super.toString()+", "+school;
	}
}




