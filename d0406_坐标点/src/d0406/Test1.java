package d0406;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * Point类，坐标点的对象模板
		 * {
		 *    int x,
		 *    int y,
		 *    Point(x, y),
		 *    fuZhi(x, y),
		 *    print()
		 * }
		 * 
		 * p1 = {
		 *    x: 3,
		 *    y: 4
		 * }
		 * 
		 * p2 = {
		 *    x: 1,
		 *    y: 5
		 * }
		 * 
		 * p3 = {
		 *    x: 8,
		 *    y: 3
		 * }
		 */
		Point p1 = new Point(3, 4);
		Point p2 = new Point(1, 5);
		Point p3 = new Point(8, 3);
		
		//		
		//		p1.fuZhi(3, 4);
		//		p2.fuZhi(1, 5);
		//		p3.fuZhi(8, 3);

		p1.print();
		p2.print();
		p3.print();
		
	}
}






