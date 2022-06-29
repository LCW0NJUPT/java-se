package d0504;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		System.out.println(Arrays.toString(a));
		
		//把数组 a 传递到 shuffle() 方法打乱顺序
		shuffle(a);
		
		System.out.println(Arrays.toString(a));
	}

	private static void shuffle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int j = new Random().nextInt(a.length);
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
	}
}








