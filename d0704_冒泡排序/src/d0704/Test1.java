package d0704;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//获得一个随机乱序数组
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));     
		System.out.println("----------------");
		
		sort(a);//对a数组排序
		
		System.out.println("----------------");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiJi() {
		//产生一个 5+ [0,6) 范围的整数存到变量 n
		//新建 int[] 数组a，长度 n
		//遍历数组，填入 100 内的随机整数
		//返回数组a
		int n = 5+ new Random().nextInt(6);
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		/*
		 *                         j
		 * [2, 11, 24, 51, 46, 95, 33, 45, 64, 72]
		 *             i
		 *             
		 *                                j
		 * [1, 5, 5, 33, 40, 48, 71, 50, 77]
		 *                i
		 * 
		 * 
		 *                       
		 * [1, 5, 5, 33, 40, 48, 50, 71, 77]
		 *                    i
		 *             
		 *          j循环开始之前 flag = false，标记没有交换
		 *             
		 *             if(! flag) {
		 *             	
		 *             }
		 */
		//i循环从头到尾遍历
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;//没有交换			
			//j循环，把较小值向前交换，最小值交换到i位置    
			//j循环从尾部向前递减到 >i
			for (int j = a.length-1; j > i; j--) {
				//j和j-1位置的值比大小
				if (a[j]<a[j-1]) {
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
					flag = true;//有交换
				}
			}
			//flag还是false，没有修改成true
			//没有执行交换，数据位置都是正确的
			if (! flag) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
	}
}





