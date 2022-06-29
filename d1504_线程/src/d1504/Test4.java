package d1504;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		//1000万内，有多少个质数
		//2,3,5,7,11,13,17,19,23....
		System.out.println("\n--单线程-----------------");
		f1();
		System.out.println("\n--5个线程-----------------");
		f2();
	}
	
	
	
	
	private static void f1() throws InterruptedException {
		long t = System.currentTimeMillis();
		
		T1 t1 = new T1(0, 10000000);
		t1.start();
		
		//main线程暂停等待 t1 的执行结果
		t1.join();
		int c = t1.count;
		
		t = System.currentTimeMillis()-t;
		System.out.println("数量："+c);
		System.out.println("时间："+t);
	}
	
	
	
	
	
	
	
	
	
	
	private static void f2() throws InterruptedException {
		long t = System.currentTimeMillis();
		int n = 5;
		int m = 10000000/n;
		T1[] a = new T1[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new T1(m*i, m*(i+1));
			a[i].start();
		}
		int sum = 0;
		for (T1 t1 : a) {
			t1.join();
			sum += t1.count;
		}
		t = System.currentTimeMillis()-t;
		System.out.println("数量："+sum);
		System.out.println("时间："+t);
	}

	
	
	





	static class T1 extends Thread {
		int from;
		int to;
		int count;//计数变量
		public T1(int from, int to) {
			if(from<3) {
				from = 3;
				count = 1;
			}
			this.from = from;
			this.to = to;
		}
		@Override
		public void run() {
			for (int i = from; i < to; i++) {
				if (isPrime(i)) {//判断i是否是质数
					count++;
				}
			}
		}
		private boolean isPrime(int i) {
			/*
			 * 从2到 (i开方+1)
			 * 找有能把i整除的，i不是质数
			 * 都不能吧i整除，i是质数
			 */
			double d = Math.sqrt(i) + 1;
			for (int j = 2; j < d; j++) {
				if (i%j == 0) {
					return false;
				}
			}
			return true;
		}
		
	} 
	
}







