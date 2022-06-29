package d0502;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		//调用 suiJi() 产生一个乱序数组，存到变量a
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		
		//把数组，传递到 f() 方法求最小值的位置下标
		int index = f(a);
		System.out.println(
			 "最小值的位置下标："+index);
	}

	private static int f(int[] a) {
		/*
		 * a = [92, 7, 45, 74, 22, 58, 2, 96, 43, 19]
		 * 
		 * 假设第一个值就是最小的
		 * 最小值位置下标 m = 0
		 * 
		 * m = 6
		 * a = [92, 7, 45, 74, 22, 58, 2, 96, 43, 19]
		 *      0   1  2   3   4   5   6  7   8   9
		 * 
		 * i循环从下标1向后找更小值
		 * 找到更小值，把下标保存到m
		 */
		int m = 0;
		for (int i = 1; i < a.length; i++) {
			//a[i] 比 a[m] 更小
			if (a[i] < a[m]) {
				m = i;//更小值的下标，存到m
			}
		}
		return m;
	}

	private static int[] suiJi() {
		/*
		 * 新建 int[] 数组，长度10
		 * a = [0,0,0,0,0,0,0,0,0,0]
		 * 
		 * 遍历填入 100 内随机整数
		 * a = [67,21,7,56,99,78,12,88,54,28]
		 * 
		 * 把数组的地址返回到调用位置
		 */
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);//[0, 100)   
		}
		return a;
	}
}






