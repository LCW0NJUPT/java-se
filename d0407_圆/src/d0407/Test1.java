package d0407;

public class Test1 {
	public static void main(String[] args) {
		/* 
		 * p1 = {x:3, y:4}
		 * p2 = {x:8, y:2}
		 * 
		 * c1 = {
		 *    r: 8,
		 *    o: {x:3, y:4}
		 * }
		 * c2 = {
		 *    r: 3,
		 *    o: {x:8, y:2}
		 * }
		 */
		//新建 Point 实例，存到变量 p1
		Point p1 = new Point(3, 4);
		//新建 Point 实例，存到变量 p2
		Point p2 = new Point(8, 2);
		//新建 Circle 实例，存到变量 c1
		Circle c1 = new Circle(8, p1);
		//新建 Circle 实例，存到变量 c2
		Circle c2 = new Circle(3, p2);
		//打印圆 c1 距原点距离
		System.out.println(c1.juLi());
		//打印圆 c2 距原点距离
		System.out.println(c2.juLi());
		
	}
}






