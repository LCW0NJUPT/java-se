package d1603;

public class Consumer extends Thread {
	private Stack stack;
	public Consumer(Stack stack) {
		this.stack = stack;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (stack) {
				//没有数据，等待
				while (stack.isEmpty()) {
					try {
						stack.wait();//当前线程，在stack栈对象上暂停等待
					} catch (InterruptedException e) {
					}
				}
				char c = stack.pop();
				System.out.println("弹出 >> "+c);
				stack.notifyAll();
			}
		}
	}
	
}
