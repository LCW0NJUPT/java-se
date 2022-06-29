package d0801;

public class Test1 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		Point p2 = new Point(3, 4);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p1 == p2);
		/*
		 * equals() 方法比较什么，
		 * 要进入方法，看方法代码比较的是什么
		 * Object中比较内存地址
		 */
		System.out.println(p1.equals(p2));
	}
}





