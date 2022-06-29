package d0902;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	/*
	 * 二分法查找、折半查找
	 * 在有序数组中查找一个值所在的位置下标，
	 * 如果找不到，返回 -(插入点+1)
	 * 
	 * 29
	 *              mid
	 * [2,3,3,5,6,8,12,13,13,13,17,28,30,32] 14
	 *  lo
	 *                                   hi
	 *  *) lo和hi定位低位和高位下标
	 *  *) 中间位置是 mid = (lo+hi)/2;
	 *  *) mid位置大，hi定位到mid-1
	 *  *) mid位置小，lo定位到mid+1
	 *  *) mid位置找到相等的，mid下标就是结果
	 *  *) 找不到，-(lo+1)，为什么+1，防止lo是0
	 */
	
	public static void main(String[] args) {
		/*
		 * Number是抽象父类
		 * 
		 * Number[]
		 * []
		 * [45]
		 * [23 45 760.7619368204128]
		 *  Double   Integer
		 */
		System.out.println("按回车执行");
		Number[] a = new Number[0];
		while(true) {
			new Scanner(System.in).nextLine();
			Number n = null;
			//随机产生整数，或者是浮点数
			//一半机会产生整数 Integer
			if(Math.random() < 0.5) {
				// 682 自动装箱 Integer
				// 再向上转型成父类型 Number
				n = new Random().nextInt(1000);
			} else {//一半机会产生浮点数 Double
				// 917.72345546 自动装箱 Double
				// 再向上转型成父类型 Number
				double d = Math.random() * 1000;
				//舍入运算，保留1位小数
				d = BigDecimal
						.valueOf(d)
						.setScale(1, BigDecimal.ROUND_HALF_UP)   
						.doubleValue();
				
				n = d;
			}
			//System.out.println(n);
			//二分法查找，在a数组中，查找n的下标位置
			//index是正数，就是插入点
			//index是负数（-(插入点+1)），用-index-1计算插入点
			int index = binarySearch(a, n);
			if(index<0) {
				index = -index-1;
			}
			/* 5
			 * [2,3,3,5,6,8, ]
			 *        i
			 * 5
			 * [2,3,3,5,5,6,8]
			 *        i                         */
			a = Arrays.copyOf(a, a.length+1);
			//index是插入点，把插入点后面的数据，向后挪一位
			System.arraycopy(a,index,a,index+1,a.length-index-1);   
			a[index] = n; //把数据放入插入点位置
			System.out.println(Arrays.toString(a));
		}
	}

	private static int binarySearch(
			Number[] a, Number n) {
		int lo = 0;
		int hi = a.length-1;
		int mid;
		//lo和hi不能交叉，交叉就是找不到
		while(lo<=hi) {
			//中间位置
			mid = (lo+hi)/2;
			//mid位置的值和 n 比较
			if (a[mid].doubleValue() > n.doubleValue()) {
				hi = mid-1;
			} else if(a[mid].doubleValue() < n.doubleValue()) {
				lo = mid+1;
			} else {
				return mid;
			}
		}
		return -(lo+1);
	}
}














