package d1504;

public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		//线程启动后，自动执行 r1.run() 
		t1.start();
		t2.start();
	}
	
	static class R1 implements Runnable {
		@Override
		public void run() {
			//获得正在执行的线程实例
			Thread t = Thread.currentThread();
			
			//获得线程名
			String n = t.getName();
			//打印1到1000
			for (int i = 1; i <= 1000; i++) {
				System.out.println(n+" - "+i);    
			}
		}
	}
	
}






