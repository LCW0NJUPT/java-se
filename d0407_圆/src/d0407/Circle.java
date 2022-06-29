package d0407;

public class Circle {
	int r;
	Point o; //{x:3, y:4}
	public Circle(int r, Point o) {
		this.r = r;
		this.o = o;
	}
	//求圆的边界，距原点的距离
	double juLi() {
		//圆心o距原点的距离
		double d = Math.sqrt(o.x*o.x + o.y*o.y);
		return d - r;
	}
	
}





