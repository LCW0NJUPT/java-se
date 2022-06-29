package d0806;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * r = [1,2,3,4,5,6,7,8,9,10....33]
		 * b = [1,2,3,4,5...16] 
		 */
		//准备两个号码数组
		int[] r = zbsz(33);
		int[] b = zbsz(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		
		int[] red = xuanRed(r);//选6个红球
		int blue = xuanBlue(b);//选1个蓝球
		System.out.println("红球：");
		System.out.println(Arrays.toString(red));   
		System.out.println("蓝球：");
		System.out.println(blue);
	}

	private static int[] xuanRed(int[] r) {
		/*
		 *                        j                                        
		 * [12,15,3,1,17,10,7,8,9,6,11,4,13,14,2,16,5,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33]
		 *        i 
		 *                   
		 * [12,15,3,1,17,10]
		 */
		//i循环从0到<6，随机交换6个值到前面
		for (int i = 0; i < 6; i++) {
			//j随机定位 i+ [0, 33-i) --> [i, 33)
			int j = i+ new Random().nextInt(33-i);
			//i,j交换
			int t = r[i];
			r[i] = r[j];
			r[j] = t;
		}
		//复制前6个位置，生成一个新的数组
		int[] arr = Arrays.copyOf(r, 6);
		return arr;
	}

	private static int xuanBlue(int[] b) {
		return b[new Random().nextInt(16)];
	}

	private static int[] zbsz(int n) {
		//新建int[]数组a，长度n
		int[] a = new int[n];
		//遍历，填入1到n
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		//返回数组a
		return a;
	}
}






