package d1504;

public class Test1 {
	public static void main(String[] args) {
		T1 t1 = new T1();//创建线程实例（未运行）
		T1 t2 = new T1();
		//启动线程
		//线程启动后，自动执行 run() 方法
		t1.start();
		t2.start();

		//t1.run()就变成在主线程执行了

		System.out.println("main");
	}
	
	static class T1 extends Thread {
		@Override //重写run方法
		public void run() {
			//获取线程名称
			String n = getName();
			//打印1到1000
			for (int i = 1; i <= 1000; i++) {
				System.out.println(n+" - "+i);    
			}
		}
	}
	
}






