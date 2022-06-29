package d0406;
/*
 * Point类，坐标点的对象模板
 */
public class Point {
	int x;
	int y;

	public Point(){

	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void fuZhi(int x, int y) {
		//把接收的参数x值，保存到“这个实例”的x
		//“这个实例”，“当前实例” - 正在调用的实例
		this.x = x;
		this.y = y;
	}

	void print() {
		String s = this.x + ", " + this.y;
		System.out.println(s);
	}
}










