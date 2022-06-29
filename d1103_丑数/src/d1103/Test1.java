package d1103;

import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("求第几个丑数：");
		int n = new Scanner(System.in).nextInt();
		long r = f(n);
		System.out.println(r);
	}

	
	//低效算法
	private static long g(int n) {
		if(n == 1) {
			return 1;
		}
		int count = 1;
		for(long i=2; ;i++){
			//i是否是丑数
			long j = i;
			//当j能被2整除，除2
			while(j%2==0) j /= 2;
			while(j%3==0) j /= 3;
			while(j%5==0) j /= 5;
			//结果j是不是1
			if(j==1) {
				count++;
				if(count == n) {
					return i;
				}
			}
		}
		
	}




	private static long f(int n) {
		/*
		 * 6
		 * ------------------2
		 * 6 9
		 * ------------------3
		 * 5 10 15
		 * ------------------5
		 * 
		 * r = 1 2 3 4 
		 * 
		 * *)先创建三个集合
		 * *)初始分别放入2,3,5
		 * *)从头部移除最小值
		 * *)最小值分别乘2,3,5放入三个集合
		 */
		if(n == 1) {
			return 1;
		}		
		LinkedList<Long> list2 = new LinkedList<>();
		LinkedList<Long> list3 = new LinkedList<>();
		LinkedList<Long> list5 = new LinkedList<>();
		list2.add(2L);
		list3.add(3L);
		list5.add(5L);	
		
		long r = 0;		
		
		//从第2个开始，求到第n个
		for (int i = 2; i<=n; i++) {
			//从头部移除最小值
			long a = list2.getFirst();
			long b = list3.getFirst();
			long c = list5.getFirst();
			r = Math.min(a, Math.min(b, c));
			if(r == a) list2.removeFirst();
			if(r == b) list3.removeFirst();
			if(r == c) list5.removeFirst();
			//*2,3,5放入集合
			list2.add(r * 2);
			list3.add(r * 3);
			list5.add(r * 5);
		}
		return r;
	}
}







