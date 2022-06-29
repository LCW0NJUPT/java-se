package d0901;

public class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("一");
	}
	
	//线段自己的方法，与其他类无关
	public void length() {
		System.out.println("十几厘米长...");
	}
}
