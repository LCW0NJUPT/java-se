package d1603;

public class Test3 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Producer p = new Producer(stack);
		Consumer c = new Consumer(stack);
		
		p.start();
		c.start();
		
		//模拟，有线程只敲盘子，不动数据
		while(true) {
			synchronized (stack) {
				stack.notifyAll();
			}
		}
	}
}




