package d0701;

public class Person /*extends Object*/ {
	String name;
	String gender;
	int age;
	public Person() {
		this("无名", "不明", 16);
	}
	public Person(String name,String gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String toString() {
		return name+", "+gender+", "+age;
	}
}


