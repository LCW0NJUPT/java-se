package d0203;

public class Test1 {
	public static void main(String[] args) {
		//1光年是多少米
		long ly = 299792458L*60*60*24*365;
		//16.4光年是多少米
		double d = 16.4 * ly; // double * long 是 double
		//喜鹊数量
		double r = d/0.46;
		//Math.ceil(r) 对 r 向上取整
		//35345.345 --> 35346.0 double类型的结果
		//double 转成 long 整数类型
		long n = (long) Math.ceil(r);
		
		System.out.println(n);
		
	}
}
