package d0301;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入原价：");
		double p = new Scanner(System.in).nextDouble();
		//调用 f() 方法，把p变量的值，传递到f()方法
		f(p);//取出p的值，保存到方法参数变量x
	}//双击大括号，找到main结束
	
	static void f(double x) {//新变量x，和上面的变量p无关
		/*
			满500，9折
			满1000，85折
			满3000，8折
			满5000，7折
		 */
		
		//定义一个折扣变量 r=1
		//根据原价范围，要给r重新赋值
		//如果下面条件都不成立，r不会被重新赋值
		double r = 1;
		if(x>=5000) {
			r = 0.7;
		} else if(x>=3000) {
			r = 0.8;
		} else if(x>=1000) {
			r = 0.85;
		} else if(x>=500) {
			r = 0.9;
		}
		x *= r; //x = x*r;
		
		//四舍五入到小数点后2位
		/*
		 * x = 5.57496345
		 * 乘 1000， 5574.96345
		 * 转成 long，5574
		 * 取个位数，9
		 * 如果<5，减掉余数，5570
		 * 否则，先加10，再减掉余数 5580
		 * 除1000
		 */
		x *= 1000;
		long n = (long) x;
		int y = (int) (n % 10); //long % int
		if(y<5) {
			n -= y;
		} else {
			n = n+10 - y;
		}
		x = n/1000d; //long/double, double
		
		System.out.println(
		 "折扣："+r+"， 实价："+x);
	}
	
}











