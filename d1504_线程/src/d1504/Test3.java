package d1504;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("按回车捅醒 t1");
				new Scanner(System.in).nextLine();
				t1.interrupt();
			}
		};    //分号是赋值

		//虚拟机不会等待后代线程结束
		//所有前台线程结束时，虚拟机会自动退出
		t2.setDaemon(true);
		t2.start();
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			SimpleDateFormat f = 
			 new SimpleDateFormat("HH:mm:ss");			
			for(int i=0; i<10; i++) {
				String s = f.format(new Date());
				System.out.println(s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { 
					System.out.println("谁捅醒了我");
					break;
				}
			}
		}
	}
	
}


