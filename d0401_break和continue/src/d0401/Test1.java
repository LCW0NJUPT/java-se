package d0401;
/*
 * 隐藏暂时不使用的项目
 * 1. 关闭项目
 * 2. 过滤隐藏关闭项目
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n------------------");
		f1();//ctrl+1, create method
		System.out.println("\n------------------");
		f2();//ctrl+1, create method
	}

	private static void f1() {
		// 随机浮点数 [0, 1)
		//double d = Math.random();//alt+shift+L
		//System.out.println(d);
		
		// >0.999
		//死循环产生随机值
		for (int i = 1; ;i++) {
			double d = Math.random();
			if (d > 0.999) {
				System.out.println("第"+i+"次："+d);
				break;//中断、跳出
			}
		}
	}

	private static void f2() {
		//打印 1 到 100
		for (int i = 1; i <= 100; i++) {
			//尾数是3,5,7，不打印，直接跳到下一个值
			int y = i%10;
			if (y==3 || y==5 || y==7) {
				continue;//跳到i++，进入循环下一轮
			}
			System.out.println(i);
		}
	}
}











