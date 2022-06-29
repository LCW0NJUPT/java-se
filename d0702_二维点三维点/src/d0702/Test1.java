package d0702;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * p1 = {
		 *     x: 3,
		 *     y: 4
		 * }
		 * 
		 * p2 = {
		 *     x: 3,
		 *     y: 4,
		 *     z: 5
		 * }
		 */
		Point p1 = new Point(3, 4);
		Point3D p2 = new Point3D(3, 4, 5);
		System.out.println(p1.toString());
		System.out.println(p1.distance());
		System.out.println("--------------");
		System.out.println(p2.toString());
		System.out.println(p2.distance());
		
		//把二维点实例p1，和三维点实例p2
		//都传递到一个 f()方法进行处理
		f(p1);
		f(p2);//向上转型，转型成父类型
	}
	
	static void f(Point p) {
		System.out.println("当做父类型 Point");
		//在真实实例中，从子类到父类查找 toString()方法
		System.out.println(p.toString());
	}
	
	
	
}



