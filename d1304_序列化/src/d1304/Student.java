package d1304;

import java.io.Serializable;
/*
 * 空接口，
 * 标识接口，用来标识学生类型实例，允许被序列化
 */
public class Student implements Serializable{
	//可序列化对象中，会自动生成一个serialVersionUID
	//或者也可以自己定义一个
	//控制旧版本的数据，不允许恢复成新版本的类型
	private static final long serialVersionUID = 2019L;
	private int id;
	private String name;
	private static String gender;
	private transient int age;
	
	public Student() {
	}
	public Student(int id, String name, String gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
