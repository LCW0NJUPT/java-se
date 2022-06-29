package d0801;

public class Point /*extends Object*/ {
	int x;
	int y;
	
	//无参构造、全参构造
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	/*
	 * a = {x:3, y:4}
	 * b = {x:3, y:4}
	 * 
	 * a.equals(b)
	 */
	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		//当前对象的x,y，和参数对象p的x,y比较
		return this.x == p.x && this.y == p.y;
	}
}








