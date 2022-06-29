package d1203;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public int hashCode() {
		/*
		 * *) 相同属性，产生相同的哈希值
		 * *) 不同属性，要尽量产生分散的哈希值
		 * 
		 * 数学家发明了一种算法，
		 * 是一种惯用的，有效算法
		 */
		int p = 31; //神奇值31
		int r = 1;  //r起始值任意
		r = r*p + x;
		r = r*p + y;
		return r;
	}
	
	@Override
	public boolean equals(Object obj) {
		//参数obj是Point类型
		if(obj instanceof Point) {
			Point p = (Point) obj;
			return x == p.x && y == p.y;
		}
		return false;
	}
	
}









