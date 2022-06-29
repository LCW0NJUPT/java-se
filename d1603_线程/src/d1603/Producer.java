package d1603;

import java.util.Random;
import java.util.concurrent.Executors;

public class Producer extends Thread {
	private Stack stack;
	public Producer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		while(true) {
			// 'a' - 'z'
			char c = (char) ('a' + new Random().nextInt(26));
			synchronized (stack) {
				//满了，暂停等待
				while (stack.isFull()) {
					try {
						stack.wait();
					} catch (InterruptedException e) {
					}
				}
				stack.push(c);
				System.out.println("压入 << "+c);
				stack.notifyAll();//通知所有栈上等待的线程，这里有数据了

				//固定数量的线程池
				Executors.newFixedThreadPool(5);
				//足够多的线程，让任务不必等待
				Executors.newCachedThreadPool();
				//单个线程的线程池
				Executors.newSingleThreadExecutor();



			}
		}
	}
	
}



