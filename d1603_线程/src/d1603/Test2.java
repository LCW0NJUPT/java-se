package d1603;

public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		Thread t1 = new Thread(r1);
		// r1.run(), r1.add(),r1.add(),r1.add(),r1.add(),r1.add(),
		t1.start();
		
		//main
		// r1.get(), r1.get(),r1.get(),r1.get(),r1.get(),r1.get(),
		R1 r2 = new R1();
		while(true) {
			int i = r2.get();
			if(i % 2 == 1) {
				System.out.println(i);
				System.exit(0);//关闭虚拟机
			}
		}

	}
	
	static class R1 implements Runnable {
		static int i=0;
		public static synchronized void add() {
			i++;
			i++;
		}
		public static synchronized int get() {
			return i;
		}
		@Override
		public void run() {
			while(true) {
				add();
			}
		}
	}
	
}
