package d0702;

public class Point3D extends Point{
	int z;
	public Point3D(int x, int y, int z) {
		//父类没有无参构造，必须手动调用有参构造
		super(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return "("+x+", "+y+", "+z+")";
	}
	@Override
	public double distance() {
		return Math.sqrt(x*x + y*y + z*z);
	}
}






